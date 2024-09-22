package com.example.jetpack_compose_guide.Elements

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
@Preview(showBackground = true)
fun ViewText(){

    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Hello, World!",
            fontSize = 24.sp,
            color = Color.Magenta,
            textAlign = TextAlign.Right,
            
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(bottom = 5.dp, top = 5.dp),

            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace
                //fontStyle = FontStyle.Italic
            )

        )

        val annotatedString = buildAnnotatedString {
            append("This is a text with ")
            withStyle(
                style = SpanStyle(
                    color = Color.Blue
                )
            ){
                append("style applied to a part")
            }
            append(" of the text.")
        }
        Text(
            text = annotatedString,
            fontSize = 24.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,

        )

        Text(
            text = "Text align to left!, Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            fontSize = 20.sp,
            color = Color.LightGray,
            textAlign = TextAlign.Justify,

            modifier = Modifier.padding(16.dp)
        )
    }
}