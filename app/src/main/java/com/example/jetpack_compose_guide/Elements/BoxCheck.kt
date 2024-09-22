package com.example.jetpack_compose_guide.Elements

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun CheckboxLabel() {
    var checked by remember { mutableStateOf(true) }

    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            "Treatment of my personal data."
        )
        Checkbox(
            checked = checked,
            onCheckedChange = { checked = it }
        )
    }

    Text(
        if (checked) "Checkbox is checked" else "Checkbox is unchecked"
    )
}