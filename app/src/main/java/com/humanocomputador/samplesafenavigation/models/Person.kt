package com.humanocomputador.samplesafenavigation.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Parcelize
@Serializable
data class Person(
    val name: String,
    val profession: String,
    val age: String
): Parcelable
