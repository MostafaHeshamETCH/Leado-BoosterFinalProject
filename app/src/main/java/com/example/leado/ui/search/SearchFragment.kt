package com.example.leado.ui.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.leado.R
import com.example.leado.adapters.CoursesAdapter
import com.example.leado.models.Course
import com.example.leado.models.Lesson
import kotlinx.android.synthetic.main.fragment_search.*


class SearchFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val personalBrandingLessons = ArrayList<Lesson>()
        personalBrandingLessons.add(Lesson("Introduction", 1, "28:12", "01"))
        personalBrandingLessons.add(Lesson("An Overview of Personal Branding", 2, "49:17", "02"))
        personalBrandingLessons.add(Lesson("Building your Brand's Infrastructure", 3, "1:19:57", "03"))
        personalBrandingLessons.add(Lesson("Establishing Your Brand's Digital Home", 4, "51:29", "04"))
        personalBrandingLessons.add(Lesson("Creating your Brand's Maintenance Plan", 5, "35:43", "05"))

        val recentList = ArrayList<Course>()
        recentList.add(Course("Programming 1", personalBrandingLessons))
        recentList.add(Course("Programming 2", personalBrandingLessons))
        recentList.add(Course("Physics 1", personalBrandingLessons))
        recentList.add(Course("Physics 2", personalBrandingLessons))

        recentlyRV.adapter = CoursesAdapter(recentList)

        val recommendList = ArrayList<Course>()
        recommendList.add(Course("Data Structure", personalBrandingLessons))
        recommendList.add(Course("AI", personalBrandingLessons))
        recommendList.add(Course("Machine Learning", personalBrandingLessons))
        recommendList.add(Course("Security", personalBrandingLessons))

        recommendedRV.adapter = CoursesAdapter(recommendList)
    }

}