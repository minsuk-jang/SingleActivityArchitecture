package com.example.saasample.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainFragmentViewModel @Inject constructor() : ViewModel() {
    private val _items = MutableStateFlow<List<String>>(emptyList())
    val items: StateFlow<List<String>> = _items.asStateFlow()

    fun load() {
        viewModelScope.launch {
            _items.update {
                buildList {
                    repeat(10) {
                        add("Item: $it")
                    }
                }
            }
        }
    }
}