package utils

/**
 * Вспомогательные функции для тестирования.
 *
 * @author Макаров Роман (ПИН-б-о-24-1)
 * @version 1.0
 * @since 2026-11-17
 */
object TestUtils {

    /**
     * Сравнивает полученный результат с ожидаемым и выводит строку проверки.
     *
     * @param name Название проверки.
     * @param actual Полученный результат.
     * @param expected Ожидаемый результат.
     *
     * Пример: check("factorial(0)", 1L, 1L) -> "[OK] factorial(0) = 1"
     */
    fun check(name: String, actual: Any?, expected: Any?) {
        val status = if (actual == expected) "OK" else "ОШИБКА"
        println("[$status] $name = $actual")
    }
}
