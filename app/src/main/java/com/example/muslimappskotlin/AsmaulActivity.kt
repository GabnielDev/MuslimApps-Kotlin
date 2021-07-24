package com.example.muslimappskotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.muslimappskotlin.Adapter.AsmaulHusnaAdapter
import com.example.muslimappskotlin.Model.AsmaulHusna
import com.example.muslimappskotlin.Rest.ApiClient
import com.example.muslimappskotlin.Rest.ApiInterface
import com.example.muslimappskotlin.Rest.AsmaulHusnaResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*
import kotlin.collections.ArrayList


class AsmaulActivity : AppCompatActivity() {

    lateinit var rvAsmaul: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asmaul)

        rvAsmaul = findViewById(R.id.rvAsmaul)
        rvAsmaul.setHasFixedSize(true)

        showAsmaulhusna()

    }

    fun showAsmaulhusna() {
        val apiInterface: ApiInterface = ApiClient.getClient1().create(ApiInterface::class.java)
        val listCall: Call<AsmaulHusnaResponse> = apiInterface.getAsmaulHusna()
        listCall.enqueue(object : Callback<AsmaulHusnaResponse> {
            override fun onResponse(
                call: Call<AsmaulHusnaResponse>,
                response: Response<AsmaulHusnaResponse>
            ) {
                val asma = response.body()?.index
                rvAsmaul.layoutManager = LinearLayoutManager(this@AsmaulActivity)
                rvAsmaul.adapter = asma?.let { AsmaulHusnaAdapter(it) }


            }

            override fun onFailure(call: Call<AsmaulHusnaResponse>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })


    }
}
