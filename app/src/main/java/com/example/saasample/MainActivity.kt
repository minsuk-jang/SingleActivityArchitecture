package com.example.saasample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.fragment.NavHostFragment
import com.example.saasample.base.BaseActivity
import com.example.saasample.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    private lateinit var controller: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initNavController()
    }

    private fun initNavController() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_container_view) as NavHostFragment
        controller = navHostFragment.navController
    }
}