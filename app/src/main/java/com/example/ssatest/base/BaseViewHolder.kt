package com.example.ssatest.base

import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<VB : ViewDataBinding>(private val view: View) :
    RecyclerView.ViewHolder(view) {
    private val _binding: VB? = DataBindingUtil.bind<VB>(view)
    protected val binding get() = _binding!!

}