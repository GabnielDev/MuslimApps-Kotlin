package com.example.muslimappskotlin.Rest

import com.example.muslimappskotlin.Model.AsmaulHusna
import com.google.gson.annotations.SerializedName

data class AsmaulHusnaResponse(
    @SerializedName("data")
    val index: List<AsmaulHusna>

)

