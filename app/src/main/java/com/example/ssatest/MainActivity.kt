package com.example.ssatest

import android.os.Bundle
import androidx.core.view.isVisible
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.ssatest.base.BaseActivity
import com.example.ssatest.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindNavController()
        bindBottomNavigation()

        bindVisibleBottomNavigation()
    }

    private fun bindNavController() {
        navController =
            (supportFragmentManager.findFragmentById(R.id.fragment_container_view) as? NavHostFragment)?.navController
                ?: return
    }

    private fun bindBottomNavigation() {
        binding.bottomNavigationView.setupWithNavController(navController)
    }

    private fun bindVisibleBottomNavigation(){
        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            binding.bottomNavigationView.isVisible = destination.id != R.id.detail
        }
    }
}
