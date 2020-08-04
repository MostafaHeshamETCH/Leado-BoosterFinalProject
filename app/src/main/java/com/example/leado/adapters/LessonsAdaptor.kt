package com.example.leado.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.leado.R
import com.example.leado.models.Lesson
import kotlinx.android.synthetic.main.course_lesson_item.view.*


class LessonsAdaptor(private var items: List<Lesson>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
    {
        return BlogViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.course_lesson_item,
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
                holder.lesson = items[position]
            }
        }
    }

    override fun getItemCount(): Int
    {
        return items.size
    }

    class BlogViewHolder constructor(itemView: View, var lesson: Lesson? = null):RecyclerView.ViewHolder(itemView)
    {
        private var lessonName = itemView.lesson_name
        private var lessonTime = itemView.lesson_time
        private var lessonNum = itemView.lesson_num

        fun bind(lesson: Lesson)
        {
            lessonName.text = lesson.name
            lessonTime.text = lesson.time
            lessonNum.text = lesson.order
        }

        init
        {
            itemView.setOnClickListener{
            }
        }
    }
}