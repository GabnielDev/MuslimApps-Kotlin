package com.example.muslimappskotlin.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.codesgood.views.JustifiedTextView
import com.example.muslimappskotlin.Model.Ayat
import com.example.muslimappskotlin.R

class AyatAdapter(val ayats: List<Ayat>) : RecyclerView.Adapter<AyatAdapter.AyatViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AyatViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_ayat, parent, false)
        return AyatViewHolder(view)
    }

    override fun getItemCount(): Int {
        return ayats.size
    }

    override fun onBindViewHolder(holder: AyatViewHolder, position: Int) {
        holder.txtNomor.setText(ayats.get(position).nomor)
        holder.txtArabic.setText(ayats.get(position).ar)
        holder.txtTranslation.setText(ayats.get(position).id)
    }

    class AyatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtNomor: TextView = itemView.findViewById(R.id.txtNomor)
        var txtArabic: TextView = itemView.findViewById(R.id.txtArabic)
        var txtTranslation: JustifiedTextView = itemView.findViewById(R.id.txtTranslation)
    }

}