package com.example.leado

import android.content.Intent
import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_friend.*
import kotlinx.android.synthetic.main.activity_leaderboard.*
import kotlinx.android.synthetic.main.activity_leaderboard.bottom_navigation
import kotlinx.android.synthetic.main.item.*

class Leaderboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leaderboard)
        supportActionBar?.hide()
        leaderbord.paintFlags= Paint.UNDERLINE_TEXT_FLAG

        val z=getPeople()
        val adapter=Adapter(z)
        main_recycler.adapter=adapter

    }
    fun getPeople():ArrayList<People>{
        val p:ArrayList<People> = ArrayList()
        p.add(People("Aborayes",193.222,1,R.drawable.das))
        p.add(People("Etch",191.222,2,R.drawable.das))
        p.add(People("Kirdy",190.222,3,R.drawable.das))
        p.add(People("Omda",189.222,4,R.drawable.das))
        p.add(People("Zizo",188.222,5,R.drawable.das))
        p.add(People("Assoum",160.222,6,R.drawable.das))
        return p
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
                return@OnNavigationItemSelectedListener true
            }
            R.id.user -> {
                item.isChecked
                item.setEnabled(true)
                val intent= Intent(this,Friend::class.java)
                startActivity(intent)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}