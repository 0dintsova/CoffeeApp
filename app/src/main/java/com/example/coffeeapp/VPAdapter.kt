package com.example.coffeeapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class VPAdapter(arrayOfImages: Array<Int>) : RecyclerView.Adapter<VPAdapter.ViewHolder>() {

    val images = listOf(arrayOfImages.last()) + arrayOfImages + listOf(arrayOfImages.first())


    class ViewHolder(item : View): RecyclerView.ViewHolder(item) {
        var imageView = item.findViewById<View>(R.id.image_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_vp, parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setBackgroundResource(images[position])

    }

    override fun getItemCount(): Int {
        return images.size
    }

}
