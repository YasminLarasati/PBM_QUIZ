package com.example.praktisi3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapterUniversitas (private val dataList: ArrayList<dataClassUniversitas>): RecyclerView.Adapter<adapterUniversitas.ViewHolderClass>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.univ_layout, parent, false)
        return ViewHolderClass(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem = dataList[position]
        holder.rvImage1.setImageResource(currentItem.dataImage)
        holder.rvUniv1.text = currentItem.dataTitle1
        holder.rvAlamat1.text = currentItem.dataTitle2
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class ViewHolderClass(itemView: View): RecyclerView.ViewHolder(itemView) {
        val rvImage1: ImageView = itemView.findViewById(R.id.image1)
        val rvUniv1: TextView = itemView.findViewById(R.id.univ1)
        val rvAlamat1: TextView = itemView.findViewById(R.id.alamat1)
    }
}