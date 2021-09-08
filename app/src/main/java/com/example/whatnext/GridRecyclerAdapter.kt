package com.example.whatnext

import android.R.attr
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
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.whatnext.page1.WhatAfter10th
import com.example.whatnext.page10.CoursesOverview
import com.example.whatnext.page2.WhatAfter12th
import com.example.whatnext.page2.WhatAfter12th_1
//import com.example.whatnext.page2.WhatAfter12th
import com.example.whatnext.page3.WhatAfterGrad
import com.example.whatnext.page9.TalentTests
import android.R.attr.path
import android.graphics.drawable.Drawable


class GridRecyclerAdapter(private val context: Context, var exlist:ArrayList<CustomGridView>): RecyclerView.Adapter<GridRecyclerAdapter.Viewholder>() {


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

        Glide
            .with(context)
            .load(data.img)
            .apply(RequestOptions().override(200, 200).centerCrop())
            .into(holder.img)
//        Glide.with(context)
//            .load(data.img)
//            .override(300, 300)
//            .centerCrop()
//            .apply(
//                RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.RESOURCE)
//                .error(R.drawable.keyboard_arrow_down))
//            .into(holder.img)

        holder.itemView.setOnClickListener{

            when(position) {
                0 -> {
//                    val intent = Intent(context, fragment7::class.java)
                    val activity = context as AppCompatActivity
//                    val myFragment: Fragment
                   context.supportFragmentManager.beginTransaction()
                        .replace(R.id.wrapper, WhatAfter10th()).addToBackStack(null).commit()
                }
                1 -> {
//                    val intent = Intent(context, fragment7::class.java)
                    val activity = context as AppCompatActivity
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.wrapper, TalentTests()).addToBackStack(null).commit()
                }
                2 -> {
//                    val intent = Intent(context, fragment7::class.java)
                    val activity = context as AppCompatActivity
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.wrapper, WhatAfter12th()).addToBackStack(null).commit()
                }
                3 -> {
//                    val intent = Intent(context, fragment7::class.java)
                    val activity = context as AppCompatActivity
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.wrapper, WhatAfter12th_1()).addToBackStack(null).commit()
                }
                4 -> {
//                    val intent = Intent(context, fragment7::class.java)
                    val activity = context as AppCompatActivity
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.wrapper, WhatAfterGrad()).addToBackStack(null).commit()
                }
                5 -> {
//                    val intent = Intent(context, fragment7::class.java)
                    val activity = context as AppCompatActivity
//                    val myFragment: Fragment = TalentTests()
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.wrapper, CoursesOverview()).addToBackStack(null).commit()
                }
            }
        }
        }

    override fun getItemCount(): Int {
        return exlist.size
    }
}