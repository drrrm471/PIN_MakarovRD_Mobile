package tasks

import kotlinx.coroutines.*

/**
 * Блок задач по корутинам в Kotlin.
 *
 * @author Макаров Роман (ПИН-б-о-24-1)
 * @version 1.0
 * @since 2026-11-17
 */
object Coroutines {

    /**
     * Задача 4.1. Асинхронная задержка с выводом сообщений.
     *
     * @param message Сообщение для вывода.
     * @param delayMs Время задержки в миллисекундах.
     *
     * Пример: delayedPrint("Начинаем...", 2000L) -> "Начинаем...", пауза 2 с, "Готово!"
     */
    suspend fun delayedPrint(message: String, delayMs: Long) {
        println(message)
        delay(delayMs)
        println("Готово!")
    }

    /**
     * Задача 4.2. Параллельное выполнение трёх задач.
     *
     * Запускает три асинхронные задачи с задержками 1с, 2с, 3с.
     * Возвращает список результатов в порядке завершения.
     *
     * @return Список строк с результатами.
     *
     * Пример: runParallelTasks() -> [Результат 1, Результат 2, Результат 3]
     */
    suspend fun runParallelTasks(): List<String> = coroutineScope {
        val results = mutableListOf<String>()

        val task1 = async {
            delay(1000L)
            results.add("Результат 1")
        }
        val task2 = async {
            delay(2000L)
            results.add("Результат 2")
        }
        val task3 = async {
            delay(3000L)
            results.add("Результат 3")
        }

        task1.await()
        task2.await()
        task3.await()
        results
    }
}
