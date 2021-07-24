package com.example.muslimappskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.muslimappskotlin.Adapter.SuratAdapter
import com.example.muslimappskotlin.Model.Surat
import com.example.muslimappskotlin.Rest.ApiClient
import com.example.muslimappskotlin.Rest.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class QuranActivity : AppCompatActivity() {

    lateinit var rvSurat: RecyclerView
    lateinit var surats: List<Surat>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quran)

        rvSurat = findViewById(R.id.rvSurat)
        rvSurat.setHasFixedSize(true)

        showSurat()

    }

    fun showSurat() {
        val apiInterface: ApiInterface = ApiClient.getClient().create(ApiInterface::class.java)
        val listCall: Call<List<Surat>> = apiInterface.getData()
        listCall.enqueue(object : Callback<List<Surat>>{
            override fun onResponse(call: Call<List<Surat>>, response: Response<List<Surat>>) {
                surats = response.body()!!
                rvSurat.layoutManager = LinearLayoutManager(this@QuranActivity)
                rvSurat.adapter = SuratAdapter(surats)


            }
            override fun onFailure(call: Call<List<Surat>>, t: Throwable) {
            }
        })


    }

}