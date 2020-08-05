package com.example.leado.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.leado.R
import com.example.leado.models.Course
import kotlinx.android.synthetic.main.course_item.view.*


class MyCoursesAdapter(private var items: List<Course>) : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
    {
        return BlogViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.mycourses_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int)
    {
        when(holder)
        {
            is BlogViewHolder ->
            {
                holder.bind(items[position])
                holder.course = items[position]
            }
        }
    }

    override fun getItemCount(): Int
    {
        return items.size
    }

    class BlogViewHolder constructor(itemView: View, var course: Course? = null):RecyclerView.ViewHolder(itemView)
    {
        private var courseName: TextView = itemView.course_name

        fun bind(course: Course)
        {
            courseName.text = course.name
        }

        init
        {
            itemView.setOnClickListener{
            }
        }
    }
}