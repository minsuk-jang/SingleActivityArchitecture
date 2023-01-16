package com.example.saasample.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.saasample.R
import com.example.saasample.adapter.TitleAdapter
import com.example.saasample.base.BaseFragment
import com.example.saasample.databinding.FragmentMainBinding
import com.example.saasample.extension.repeatOnLifecycle
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : BaseFragment<FragmentMainBinding>(R.layout.fragment_main) {
    private val vm: MainFragmentViewModel by viewModels()

    @Inject
    lateinit var adapter: TitleAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindRecyclerView()

        initLoad()
        observe()
    }

    private fun initLoad() {
        vm.load()
    }

    private fun bindRecyclerView() {
        bind {
            with(recyclerView) {
                adapter = this@MainFragment.adapter
                layoutManager = LinearLayoutManager(requireContext())

            }
        }
    }

    private fun observe() {
        repeatOnLifecycle {
            launch {
                vm.items.collectLatest {
                    adapter.submitList(it)
                }
            }
        }
    }

}