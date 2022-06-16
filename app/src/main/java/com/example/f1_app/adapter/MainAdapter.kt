package com.example.f1_app.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.f1_app.model.Pilote
import com.example.f1_app.R
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.post_item.*
import kotlinx.android.synthetic.main.post_item.view.*

class MainAdapter(var items: List<Pilote>): RecyclerView.Adapter<MainAdapter.PostHolder>() {
    override fun getItemCount() = items.size
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PostHolder(
        LayoutInflater.from(parent.context).inflate(
        R.layout.post_item, parent, false))
    override fun onBindViewHolder(holder: PostHolder, position: Int) { holder.bind(items[position]) }

    inner class PostHolder(override val containerView: View): RecyclerView.ViewHolder(containerView),
        LayoutContainer {
        fun bind(item: Pilote) {
            textID.text = item.id.toString()
            title_text.text = item.nomPilote
            description.text = item.description
            Glide.with(containerView.context).load(item.photo).into(containerView.image)       }
    }
}