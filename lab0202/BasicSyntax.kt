package tasks

/**
 * Блок задач по базовому синтаксису Kotlin.
 *
 * @author Макаров Роман (ПИН-б-о-24-1)
 * @version 1.0
 * @since 2026-11-17
 */
object BasicSyntax {

    /**
     * Задача 1.1. Приветствие пользователя.
     *
     * Возвращает строку с приветствием и возрастом через 10 лет.
     *
     * @param name Имя пользователя.
     * @param age Текущий возраст.
     * @return Строка с приветствием.
     *
     * Пример: greetUser("Анна", 25) -> "Привет, Анна! Через 10 лет тебе будет 35 лет."
     */
    fun greetUser(name: String, age: Int): String {
        return "Привет, $name! Через 10 лет тебе будет ${age + 10} лет."
    }

    /**
     * Задача 1.2. Определение времени года по номеру месяца.
     *
     * @param month Номер месяца (1–12).
     * @return Название времени года или "Некорректный месяц".
     *
     * Пример: getSeason(3) -> "Весна"
     */
    fun getSeason(month: Int): String {
        return when (month) {
            12, 1, 2 -> "Зима"
            3, 4, 5 -> "Весна"
            6, 7, 8 -> "Лето"
            9, 10, 11 -> "Осень"
            else -> "Некорректный месяц"
        }
    }

    /**
     * Задача 1.3. Вычисление факториала (рекурсия).
     *
     * @param n Число (≥ 0).
     * @param accumulator Накопленное произведение (по умолчанию 1).
     * @return Факториал числа или -1 для отрицательных значений.
     *
     * Пример: factorial(5) -> 120
     */
    tailrec fun factorial(n: Int, accumulator: Long = 1L): Long {
        if (n < 0) return -1
        if (n <= 1) return accumulator
        return factorial(n - 1, accumulator * n)
    }
}
