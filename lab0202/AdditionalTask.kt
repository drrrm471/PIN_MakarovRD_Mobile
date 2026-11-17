package tasks

/**
 * Дополнительное задание (на оценку «Отлично»).
 *
 * @author Макаров Роман (ПИН-б-о-24-1)
 * @version 1.0
 * @since 2026-11-17
 */
object AdditionalTask {

    /**
     * Обработка пользовательского ввода: числа через запятую или текст.
     *
     * @param input Входная строка (может быть null).
     * @return Map с результатами: для чисел — "sum", "average", "count", "sorted";
     * для текста — "wordCount", "longestWord", "charCount";
     * для null или пустой строки — "error".
     *
     * Пример: processUserInput("1,2,3,4,5") -> {sum=15, average=3.0, count=5, sorted=[1, 2, 3, 4, 5]}
     * Пример: processUserInput("Привет мир") -> {wordCount=2, longestWord=Привет, charCount=9}
     */
    fun processUserInput(input: String?): Map<String, Any> {
        if (input.isNullOrBlank()) {
            return mapOf("error" to "Пустой ввод")
        }

        val numbers = input.split(",").map { it.trim().toIntOrNull() }
        if (numbers.all { it != null }) {
            val values = numbers.filterNotNull()
            return mapOf(
                "sum" to values.sum(),
                "average" to values.average(),
                "count" to values.size,
                "sorted" to values.sorted()
            )
        }

        val words = input.trim().split(" ").filter { it.isNotEmpty() }
        return mapOf(
            "wordCount" to words.size,
            "longestWord" to (words.maxByOrNull { it.length } ?: ""),
            "charCount" to input.count { it != ' ' }
        )
    }
}
