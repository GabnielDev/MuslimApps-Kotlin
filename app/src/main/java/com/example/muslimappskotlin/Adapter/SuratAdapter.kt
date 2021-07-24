package com.example.muslimappskotlin.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.muslimappskotlin.AyatActivity
import com.example.muslimappskotlin.Model.Surat
import com.example.muslimappskotlin.R

class SuratAdapter(val surats: List<Surat>) : RecyclerView.Adapter<SuratAdapter.SuratViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuratViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_surat, parent, false)
        return SuratViewHolder(view)
    }

    override fun getItemCount(): Int {
        return surats.size
    }

    override fun onBindViewHolder(holder: SuratViewHolder, position: Int) {
        holder.txtNomor.setText(surats.get(position).nomor)
        holder.txtAyat.setText(surats.get(position).ayat)
        holder.txtArti.setText(surats.get(position).arti)
        holder.txtName.setText(surats.get(position).nama)

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, AyatActivity::class.java)
            intent.putExtra(AyatActivity.EXTRA_NO, surats.get(position).nomor)
            holder.itemView.context.startActivity(intent)
        }

    }

    class SuratViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtNomor: TextView = itemView.findViewById(R.id.txtNomor)
        var txtAyat: TextView = itemView.findViewById(R.id.txtAyat)
        var txtArti: TextView = itemView.findViewById(R.id.txtInfo)
        var txtName: TextView = itemView.findViewById(R.id.txtName)
    }
}