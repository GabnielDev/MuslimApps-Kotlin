package com.example.muslimappskotlin.Rest

import com.example.muslimappskotlin.Model.Tahlil
import com.google.gson.annotations.SerializedName

data class TahlilResponse (
    @SerializedName("data")
    val id: List<Tahlil>
)