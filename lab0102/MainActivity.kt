package com.example.hello

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hello.ui.theme.HelloTheme

/**
 * Главная Activity приложения на Jetpack Compose.
 * Отображает экран с приветствием и информацией о пользователе.
 *
 * @author Макаров Роман (ПИН-б-о-24-1)
 * @version 1.0
 * @since 2026-10-18
 */
class MainActivity : ComponentActivity() {

    /**
     * Вызывается при создании Activity.
     * Устанавливает Compose-содержимое экрана.
     *
     * @param savedInstanceState Сохранённое состояние (если есть)
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(
                        name = "Макаров Роман",
                        group = "Группа ПИН-б-о-24-1"
                    )
                }
            }
        }
    }
}

/**
 * Composable-функция, отображающая приветствие, имя и группу пользователя.
 *
 * @param name Имя пользователя.
 * @param group Группа пользователя.
 * @param modifier Модификатор для настройки внешнего вида.
 *
 * @author Макаров Роман (ПИН-б-о-24-1)
 * @since 2026-10-18
 */
@Composable
fun Greeting(name: String, group: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFE3F2FD))
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Моё первое приложение",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF0D47A1)
        )
        Text(
            text = name,
            fontSize = 20.sp,
            color = Color(0xFF1976D2)
        )
        Text(
            text = group,
            fontSize = 16.sp,
            color = Color.DarkGray
        )
    }
}

/**
 * Предпросмотр UI в Android Studio.
 * Позволяет видеть изменения без запуска эмулятора.
 */
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloTheme {
        Greeting(
            name = "Макаров Роман",
            group = "Группа ПИН-б-о-24-1"
        )
    }
}
