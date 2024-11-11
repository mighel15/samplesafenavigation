package com.humanocomputador.samplesafenavigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.humanocomputador.samplesafenavigation.models.Person


@Composable
fun MenuDosResultScreen(person: Person, navigateToMainMenu:()->Unit) {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {

        Spacer(modifier = Modifier.weight(1f))
        Text(text = "MAIN MENU SCREEN")
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "Name ${person.name}")
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "Profession ${person.profession}")
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "Age ${person.age}")
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = { navigateToMainMenu()  }) {
            Text(text = "Go to menu")
        }
    }
}