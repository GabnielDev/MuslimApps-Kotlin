package com.example.muslimappskotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.muslimappskotlin.Adapter.AyatAdapter
import com.example.muslimappskotlin.Model.Ayat
import com.example.muslimappskotlin.Rest.ApiClient
import com.example.muslimappskotlin.Rest.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AyatActivity : AppCompatActivity() {


    lateinit var rvAyat: RecyclerView
    lateinit var ayats: List<Ayat>
    lateinit var path: String

    companion object {
        const val EXTRA_NO = "path"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ayat)

        rvAyat = findViewById(R.id.rvAyat)
        rvAyat.setHasFixedSize(true)

        showAyat()

    }

    fun showAyat() {
        path = intent.getStringExtra("path").toString()
        val apiInterface: ApiInterface = ApiClient.getClient().create(ApiInterface::class.java)
        val listcall: Call<List<Ayat?>?>? = apiInterface.getAyat(path)
        listcall?.enqueue(object : Callback<List<Ayat?>?> {
            override fun onFailure(call: Call<List<Ayat?>?>, t: Throwable) {
            }

            override fun onResponse(call: Call<List<Ayat?>?>, response: Response<List<Ayat?>?>) {
                if (response.isSuccessful) {
                    ayats = (response.body() as List<Ayat>?)!!
                    rvAyat.layoutManager = LinearLayoutManager(this@AyatActivity)
                    rvAyat.adapter = AyatAdapter(ayats)

                }
            }
        })

    }

}


