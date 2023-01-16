package com.example.saasample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.saasample.R
import com.example.saasample.viewholder.TitleViewHolder
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class TitleAdapter @Inject constructor() : ListAdapter<String, TitleViewHolder>(
    diff
) {
    companion object {
        val diff = object : DiffUtil.ItemCallback<String>() {
            override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem == newItem
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TitleViewHolder {
        return TitleViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.cell_item, parent, false))
    }

    override fun onBindViewHolder(holder: TitleViewHolder, position: Int) {
        holder.bind(item = getItem(position), position = position)
    }
}