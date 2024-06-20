package com.example.praktisi3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapterPahlawan (private val arrayList: ArrayList<dataClassPahlawan>) : RecyclerView.Adapter<adapterPahlawan.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgView: ImageView = itemView.findViewById(R.id.imgView)
        val textName: TextView = itemView.findViewById(R.id.textNama)
        val textDes: TextView = itemView.findViewById(R.id.textDesk)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v: View = LayoutInflater.from(parent.context).inflate(R.layout.pahlawan_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val (nama, deskripsi, foto) = arrayList[position]
        holder.imgView.setImageResource(foto)
        holder.textName.text = nama
        holder.textDes.text = deskripsi
    }
}