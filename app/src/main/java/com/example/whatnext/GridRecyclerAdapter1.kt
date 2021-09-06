package com.example.whatnext

import models.CustomGridView
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.example.whatnext.page1.WhatAfter10th
import com.example.whatnext.page10.CoursesOverview
import com.example.whatnext.page2.*
//import com.example.whatnext.page2.WhatAfter12th
import com.example.whatnext.page3.WhatAfterGrad
import com.example.whatnext.page9.TalentTests


class GridRecyclerAdapter1(private val context: Context, var exlist:ArrayList<CustomGridView>): RecyclerView.Adapter<GridRecyclerAdapter1.Viewholder>() {


    lateinit var fm : FragmentManager
    class Viewholder(itemView:View): RecyclerView.ViewHolder(itemView){

        var text = itemView.findViewById<TextView>(R.id.gridtext)
        var img = itemView.findViewById<ImageView>(R.id.gridimg)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {

        fm =  MainActivity().supportFragmentManager
        return Viewholder(LayoutInflater.from(parent.context).inflate(R.layout.grid_layout, parent, false))
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        val data = exlist[position]

        holder.text.text = data.text
        holder.img.setImageResource(data.img)
        holder.itemView.setOnClickListener{
//            Toast.makeText(context,"Clicked on : "+ position,Toast.LENGTH_SHORT).show()

            when(position) {
                0 -> {
//                    val intent = Intent(context, fragment7::class.java)
                    val activity = context as AppCompatActivity
//                    val myFragment: Fragment
                   context.supportFragmentManager.beginTransaction()
                        .replace(R.id.wrapper, Fragment2_1()).addToBackStack(null).commit()
                }
                1 -> {
//                    val intent = Intent(context, fragment7::class.java)
                    val activity = context as AppCompatActivity
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.wrapper, Fragment2_2()).addToBackStack(null).commit()
                }
                2 -> {
//                    val intent = Intent(context, fragment7::class.java)
                    val activity = context as AppCompatActivity
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.wrapper, Fragment2_3()).addToBackStack(null).commit()
                }
                3 -> {
//                    val intent = Intent(context, fragment7::class.java)
                    val activity = context as AppCompatActivity
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.wrapper, Fragment2_4()).addToBackStack(null).commit()
                }
                4 -> {
//                    val intent = Intent(context, fragment7::class.java)
                    val activity = context as AppCompatActivity
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.wrapper, Fragment2_5()).addToBackStack(null).commit()
                }
                5 -> {
//                    val intent = Intent(context, fragment7::class.java)
                    val activity = context as AppCompatActivity
//                    val myFragment: Fragment = TalentTests()
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.wrapper, Fragment2_6()).addToBackStack(null).commit()
                }
            }
        }
        }

    override fun getItemCount(): Int {
        return exlist.size
    }
}