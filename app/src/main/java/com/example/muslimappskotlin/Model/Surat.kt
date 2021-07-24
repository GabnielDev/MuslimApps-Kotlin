package com.example.muslimappskotlin.Model

import com.google.gson.annotations.SerializedName

data class Surat(
    @field: SerializedName("arti")
    val arti: String,
    @field: SerializedName("asma")
    val asma: String,
    @field: SerializedName("ayat")
    val ayat: String,
    @field: SerializedName("nama")
    val nama: String,
    @field: SerializedName("type")
    val type: String,
    @field: SerializedName("urut")
    val urut: String,
    @field: SerializedName("audio")
    val audio: String,
    @field: SerializedName("nomor")
    val nomor: String,
    @field: SerializedName("rukuk")
    val rukuk: String,
    @field: SerializedName("keterangan")
    val keterangan: String

)