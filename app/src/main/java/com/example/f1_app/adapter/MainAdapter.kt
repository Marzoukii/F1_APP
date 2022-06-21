package com.example.f1_app.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.f1_app.model.Pilote
import com.example.f1_app.R
import com.example.f1_app.databinding.PostItemBinding
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.post_item.*
import kotlinx.android.synthetic.main.post_item.view.*
import kotlinx.coroutines.NonDisposableHandle.parent

class MainAdapter: ListAdapter<Pilote,MainAdapter.PiloteRecyclerViewHolder>(PilotesDiffutilCallbak()) {


    class PiloteRecyclerViewHolder(val binding: PostItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    class PilotesDiffutilCallbak : DiffUtil.ItemCallback<Pilote>() {
        override fun areItemsTheSame(oldItem: Pilote, newItem: Pilote): Boolean {
            return oldItem == newItem
        }

        @SuppressLint("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: Pilote, newItem: Pilote): Boolean {
            return oldItem === newItem
        }

    }




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PiloteRecyclerViewHolder {
        val inflater = ContextCompat.getSystemService(
            parent.context,
            LayoutInflater::class.java
        ) as LayoutInflater
        val binding = PostItemBinding.inflate(inflater, parent, false)
        return PiloteRecyclerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PiloteRecyclerViewHolder, position: Int) {
        val item = getItem(position)
        holder.binding.textID.text = item.id.toString()
        holder.binding.titleText.text = item.nomPilote
        holder.binding.description.text = item.description
        Glide.with(holder.binding.root).load(item.photo).into(holder.binding.image)
    }
}