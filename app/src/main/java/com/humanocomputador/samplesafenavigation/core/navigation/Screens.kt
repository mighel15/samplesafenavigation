package com.humanocomputador.samplesafenavigation.core.navigation

import kotlinx.serialization.Serializable

@Serializable
object Login

@Serializable
object MainMenu

@Serializable
object MenuUno

@Serializable
data class MenuUnoResult(val name: String)