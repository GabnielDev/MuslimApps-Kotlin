package com.example.muslimappskotlin.Model

import com.google.gson.annotations.SerializedName

data class Ayat(
    @field: SerializedName("ar")
    val ar: String?,
    @field: SerializedName("id")
    val id: String?,
    @field: SerializedName("tr")
    val tr: String?,
    @field: SerializedName("nomor")
    val nomor: String?
)