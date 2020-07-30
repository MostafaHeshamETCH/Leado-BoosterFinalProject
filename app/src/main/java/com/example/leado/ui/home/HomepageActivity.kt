package com.example.leado.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.RecyclerView
import com.example.leado.Leaderboard
import com.example.leado.R
import com.example.leado.adapters.CoursesAdapter
import com.example.leado.models.Course
import com.example.leado.ui.dashboard.DashboardFragment
import com.google.android.material.bottomnavigation.BottomNavigationMenu
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.temp_homepage.*
import kotlinx.android.synthetic.main.fragment_home.*

class HomepageActivity : AppCompatActivity()
{

    lateinit var homeFragment: HomeFragment
    lateinit var dashboardFragment: DashboardFragment
    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        supportActionBar?.hide()
        homeFragment= HomeFragment()
        dashboardFragment= DashboardFragment()

        val btm: BottomNavigationView = findViewById(R.id.nav_view)
        btm.setOnNavigationItemSelectedListener { item->
            when(item.itemId){
                R.id.navigation_home->{
                    supportFragmentManager.beginTransaction().replace(R.id.nav_host_fragment,homeFragment).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()
                }
                R.id.navigation_notifications->{
                    supportFragmentManager.beginTransaction().replace(R.id.nav_host_fragment,dashboardFragment).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()
                }
            }
          true
        }
    }
}