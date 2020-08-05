package com.example.leado.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.leado.R
import com.example.leado.adapters.MyCoursesAdapter
import com.example.leado.models.Course
import com.example.leado.models.Lesson
import kotlinx.android.synthetic.main.fragment_my_courses.view.*

class MyCourses : Fragment()
{

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root =  inflater.inflate(R.layout.fragment_my_courses, container, false)

        val personalBrandingLessons = ArrayList<Lesson>()
        personalBrandingLessons.add(Lesson("Introduction", 1, "28:12", "01"))
        personalBrandingLessons.add(Lesson("An Overview of Personal Branding", 2, "49:17", "02"))
        personalBrandingLessons.add(Lesson("Building your Brand's Infrastructure", 3, "1:19:57", "03"))
        personalBrandingLessons.add(Lesson("Establishing Your Brand's Digital Home", 4, "51:29", "04"))
        personalBrandingLessons.add(Lesson("Creating your Brand's Maintenance Plan", 5, "35:43", "05"))

        var courses = ArrayList<Course>()
        courses.add(Course("lol",personalBrandingLessons))
        courses.add(Course("looool",personalBrandingLessons))
        courses.add(Course("lo)0)0)0))l",personalBrandingLessons))
        courses.add(Course("lol",personalBrandingLessons))
        courses.add(Course("looool",personalBrandingLessons))
        courses.add(Course("lo)0)0)0))l",personalBrandingLessons))
        courses.add(Course("lol",personalBrandingLessons))
        courses.add(Course("looool",personalBrandingLessons))
        courses.add(Course("lo)0)0)0))l",personalBrandingLessons))
        root.myCourses_rv.adapter = MyCoursesAdapter(courses)

        return root
    }

}