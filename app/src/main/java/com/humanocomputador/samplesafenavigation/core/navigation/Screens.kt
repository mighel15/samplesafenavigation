package com.humanocomputador.samplesafenavigation.core.navigation

import com.humanocomputador.samplesafenavigation.models.Person
import kotlinx.serialization.Serializable

@Serializable
object Login

@Serializable
object MainMenu

@Serializable
object MenuUno

@Serializable
data class MenuUnoResult(val name: String)

@Serializable
object MenuDos

@Serializable
data class MenuDosResult(val person: Person)