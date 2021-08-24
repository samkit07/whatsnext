package com.example.what_next

import Models.Exams
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.page7.view.*
import kotlinx.android.synthetic.main.page7_1.view.*

class UserAdapter7_1(val exlist:ArrayList<Exams>) : RecyclerView.Adapter<UserAdapter7_1.Viewholder>() {
    class Viewholder(view: View) : RecyclerView.ViewHolder(view){

        val name = view.tv_name
        val purpose = view.tv_purpose
        val eligibility = view.tv_eligibility
        val appliMode = view.tv_appliMode
        val source = view.tv_source
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.page7_1,parent,false)
        return Viewholder(itemView)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        val item = exlist[position]
        holder.name.text = item.name
        var a:String = item.applicationMode.joinToString(", \n")

        holder.purpose.text = item.purpose
        holder.eligibility.text = item.eligibility
        holder.source.text = item.source
        holder.appliMode.text = a
    }

    override fun getItemCount(): Int {
        return exlist.size
    }
}