package com.example.ssatest

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.ssatest.base.BaseFragment
import com.example.ssatest.databinding.FragmentDetailBinding

class DetailFragment : BaseFragment<FragmentDetailBinding>(R.layout.fragment_detail) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun back() {
        findNavController().popBackStack()
    }
}