package com.example.muslimappskotlin.Model

import com.google.gson.annotations.SerializedName

data class Tahlil (
    @SerializedName("id")
    val id: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("arabic")
    val arabic: String,
    @SerializedName("translation")
    val translation: String
)