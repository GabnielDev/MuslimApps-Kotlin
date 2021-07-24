package com.example.muslimappskotlin.Model

import com.google.gson.annotations.SerializedName

data class AsmaulHusna (
    @SerializedName("index")
    val index: String,
    @SerializedName("latin")
    val latin: String,
    @SerializedName("arabic")
    val arabic: String,
    @SerializedName("translation_id")
    val translation_id: String,
    @SerializedName("translation_en")
    val translation_en: String
)