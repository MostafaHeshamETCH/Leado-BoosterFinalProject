package com.example.leado

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_friend.*

class Friend : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friend)
        supportActionBar?.hide()
        bottom_navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

    }
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                item.isChecked
                item.setEnabled(true)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_search -> {
                item.isChecked
                item.setEnabled(true)
                return@OnNavigationItemSelectedListener true
            }
            R.id.graph -> {
                item.isChecked
                item.setEnabled(true)
                 val intent= Intent(this,Leaderboard::class.java)
                startActivity(intent)
                return@OnNavigationItemSelectedListener true
            }
            R.id.user -> {
                item.isChecked
                item.setEnabled(true)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}