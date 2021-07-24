package com.example.muslimappskotlin.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.muslimappskotlin.Model.AsmaulHusna
import com.example.muslimappskotlin.R
import com.example.muslimappskotlin.Rest.AsmaulHusnaResponse

class AsmaulHusnaAdapter(val asmaulHusnas: List<AsmaulHusna>) : RecyclerView.Adapter<AsmaulHusnaAdapter.AsmaulHusnaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AsmaulHusnaViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_asmaulhusna, parent, false)
        return AsmaulHusnaViewHolder(view)
    }

    override fun getItemCount(): Int {
        return asmaulHusnas.size
    }

    override fun onBindViewHolder(holder: AsmaulHusnaViewHolder, position: Int) {
        holder.txtIndex.setText(asmaulHusnas.get(position).index)
        holder.txtLatin.setText(asmaulHusnas.get(position).latin)
        holder.txtArabic.setText(asmaulHusnas.get(position).arabic)
        holder.txtTranslation.setText(asmaulHusnas.get(position).translation_id)
    }

    class AsmaulHusnaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtIndex: TextView = itemView.findViewById(R.id.txtIndex)
        var txtLatin: TextView = itemView.findViewById(R.id.txtLatin)
        var txtArabic: TextView = itemView.findViewById(R.id.txtArabic)
        var txtTranslation: TextView = itemView.findViewById(R.id.txtTranslation)

    }

}