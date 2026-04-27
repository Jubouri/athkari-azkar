package com.athkari.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.*
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            val azkar = listOf(
                "سبحان الله",
                "الحمد لله",
                "الله أكبر",
                "لا إله إلا الله",
                "أستغفر الله"
            )

            var text by remember { mutableStateOf(azkar.random()) }

            MaterialTheme {
                Surface {

                    Button(onClick = {
                        text = azkar[Random.nextInt(azkar.size)]
                    }) {
                        Text(text)
                    }

                }
            }
        }
    }
}
