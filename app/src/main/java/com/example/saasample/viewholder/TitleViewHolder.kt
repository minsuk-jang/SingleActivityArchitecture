package com.example.saasample.viewholder

import android.view.View
import com.example.saasample.databinding.CellItemBinding


class TitleViewHolder(private val view : View): BaseViewHolder<CellItemBinding,String>(view){
    override fun bind(item: String, position: Int) {
        super.bind(item, position)

    }
}