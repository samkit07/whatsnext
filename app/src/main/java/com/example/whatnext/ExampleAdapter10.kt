package com.example.whatnext

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import models.Model10

class ExampleAdapter10(private val exampleList: ArrayList<Model10>): RecyclerView.Adapter<ExampleAdapter10.ExampleViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.example_course10,
        parent, false)

        return ExampleViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {

        val currentCourse = exampleList[position]
        holder.textView1.text = currentCourse.name
        holder.textView2.text = currentCourse.courses.toString().replace("[", "")
            .replace("]", "")
            .replace(",","\n")
    }

    override fun getItemCount() = exampleList.size

    class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val textView1 : TextView = itemView.findViewById(R.id.textview1_10)
        val textView2 : TextView = itemView.findViewById(R.id.textview2_10)

    }
}