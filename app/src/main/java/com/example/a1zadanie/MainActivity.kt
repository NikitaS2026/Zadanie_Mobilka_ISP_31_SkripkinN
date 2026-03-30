package com.example.a1zadanie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            MaterialTheme {
                MainSplashScreen()
            }
        }
    }

}

@Composable
fun MainSplashScreen() {
    val mainGradient = Brush.verticalGradient(
        colors = listOf(
            Color(0xFFA5F1BB),
            Color(0xFF81D4FA)
        )
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(mainGradient),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
//Ради утяжеления задания решил написаить калькулятор кодом
            CalculatorVectorIcon()
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "SIMPLE CALCULATOR",
                color = Color.White,
                fontSize = 20.sp,
                letterSpacing = 1.5.sp,
                fontWeight = FontWeight.Medium,
                style = MaterialTheme.typography.labelLarge
            )
        }
    }

}

@Composable
fun CalculatorVectorIcon() {
//внешность калькулятора и границы
    Column(
        modifier = Modifier
            .size(120.dp)
            .border(5.dp, Color.White, RoundedCornerShape(8.dp))
            .padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(25.dp)
                .background(Color.White.copy(alpha = 0.3f), RoundedCornerShape(4.dp))
                .border(2.dp, Color.White, RoundedCornerShape(4.dp))
        )

//  типо кнопки на калькуляторе
        repeat(3) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                repeat(3) {
                    Box(
                        modifier = Modifier
                            .size(width = 24.dp, height = 14.dp)
                            .background(Color.White, RoundedCornerShape(2.dp))
                    )
                }
            }
        }
    }
}