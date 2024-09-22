package com.example.jetpack_compose_guide.Elements

import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview

fun outlineButton() {
    OutlinedButton(
        onClick = { /* Do something! */ }
    ){
        Text(
            text = "Click me!",
        )
    }
}
