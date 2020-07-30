package com.example.leado.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.leado.R
import com.example.leado.adapters.CoursesAdapter
import com.example.leado.adapters.MyCoursesAdapter
import com.example.leado.models.Course
import kotlinx.android.synthetic.main.fragment_my_courses.view.*

class MyCourses : Fragment()
{

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root =  inflater.inflate(R.layout.fragment_my_courses, container, false)

        var courses = ArrayList<Course>()
        courses.add(Course("lol"))
        courses.add(Course("looool"))
        courses.add(Course("lo)0)0)0))l"))
        courses.add(Course("lol"))
        courses.add(Course("looool"))
        courses.add(Course("lo)0)0)0))l"))
        courses.add(Course("lol"))
        courses.add(Course("looool"))
        courses.add(Course("lo)0)0)0))l"))
        root.myCourses_rv.adapter = MyCoursesAdapter(courses)

        return root
    }

}