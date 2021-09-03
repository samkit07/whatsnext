package com.example.whatnext.page2


import android.content.Context
import android.text.method.ScrollingMovementMethod
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.whatnext.MainActivity
import com.example.whatnext.R
//import models.Examinations2
import models.Model2

import models.Model9
import java.security.AccessController.getContext
import android.widget.TextView
import androidx.core.content.ContextCompat.getSystemService
import androidx.test.core.app.ApplicationProvider
import androidx.test.core.app.ApplicationProvider.getApplicationContext





class UserAdapter1_2(val exlist :ArrayList<Model2>) : RecyclerView.Adapter<UserAdapter1_2.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card1_2, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = exlist[position]

//        myAdapter = item.fields2
        holder.ptextview1_2.text = item.name
        holder.ptextview2_2.text = item.type
        holder.ptextview3_2.text = item.duration
        holder.ptextview4_2.text = item.eligibility
        holder.ptextview5_2.text = item.fields2.toString()
            .replace("[","")
            .replace("]","")

    }

    override fun getItemCount(): Int {
        return exlist.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        val ptextview1_2 = view.findViewById<TextView>(R.id.ptextview1_2)
        val ptextview2_2 = view.findViewById<TextView>(R.id.ptextview2_2)
        val ptextview3_2 = view.findViewById<TextView>(R.id.ptextview3_2)
        val ptextview4_2 = view.findViewById<TextView>(R.id.ptextview4_2)
        val ptextview5_2 = view.findViewById<TextView>(R.id.ptextview5_2)

    }
}

//        val arr : ArrayList<Model2> = ArrayList()
//
//        var examsMap : HashMap<Model2,List<Examinations2>> = HashMap()
//
//        for(i in 0 until courses.data.size){
//
//            arr.add(courses.data[i])
//            examsMap[courses.data[i]] = courses.data[i].exams
//
//        }
//
//        listViewAdapter = EListAdapter2(context as MainActivity, arr, examsMap)
//
//        val view : View = inflater.inflate(R.layout.fragment_what_after_12th, container, false)
//
//        view.findViewById<ExpandableListView>(R.id.elistview1_2).setAdapter(listViewAdapter)