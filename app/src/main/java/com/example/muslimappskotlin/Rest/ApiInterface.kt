package com.example.muslimappskotlin.Rest

import com.example.muslimappskotlin.Model.Ayat
import com.example.muslimappskotlin.Model.Surat
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    @GET("99c279bb173a6e28359c/data")
    fun getData(): Call<List<Surat>>

    @GET("99c279bb173a6e28359c/surat/{nomor}")
    fun getAyat(
        @Path("nomor") nomor: String?
    ): Call<List<Ayat?>?>?

    @GET("api/asmaulhusna")
    fun getAsmaulHusna(): Call<AsmaulHusnaResponse>

    @GET("api/tahlil")
    fun getTahlil(): Call<TahlilResponse>

}