package com.example.jetpack_compose_guide.Elements

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_compose_guide.ui.theme.Purple40

@Composable
@Preview
fun siempleFieldText() {
    var text by remember { mutableStateOf("Digit your full name") }
    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Simple TextField") }
    )
}

@Composable
@Preview
fun outlineTextField(){
    var text by remember { mutableStateOf("Digit your full name") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("OutLine TextField") }
    )
}


@Composable
@Preview
fun styledTextField(){
    var value by remember { mutableStateOf("Hello word")}

    TextField(
        value = value,
        onValueChange = {value = it},
        label = { Text("OutLine TextField") },
        maxLines = 2,
        textStyle = TextStyle(
            color = Color.Blue,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        ),
        modifier = Modifier.padding(16.dp)
    )
}
@Composable
@Preview
fun gradient(){

    val gradientColors = listOf(Cyan, Blue, Purple40 /*...*/)

    Text(
        text = "Do not allow people to dim tour shine because they're blinded. Tell them to put some sunglasses on",
        style = TextStyle(
            brush = Brush.linearGradient(
                colors = gradientColors
            )
        )
    )
}

@Composable
@Preview
fun SpecificGradientText(){
    val gradientColors = listOf(Cyan, Blue, Purple40 /*...*/)
    Text(
        text = buildAnnotatedString {
            append("Do not allow people to dim your shine\n")
            withStyle(
                SpanStyle(
                    brush = Brush.linearGradient(
                        colors = gradientColors
                    )
                )
            ) {
                append("because they are blinded.")
            }
            append("\nTell them to put some sunglasses on.")
        }
    )
}

@Composable
@Preview
fun gradientTextField(){
    val gradientColors = listOf(Cyan, Blue, Purple40 /*...*/)
    var text by remember { mutableStateOf("") }
    val brush = remember {
        Brush.linearGradient(
            colors = gradientColors
        )
    }
    TextField(
        value = text, onValueChange = { text = it }, textStyle = TextStyle(brush = brush)
    )
}

@Composable
@Preview
fun passwordField(){
    var password by rememberSaveable { mutableStateOf("") }
    TextField(
        value = password,
        onValueChange = { password = it },
        label = { Text("Enter password") },
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
    )
}