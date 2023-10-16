package com.example.ssatest.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.ssatest.R
import com.example.ssatest.listener.OnItemClickListener
import com.example.ssatest.viewholder.MainItemViewHolder


class MainItemAdapter : ListAdapter<String, MainItemViewHolder>(
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

    private var _listener: OnItemClickListener<String>? = null
    fun setOnItemClickListener(listener: OnItemClickListener<String>) {
        _listener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainItemViewHolder {
        return MainItemViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.cell_main_item, parent, false),
            _listener
        )
    }

    override fun onBindViewHolder(holder: MainItemViewHolder, position: Int) {
        holder.bind(item = getItem(position))
    }
}