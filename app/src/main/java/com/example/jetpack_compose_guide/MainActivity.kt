package com.example.jetpack_compose_guide

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpack_compose_guide.Elements.ViewText
import com.example.jetpack_compose_guide.Elements.ViewText
import com.example.jetpack_compose_guide.Elements.alignmentRow
import com.example.jetpack_compose_guide.ui.theme.Jetpack_Compose_GuideTheme


class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Jetpack_Compose_GuideTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    ViewText()
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewMainActivity() {
    Jetpack_Compose_GuideTheme {
        LazyColumn {
            item {
                ViewText()
            }
            item {
                alignmentRow()
            }
        }
    }
}


