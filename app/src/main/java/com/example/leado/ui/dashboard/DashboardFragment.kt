package com.example.leado.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.leado.R
import com.example.leado.adapters.PeoplesAdapter
import com.example.leado.models.People
import kotlinx.android.synthetic.main.fragment_dashboard.*
import kotlinx.android.synthetic.main.fragment_dashboard.view.*


class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProviders.of(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
        })
        val Full_List=getPeople()
        val first_img=Full_List.get(0).image
        val second_img=Full_List.get(1).image
        val third_img=Full_List.get(2).image
        val image1 = root.findViewById(R.id.user_1st_pp) as ImageView
        image1.setImageResource(first_img)
        val image2 = root.findViewById(R.id.user_2nd_pp) as ImageView
        image2.setImageResource(second_img)
        val image3 = root.findViewById(R.id.user_3rd_pp) as ImageView
        image3.setImageResource(third_img)
        val Part_List=Full_List
        Part_List.removeAt(0)
        Part_List.removeAt(1)
        Part_List.removeAt(2)

        root.leaderboard_recycler.adapter=PeoplesAdapter(Part_List)

        return root
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
        p.add(
            People(
                "Pep",
                150.222,
                R.drawable.das
            )
        )
        p.add(
            People(
                "Shebo",
                130.222,
                R.drawable.das
            )
        )
        p.add(
            People(
                "max",
                120.222,
                R.drawable.das
            )
        )
        p.add(
            People(
                "Salah",
                110.222,
                R.drawable.das
            )
        )
        return p
    }

}