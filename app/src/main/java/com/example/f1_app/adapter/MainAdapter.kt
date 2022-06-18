package com.example.f1_app.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.f1_app.model.Pilote
import com.example.f1_app.R
import com.example.f1_app.databinding.PostItemBinding
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.post_item.*
import kotlinx.android.synthetic.main.post_item.view.*
import kotlinx.coroutines.NonDisposableHandle.parent

class MainAdapter(var items: List<Pilote>): RecyclerView.Adapter<MainAdapter.PostHolder>() {
    override fun getItemCount() = items.size
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = PostItemBinding.inflate(inflater, parent, false)
        return PostHolder(binding)
    }
    override fun onBindViewHolder(holder: PostHolder, position: Int) { holder.bind(items[position]) }

    inner class PostHolder(private val postItemBinding: PostItemBinding) :
        RecyclerView.ViewHolder(postItemBinding.root) {
        fun bind(item: Pilote) {
            postItemBinding.textID.text = item.id.toString()
            postItemBinding.titleText.text = item.nomPilote
            postItemBinding.description.text = item.description
            Glide.with(postItemBinding.root).load(item.photo).into(postItemBinding.image)       }
    }
}