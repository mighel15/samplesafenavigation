package com.humanocomputador.samplesafenavigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MainMenuScreen (navigateToMenuDos:()-> Unit, navigateToMenuUno: ()->Unit) {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "MAIN MENU SCREEN")
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = { navigateToMenuUno() }) {
            Text(text = "Go to menu uno")
        }
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = { navigateToMenuDos() }) {
            Text(text = "Go to menu dos")
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview(showSystemUi = true)
@Composable
fun MainMenuScreenPreview(){
    MainMenuScreen({},{})
}