package tasks

/**
 * Блок задач по работе с коллекциями и функциями высшего порядка.
 *
 * @author Макаров Роман (ПИН-б-о-24-1)
 * @version 1.0
 * @since 2026-11-17
 */
object Collections {

    /**
     * Задача 3.1. Вычисление среднего возраста.
     *
     * @param people Список людей.
     * @return Средний возраст или 0.0 для пустого списка.
     *
     * Пример: averageAge(listOf(Person("Анна", 25), Person("Иван", 30))) -> 27.5
     */
    fun averageAge(people: List<Person>): Double {
        if (people.isEmpty()) return 0.0
        return people.map { it.age }.average()
    }

    /**
     * Задача 3.2. Группировка слов по первой букве.
     *
     * @param words Список слов.
     * @return Map с группировкой по первой букве (в верхнем регистре).
     *
     * Пример: groupByFirstLetter(listOf("apple", "apricot", "banana")) ->
     *         {'A' -> ["apple", "apricot"], 'B' -> ["banana"]}
     */
    fun groupByFirstLetter(words: List<String>): Map<Char, List<String>> {
        return words.groupBy { it.first().uppercaseChar() }
    }

    /**
     * Задача 3.3. Поиск самого длинного слова.
     *
     * @param words Список слов.
     * @return Самое длинное слово или null для пустого списка.
     *
     * Пример: findLongestWord(listOf("apple", "banana", "pineapple")) -> "pineapple"
     */
    fun findLongestWord(words: List<String>): String? {
        return words.maxByOrNull { it.length }
    }
}
