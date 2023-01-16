package com.example.saasample.sub

import android.os.Bundle
import android.view.View
import com.example.saasample.R
import com.example.saasample.base.BaseFragment
import com.example.saasample.databinding.FragmentSubBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SubFragment : BaseFragment<FragmentSubBinding>(R.layout.fragment_sub) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}