package com.example.leado.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.leado.R
import com.example.leado.adapters.CoursesAdapter
import com.example.leado.models.Course
import kotlinx.android.synthetic.main.temp_homepage.*

class HomepageActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.temp_homepage)

        var items: MutableList<Course> = ArrayList()
        items.add(Course("Personal Branding"))
        items.add(Course("Mind Mapping"))
        items.add(Course("Self Awareness"))

        recyclerView.adapter = CoursesAdapter(items)
    }
}