package com.example.jetpack_compose_guide.Elements

import android.graphics.drawable.Icon
import android.widget.Button
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.*
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose_guide.R

@Composable
@Preview
fun basicButton() {
    ElevatedButton(
        onClick = { /* Do something! */ },
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),

        colors =  ButtonDefaults.buttonColors(
            contentColor = Color.White,
            containerColor = Color(0xFF6200EE),
            disabledContentColor = Color(0xFF9E9E9E)
        ),
        shape = RoundedCornerShape(8.dp),
        elevation = ButtonDefaults.elevatedButtonElevation(
            defaultElevation = 70.dp,
            pressedElevation = 16.dp
        ),
        enabled = true, // or false to desable the button
        interactionSource = remember { MutableInteractionSource() },
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 12.dp),
        border = BorderStroke(0.5.dp, Color.Gray)
    ){
        Text(
            text = "Click me!",
            style = MaterialTheme.typography.bodyMedium
        )
    }


}

@Composable
@Preview
fun extendedFAB(){
    ExtendedFloatingActionButton(
        onClick = { /* Do something! */ },
        icon = {
            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = "Edit"
            )
        },
        text = { Text("Upload") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp, horizontal = 20.dp),
        elevation = FloatingActionButtonDefaults.elevation(
            defaultElevation = 8.dp,
            pressedElevation = 12.dp
        )
    )
}

@Composable
@Preview
fun largeButton(){
        LargeFloatingActionButton(
            onClick = { /* Do something! */ },
            shape = CircleShape,
        ) {
            Icon(
                imageVector = Icons.Default.Call,
                contentDescription = "Call"
            )
        }
}

@Composable
@Preview
fun micWhatsappButton(){
    LargeFloatingActionButton(
        onClick = { /*TODO*/ },
        containerColor = Color(0xFF0CE95F),
        shape = CircleShape
    ) {
        Icon(
            painter = painterResource(id = R.drawable.baseline_mic_24),
            contentDescription = "Mic",
            modifier = Modifier.size(50.dp)
        )
    }
}