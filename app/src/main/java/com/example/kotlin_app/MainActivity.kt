package com.example.kotlin_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var homeFragment = HomeFragment()
        var workoutFragment = WorkoutFragment()


        setCurrentFragment(homeFragment)
        val bottomNavigationViewObj = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationViewObj.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.home -> setCurrentFragment(homeFragment)
                R.id.workouts -> setCurrentFragment(workoutFragment)
            }
            true
        }
    }

    private fun setCurrentFragment(fragment : Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }
    }
}