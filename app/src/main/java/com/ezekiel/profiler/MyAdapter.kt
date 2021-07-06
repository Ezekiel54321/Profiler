package com.ezekiel.profiler

import android.icu.text.Normalizer2
import android.renderscript.ScriptGroup
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ezekiel.profiler.databinding.ItemdemoBinding

class MyAdapter(var items: List<ModelClass>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    inner class MyViewHolder(var binding: ItemdemoBinding): RecyclerView.ViewHolder(binding.root) {

        fun setData(items: ModelClass) {
            binding.profileimg.setImageResource(items.profileimg)
            binding.nameid.text= items.nameid
            binding.messageid.text= items.messageid
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding: ItemdemoBinding= ItemdemoBinding.inflate(LayoutInflater.from(parent.context))
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val items = items[position]
        holder.setData(items)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}