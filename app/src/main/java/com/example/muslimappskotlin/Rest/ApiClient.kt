package com.example.muslimappskotlin.Rest

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {
    companion object {
        fun getClient() : Retrofit {
            val BASE_URL = "https://api.npoint.io/"
            val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit
        }

       fun getClient1(): Retrofit {
            val BASE_URL = "https://islamic-api-zhirrr.vercel.app/"
            val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit
        }
    }


}