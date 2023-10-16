package com.example.ssatest

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ssatest.adapter.MainItemAdapter
import com.example.ssatest.base.BaseActivity
import com.example.ssatest.base.BaseFragment
import com.example.ssatest.databinding.FragmentHomeBinding
import com.example.ssatest.listener.OnItemClickListener

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home),
    OnItemClickListener<String> {

    private val adapter: MainItemAdapter by lazy {
        MainItemAdapter().apply {
            setOnItemClickListener(this@HomeFragment)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindRecyclerView()
        bindData()
    }

    private fun bindRecyclerView() {
        with(binding) {
            recyclerView.adapter = adapter
            recyclerView.layoutManager = LinearLayoutManager(requireContext())
        }
    }

    private fun bindData() {
        adapter.submitList(buildList())
    }

    private fun buildList(): List<String> = buildList {
        repeat(100) {
            add("$it")
        }
    }

    override fun onItemClick(item: String) {
        findNavController().navigate(R.id.action_main_to_detail)
    }
}