package com.example.whatnext.page9

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.whatnext.R

import models.Model9

class UserAdapter9(val exlist :ArrayList<Model9>) : RecyclerView.Adapter<UserAdapter9.Viewholder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.fragment_talent_tests_1, parent, false)
        return Viewholder(itemView)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        val item = exlist[position]

        holder.test.text = item.test

        val str1 : String = "Eligibility: ${item.eligibility}"
        val str2 : String = "Syllabus: ${item.syllabus}"
        val str3 : String ="Website: ${item.website}"
        holder.eligibility.text = str1
        holder.syllabus.text = str2
        holder.website.text = str3

        val isexpandable: Boolean = exlist[position].expandable

        holder.exlayout.visibility = if(isexpandable) View.VISIBLE else View.GONE

        holder.linearlay.setOnClickListener{
            val v = exlist[position]
            v.expandable = !v.expandable
            notifyItemChanged(position)
        }
    }

    override fun getItemCount(): Int {
        return exlist.size
    }

    class Viewholder(view: View) : RecyclerView.ViewHolder(view){


        val test = view.findViewById<TextView>(R.id.textview1_9)
        val eligibility = view.findViewById<TextView>(R.id.textview2_9)
        val syllabus = view.findViewById<TextView>(R.id.textview3_9)
        val website = view.findViewById<TextView>(R.id.textview4_9)
        val linearlay = view.findViewById<LinearLayout>(R.id.linearlay)
        val exlayout = view.findViewById<RelativeLayout>(R.id.expandable_layout)
    }
}