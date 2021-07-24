package com.example.muslimappskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.muslimappskotlin.Model.Tahlil
import com.example.muslimappskotlin.Rest.ApiClient
import com.example.muslimappskotlin.Rest.ApiInterface
import com.example.muslimappskotlin.Rest.TahlilResponse
import com.example.muslimappskotlin.Adapter.TahlilAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TahlilActivity : AppCompatActivity() {

    lateinit var rvTahlil: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tahlil)

        rvTahlil = findViewById(R.id.rv_tahlil)
        rvTahlil.setHasFixedSize(true)

        showTahlil()
    }

    fun showTahlil() {
        val apiInterface: ApiInterface = ApiClient.getClient1().create(ApiInterface::class.java)
        val call: Call<TahlilResponse> = apiInterface.getTahlil()
        call.enqueue(object : Callback<TahlilResponse> {
            override fun onResponse(
                call: Call<TahlilResponse>,
                response: Response<TahlilResponse>
            ) {
               val tahlil = response.body()?.id
                rvTahlil.layoutManager = LinearLayoutManager(this@TahlilActivity)
                rvTahlil.adapter = tahlil?.let { TahlilAdapter(it) }
            }

            override fun onFailure(call: Call<TahlilResponse>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })
    }
}