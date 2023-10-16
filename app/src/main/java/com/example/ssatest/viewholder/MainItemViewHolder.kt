package com.example.ssatest.viewholder

import android.view.View
import com.example.ssatest.R
import com.example.ssatest.base.BaseViewHolder
import com.example.ssatest.databinding.CellMainItemBinding
import com.example.ssatest.listener.OnItemClickListener

class MainItemViewHolder(
    private val view: View,
    private val listener: OnItemClickListener<String>?
) : BaseViewHolder<CellMainItemBinding>(view) {
    private lateinit var item: String


    init {
        binding.root.setOnClickListener {
            listener?.onItemClick(item)
        }
    }

    fun bind(item: String) {
        this.item = item
        binding.textViewTitle.text = "Title: $item"
        binding.executePendingBindings()
    }
}