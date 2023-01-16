package com.example.saasample.extension

import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

inline fun Fragment.repeatOnLifecycle(
    state: Lifecycle.State = Lifecycle.State.STARTED,
    crossinline block: CoroutineScope.() -> Unit
) {
    viewLifecycleOwner.lifecycleScope.launch {
        repeatOnLifecycle(state) {
            block()
        }
    }
}