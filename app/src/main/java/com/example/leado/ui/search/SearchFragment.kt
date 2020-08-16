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


        val prog1 = ArrayList<Lesson>()
        prog1.add(Lesson("Introduction", 1, "28:12", "01"))
        prog1.add(Lesson("Variables declaration, Arithmetic Operations", 2, "49:17", "02"))
        prog1.add(Lesson("Loops, Ifs, Switch case", 3, "1:19:57", "03"))
        prog1.add(Lesson("Functions and Recursive functions", 4, "51:29", "04"))
        prog1.add(Lesson("Arrays", 5, "1:35:43", "05"))
        prog1.add(Lesson("Strings", 6, "35:43", "06"))

        val prog2 = ArrayList<Lesson>()
        prog2.add(Lesson("Introduction to OOP", 1, "28:12", "01"))
        prog2.add(Lesson("OOP Concepts and Classes", 2, "49:17", "02"))
        prog2.add(Lesson("Encapsulation and Inheritance", 3, "1:19:57", "03"))
        prog2.add(Lesson("Polymorphism", 4, "51:29", "04"))
        prog2.add(Lesson("GUI", 5, "35:43", "05"))
        prog2.add(Lesson("Multithreading", 6, "1:35:43", "06"))

        val phy1 = ArrayList<Lesson>()
        phy1.add(Lesson("Simple Harmonic Motion", 1, "28:12", "01"))
        phy1.add(Lesson("Driven vibrations and resonance", 2, "49:17", "02"))
        phy1.add(Lesson("Vibrations of continuous systems", 3, "1:19:57", "03"))
        phy1.add(Lesson("Properties of sound and electromagnetic waves", 4, "51:29", "04"))
        phy1.add(Lesson("Polarization", 5, "35:43", "05"))

        val phy2 = ArrayList<Lesson>()
        phy2.add(Lesson("Electrostatics", 1, "28:12", "01"))
        phy2.add(Lesson("Magnetostatics", 2, "49:17", "02"))
        phy2.add(Lesson("Dielectrics ", 3, "1:19:57", "03"))
        phy2.add(Lesson("Magnetic materials", 4, "51:29", "04"))
        phy2.add(Lesson("Electromagnetic waves", 5, "35:43", "05"))


        val recentList = ArrayList<Course>()
        recentList.add(Course("Programming 1", prog1,6,70,4.1))
        recentList.add(Course("Advanced Programming", prog2,6,60,3.9))
        recentList.add(Course("Physics 1", phy1,5,83,4.7))
        recentList.add(Course("Physics 2", phy2,5,26,4.1))

        recentlyRV.adapter = CoursesAdapter(recentList)

       /* val recommendList = ArrayList<Course>()
        recommendList.add(Course("Data Structure", personalBrandingLessons))
        recommendList.add(Course("Artificial Intelligence", personalBrandingLessons))
        recommendList.add(Course("Machine Learning", personalBrandingLessons))
        recommendList.add(Course("Security", personalBrandingLessons))

        recommendedRV.adapter = CoursesAdapter(recommendList)*/
    }

}