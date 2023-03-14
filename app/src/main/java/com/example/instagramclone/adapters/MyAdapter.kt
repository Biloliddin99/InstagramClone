package com.example.instagramclone.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramclone.databinding.ItemImageBinding
import com.example.instagramclone.models.Data

class MyAdapter(context: Context, private val list: ArrayList<Data>) :
    RecyclerView.Adapter<MyAdapter.Vh>() {

    inner class Vh(private val itemImageBinding: ItemImageBinding) :
        RecyclerView.ViewHolder(itemImageBinding.root) {

        fun onBind(data: Data) {
            itemImageBinding.recycleImage.setImageResource(data.image)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemImageBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }
}