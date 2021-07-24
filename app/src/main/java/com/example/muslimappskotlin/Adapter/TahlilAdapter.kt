package com.example.muslimappskotlin.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.muslimappskotlin.Model.Tahlil
import com.example.muslimappskotlin.R

class TahlilAdapter (val tahlis: List<Tahlil>) : RecyclerView.Adapter<TahlilAdapter.TahlilViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TahlilViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_tahlil, parent, false)
        return TahlilViewHolder(view)
    }

    override fun getItemCount(): Int {
        return tahlis.size
    }

    override fun onBindViewHolder(holder: TahlilViewHolder, position: Int) {
        holder.txtNomor.setText(tahlis.get(position).id)
        holder.txtTitle.setText(tahlis.get(position).title)
        holder.txtArabic.setText(tahlis.get(position).arabic)
        holder.txtTranslation.setText(tahlis.get(position).translation)
    }

    class TahlilViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtNomor: TextView = itemView.findViewById(R.id.txtNomor)
        var txtTitle: TextView = itemView.findViewById(R.id.txtTitle)
        var txtArabic: TextView = itemView.findViewById(R.id.txtTitle)
        var txtTranslation: TextView = itemView.findViewById(R.id.txtTranslation)

    }

}