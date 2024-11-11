package com.humanocomputador.samplesafenavigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.humanocomputador.samplesafenavigation.models.Person

@Composable
fun MenuDosScreen(navigateToMenuDosFinish: (Person) -> Unit) {
    var name by remember { mutableStateOf("") }
    var profession by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "MAIN MENU SCREEN")
        Spacer(modifier = Modifier.weight(1f))
        TextField(value = name, onValueChange = { name = it })
        Spacer(modifier = Modifier.weight(1f))
        TextField(value = profession, onValueChange = { profession = it })
        Spacer(modifier = Modifier.weight(1f))
        TextField(value = age, onValueChange = { age = it })
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = { navigateToMenuDosFinish(Person(name, profession, age)) }) {
            Text(text = "Go to menu uno")
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}