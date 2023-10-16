package com.example.ssatest.listener

interface OnItemClickListener<T : Any> {
    fun onItemClick(item: T)
}