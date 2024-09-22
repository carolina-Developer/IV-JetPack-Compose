package com.example.jetpack_compose_guide.Elements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
@Preview
fun basicColumn(){
    Column {
        Text(
            text = "I",
            fontSize = 48.sp,
            modifier = Modifier
                .background(Color.Yellow)
        )
        Text(
            text = "Love",
            fontSize = 48.sp,
            modifier = Modifier
                .background(Color.Green)
        )
        Text(
            text = "You",
            fontSize = 48.sp,
            modifier = Modifier
                .background(Color.Cyan)
        )
    }
}

@Composable
@Preview
fun arrangementColumn(){
    Column(verticalArrangement = Arrangement.Center) {
        Text(
            text = "One",
            fontSize = 48.sp,
            modifier = Modifier
                .background(Color.Yellow)
        )
        Text(
            text = "Two",
            fontSize = 48.sp,
            modifier = Modifier
                .background(Color.Green)
        )
        Text(
            text = "Three",
            fontSize = 48.sp,
            modifier = Modifier
                .background(Color.Cyan)
        )
    }
}

@Composable
@Preview
fun alignmentColunm(){
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.width(200.dp)) {
        Text(
            text = "One",
            fontSize = 48.sp,
            modifier = Modifier
                .background(Color.Yellow)
        )
        Text(
            text = "Two",
            fontSize = 48.sp,
            modifier = Modifier
                .background(Color.Green)
        )
        Text(
            text = "Three",
            fontSize = 48.sp,
            modifier = Modifier
                .background(Color.Cyan)
        )
    }
}