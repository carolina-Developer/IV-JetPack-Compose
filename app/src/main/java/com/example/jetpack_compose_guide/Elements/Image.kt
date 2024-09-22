package com.example.jetpack_compose_guide.Elements

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose_guide.R


@Composable
@Preview
fun Image_Fit() {
    val imageModifier = Modifier
        .size(500.dp)
        .border(BorderStroke(0.1.dp, Color(0xFF6200EE)))
        .background(Color(0x72EE4BC2))
    Image(
        painter = painterResource(id = R.drawable.chalo),
        modifier = imageModifier,
        contentScale = ContentScale.Fit,
        contentDescription = "Image"

    )
}

@Composable
@Preview
fun Image_Crop() {
    Image(
        painter = painterResource(id = R.drawable.chalo),
        contentScale = ContentScale.Inside,
        modifier = Modifier
            .size(250.dp)
            .clip(CircleShape)
            .border(
                BorderStroke(4.dp, Color.Yellow),
    CircleShape
    ),
        contentDescription = "Image",

    )
}

@Composable
@Preview
fun Image_FFillBounds() {
    val imageModifier = Modifier
        .size(200.dp)
        .border(BorderStroke(0.1.dp, Color(0xFF6200EE)))
        .background(Color(0x72EE4BC2))
    Image(
        painter = painterResource(id = R.drawable.chalo),
        modifier = imageModifier,
        contentScale = ContentScale.FillBounds,
        contentDescription = "Image"

    )
}

//@Composable
//@Preview
//fun Image_FillHeight() {
//    val imageModifier = Modifier
//        .size(500.dp)
//    Image(
//        painter = painterResource(id = R.drawable.two),
//        modifier = imageModifier,
//        contentScale = ContentScale.FillHeight
//        ,
//        contentDescription = "Image"
//
//    )
//}

@Composable
@Preview
fun roundedCorner(){
    Image(
        painter = painterResource(id = R.drawable.chalo),
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(200.dp)
            .clip(RoundedCornerShape(20.dp))
            .border(
                BorderStroke(2.dp, Color(0x7EE91E63)),
                RoundedCornerShape(16.dp)
            ),
        contentDescription = "Image"
    )
}

@Composable
@Preview
fun rainbowBorderShape(){

    val borderWidth = 4.dp

    val rainbowColorsBrush = remember {
        Brush.sweepGradient(
            listOf(
                Color(0xFF9575CD),
                Color(0xFFBA68C8),
                Color(0xFFE57373),
                Color(0xFFFFB74D),
                Color(0xFFFFF176),
                Color(0xFFAED581),
                Color(0xFF4DD0E1),
                Color(0xFF9575CD)
            )
        )
    }

    Image(
        painter = painterResource(id = R.drawable.chalo),
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(200.dp)
            .border(
                BorderStroke(borderWidth, rainbowColorsBrush),
                CircleShape
            )
            .padding(borderWidth)
            .clip(CircleShape),
        contentDescription = "Image"
    )
}
