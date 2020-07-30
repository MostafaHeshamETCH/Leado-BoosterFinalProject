package com.example.leado

import android.content.Intent
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.leado.adapters.PeoplesAdapter
import com.example.leado.models.People
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_leaderboard.*

class Leaderboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leaderboard)
        supportActionBar?.hide()
        leaderbord.paintFlags= Paint.UNDERLINE_TEXT_FLAG
        val z=getPeople()
        val adapter= PeoplesAdapter(z)
        main_recycler.adapter=adapter

    }
    fun getPeople():ArrayList<People>{
        val p:ArrayList<People> = ArrayList()
        p.add(
            People(
                "Aborayes",
                193.222,
                R.drawable.das
            )
        )
        p.add(
            People(
                "Etch",
                191.222,
                R.drawable.das
            )
        )
        p.add(
            People(
                "Kirdy",
                190.222,
                R.drawable.das
            )
        )
        p.add(
            People(
                "Omda",
                189.222,
                R.drawable.das
            )
        )
        p.add(
            People(
                "Zizo",
                188.222,
                R.drawable.das
            )
        )
        p.add(
            People(
                "Assoum",
                160.222,
                R.drawable.das
            )
        )
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
                val intent= Intent(this,Profile::class.java)
                startActivity(intent)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}