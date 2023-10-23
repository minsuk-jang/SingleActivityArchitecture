package com.example.ssatest

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.example.ssatest.base.BaseFragment
import com.example.ssatest.databinding.FragmentDetailBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class DetailFragment : BaseFragment<FragmentDetailBinding>(R.layout.fragment_detail) {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        //requireActivity().findViewById<BottomNavigationView>(R.id.bottom_navigation_view)?.isVisible = false
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDetach() {
        super.onDetach()
        //requireActivity().findViewById<BottomNavigationView>(R.id.bottom_navigation_view)?.isVisible = true
    }

    override fun back() {
        findNavController().popBackStack()
    }
}