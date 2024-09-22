package com.example.jetpack_compose_guide.Elements

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose_guide.R

@Composable
@Preview
fun SurfaceSample() {
    Column() {
        Surface(
            modifier = Modifier
                .height(100.dp)
                .padding(10.dp),
            color = Color.Yellow,
            shape = CutCornerShape(10.dp),
            border = BorderStroke(1.dp, Color.Green),

        ) {
            Image(
                painter = painterResource(id = R.drawable.chalo),
                contentDescription = null,
            )
        }
    }
}