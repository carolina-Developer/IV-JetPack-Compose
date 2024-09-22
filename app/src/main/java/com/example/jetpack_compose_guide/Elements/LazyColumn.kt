package com.example.jetpack_compose_guide.Elements

import android.media.RouteListingPreference
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp



@Preview
@Composable

fun SimpleLazyColumn() {
    // Crea una lista de números del 1 al 20
    val itemsList = (1..20).toList()

    // LazyColumn para mostrar la lista de números
    LazyColumn(
        modifier = Modifier.fillMaxSize()  // Ocupa todo el espacio disponible
    ) {
        // Itera sobre la lista y muestra cada número
        items(itemsList) { item ->
            // Cada ítem se mostrará como texto dentro de una fila
            Text(
                text = "Ítem $item",  // Muestra el número actual
                modifier = Modifier
                    .fillMaxWidth()  // El texto ocupará todo el ancho
                    .padding(16.dp),  // Padding alrededor del texto

            )
        }
    }
}


