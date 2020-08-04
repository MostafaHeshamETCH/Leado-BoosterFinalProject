package com.example.leado.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.leado.R
import com.example.leado.adapters.CoursesAdapter
import com.example.leado.models.Course
import com.example.leado.models.Lesson
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
        })

        val personalBrandingLessons = ArrayList<Lesson>()
        personalBrandingLessons.add(Lesson("Introduction", 1, "28:12", "01"))
        personalBrandingLessons.add(Lesson("An Overview of Personal Branding", 2, "49:17", "02"))
        personalBrandingLessons.add(Lesson("Building your Brand's Infrastructure", 3, "1:19:57", "03"))
        personalBrandingLessons.add(Lesson("Establishing Your Brand's Digital Home", 4, "51:29", "04"))
        personalBrandingLessons.add(Lesson("Creating your Brand's Maintenance Plan", 5, "35:43", "05"))


        val items: MutableList<Course> = ArrayList()
        items.add(Course("Personal Branding", personalBrandingLessons, 5))
        items.add(Course("Mind Mapping", personalBrandingLessons, 5))
        items.add(Course("Self Awareness", personalBrandingLessons, 5))

        root.recyclerView.adapter=CoursesAdapter(items)
        return root

    }

}