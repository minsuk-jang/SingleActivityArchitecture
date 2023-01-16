package com.example.saasample.viewholder

import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<T : ViewDataBinding, V : Any>(private val view: View) :
    RecyclerView.ViewHolder(view) {
    private var _binding: T? = DataBindingUtil.bind(view)
    protected val binding get() = _binding!!

    private lateinit var _item: V

    open fun bind(item: V, position: Int) {
        _item = item
    }

    protected fun bind(block: T.() -> Unit){
        block(binding)
    }
}