package com.example.whatnext

import android.text.TextUtils.replace
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import models.*

class ExampleAdapter1(
    private val exampleList: ArrayList<Model1>
) : RecyclerView.Adapter<ExampleAdapter1.ExampleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.example_course1,
            parent, false
        )

        return ExampleViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {

        val currentCourse = exampleList[position]

//        holder.textView1.text = currentCourse.name

//        for(i in 0 until currentCourse.type.size){

        holder.textView1.text = currentCourse.type
        holder.textView2.text = currentCourse.name
        if (currentCourse.duration != "") holder.textView3.text = currentCourse.duration

//        holder.textView3.text = currentCourse.fields.toString()
//        }

//        Log.i("position", "$position")
        Log.i("itemCount", "$itemCount")
//        holder.textView2.text = currentCourse.type.toString().replace(Regex("(^\\[|\\]$)"), "")
//            .replace(",","\n")
//        holder.textView3.text = currentCourse.type.
//            holder.textView2.text = currentCourse.type.name
//        holder.textView3.text = currentCourse.type[0].fields.toString()
//            holder.textView3.text = currentCourse.type[position].duration
    }

    override fun getItemCount() = exampleList.size

    class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val textView1: TextView = itemView.findViewById(R.id.textview1_1)
        val textView2: TextView = itemView.findViewById(R.id.textview2_1)
        val textView3: TextView = itemView.findViewById(R.id.textview3_1)
    }


}