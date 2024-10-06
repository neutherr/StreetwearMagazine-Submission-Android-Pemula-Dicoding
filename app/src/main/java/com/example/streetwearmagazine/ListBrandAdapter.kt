package com.example.streetwearmagazine

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListBrandAdapter(private val listBrand: ArrayList<Brand>): RecyclerView.Adapter<ListBrandAdapter.ListViewHolder>() {

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvDescription: TextView = itemView.findViewById(R.id.tv_item_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_brand, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listBrand.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val brand = listBrand[position]
        holder.imgPhoto.setImageResource(brand.photo)
        holder.tvName.text = brand.name
        holder.tvDescription.text = brand.description
    }
}
