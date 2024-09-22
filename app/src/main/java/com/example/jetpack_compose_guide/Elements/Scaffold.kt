package com.example.jetpack_compose_guide.Elements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.Modifier.*
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun scaffold() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Geeks fo Geeks") },
                modifier = Modifier.background(MaterialTheme.colorScheme.primary)
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /* Your action */ }) {
                Icon(Icons.Filled.Add, contentDescription = "Add")
            }
        },
        content = { paddingValues ->

            Box(modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()) {
                Text("This is the Main Body of the Application", modifier = Modifier.align(Alignment.Center))
            }
        },
        bottomBar = {
            BottomAppBar {
                Text("Bottom Bar")
            }
        }
    )
}