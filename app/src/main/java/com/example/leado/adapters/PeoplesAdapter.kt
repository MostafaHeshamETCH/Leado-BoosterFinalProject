package com.example.leado.adapters

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.leado.models.People
import com.example.leado.R
import kotlinx.android.synthetic.main.user_item.view.*

class PeoplesAdapter(val list:ArrayList<People>) : RecyclerView.Adapter<PeoplesAdapter.viewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
       val layoutinflater=LayoutInflater.from(parent.context).inflate(R.layout.user_item,parent,false)
        return viewHolder(layoutinflater)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
       val part= list.get(position)
        holder.personName.text=part.name
        holder.Score.text=part.score.toString()+" "+"Points"
        holder.Rank.text=part.Rank.toString()
        holder.image.setImageResource(part.image)
        if(part.Rank==1){
            //holder.itemm.setBackgroundColor(Color.parseColor("#22d0c4"))
            holder.Rank.setBackgroundResource(R.drawable.first)
            holder.Rank.setTextColor(Color.parseColor("#1f314a"))
        }
        if(part.Rank==2||part.Rank==3){
            holder.Rank.setBackgroundResource(R.drawable.second_third)
            holder.Rank.setTextColor(Color.parseColor("#22d0c4"))

        }
    }

    inner class viewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val personName: TextView =itemView.name
        val Score: TextView =itemView.textView12
        val Rank: TextView =itemView.textView14
        //val itemm=itemView.item
        val image=itemView.imageView9
    }
}