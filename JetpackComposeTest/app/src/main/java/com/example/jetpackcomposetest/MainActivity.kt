package com.example.jetpackcomposetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Columnを使用すると、View縦に並べられる
            Column {
                Text("Hello World!")
                Greet("John Doe")
            }
        }
    }
}

/**
 * 挨拶文を表示するコンポーネント
 * @param aName 挨拶する相手の名前
 */
@Composable
fun Greet(aName: String) {
    Text("こんにちは、${aName}さん")
}

/**
 * Previewアノテーションを付けると、レイアウトをプレビューできる
 */
@Preview
@Composable
fun PreviewGreet() {
    Greet("sample_name")
}