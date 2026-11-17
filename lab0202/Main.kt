import tasks.*
import utils.TestUtils.check
import kotlinx.coroutines.runBlocking

/**
 * Точка входа в приложение.
 * Содержит тесты для всех задач.
 *
 * @author Макаров Роман (ПИН-б-о-24-1)
 * @version 1.0
 * @since 2026-11-17
 */
fun main() {
    println("=== Тестирование лабораторной работы №2 ===\n")

    // Тестирование задач блока 1 (Базовый синтаксис)
    println("--- Блок 1. Базовый синтаксис ---")
    println(BasicSyntax.greetUser("Анна", 25)) // ожидается "Привет, Анна! Через 10 лет тебе будет 35 лет."
    println(BasicSyntax.getSeason(3))         // ожидается "Весна"
    println(BasicSyntax.factorial(5))         // ожидается 120
    check("getSeason(12)", BasicSyntax.getSeason(12), "Зима")
    check("getSeason(13)", BasicSyntax.getSeason(13), "Некорректный месяц")
    check("factorial(0)", BasicSyntax.factorial(0), 1L)
    check("factorial(-3)", BasicSyntax.factorial(-3), -1L)
    println()

    // Тестирование задач блока 2 (Null-безопасность)
    println("--- Блок 2. Null-безопасность ---")
    println(NullSafety.parseIntSafe("123"))   // ожидается 123
    println(NullSafety.parseIntSafe("abc"))   // ожидается null
    println(NullSafety.filterNonNullAndDouble(listOf(1, null, 3, null, 5))) // ожидается [2, 6, 10]
    check("parseIntSafe(null)", NullSafety.parseIntSafe(null), null)
    println()

    // Тестирование задач блока 3 (Коллекции)
    println("--- Блок 3. Коллекции ---")
    val people = listOf(Person("Анна", 25), Person("Иван", 30), Person("Мария", 35))
    println(Collections.averageAge(people))   // ожидается 30.0
    println(Collections.groupByFirstLetter(listOf("apple", "apricot", "banana"))) // ожидается {A=[apple, apricot], B=[banana]}
    println(Collections.findLongestWord(listOf("apple", "banana", "pineapple"))) // ожидается "pineapple"
    check("averageAge([])", Collections.averageAge(emptyList()), 0.0)
    check("findLongestWord([])", Collections.findLongestWord(emptyList()), null)
    println()

    // Тестирование задач блока 4 (Корутины)
    println("--- Блок 4. Корутины ---")
    runBlocking {
        Coroutines.delayedPrint("Начинаем...", 2000L)
        println(Coroutines.runParallelTasks()) // ожидается ["Результат 1", "Результат 2", "Результат 3"]
    }
    println()

    // Тестирование дополнительного задания
    println("--- Дополнительное задание ---")
    println(AdditionalTask.processUserInput("5,3,1,4,2")) // ожидается {sum=15, average=3.0, count=5, sorted=[1, 2, 3, 4, 5]}
    println(AdditionalTask.processUserInput("Kotlin очень выразительный язык")) // ожидается {wordCount=4, longestWord=выразительный, charCount=28}
    println(AdditionalTask.processUserInput(null)) // ожидается {error=Пустой ввод}
}
