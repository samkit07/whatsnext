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
import models.Model4_5_6


class UserAdapter2_2(val exlist: ArrayList<Model4_5_6>) :
    RecyclerView.Adapter<UserAdapter2_2.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.child1_2, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = exlist[position]


        putData(holder, item)


    }

    override fun getItemCount(): Int {
        return exlist.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val ptextview1_4 = view.findViewById<TextView>(R.id.ptextview1_4)
        val ptextview2_4 = view.findViewById<TextView>(R.id.ptextview2_4)
        val ptextview3_4 = view.findViewById<TextView>(R.id.ptextview3_4)
        val ptextview4_4 = view.findViewById<TextView>(R.id.ptextview4_4)
        val ptextview5_4 = view.findViewById<TextView>(R.id.ptextview5_4)
        val ptextview6_4 = view.findViewById<TextView>(R.id.ptextview6_4)
        val ptextview7_4 = view.findViewById<TextView>(R.id.ptextview7_4)
        val ptextview8_4 = view.findViewById<TextView>(R.id.ptextview8_4)
        val ptextview9_4 = view.findViewById<TextView>(R.id.ptextview9_4)
        val ptextview10_4 = view.findViewById<TextView>(R.id.ptextview10_4)
        val ptextview11_4 = view.findViewById<TextView>(R.id.ptextview11_4)
        val ptextview12_4 = view.findViewById<TextView>(R.id.ptextview12_4)
        val ptextview13_4 = view.findViewById<TextView>(R.id.ptextview13_4)

    }


    private fun putData(holder: ViewHolder, item: Model4_5_6) {


        holder.ptextview1_4.text = item.name
        holder.ptextview2_4.text = item.type
        holder.ptextview3_4.text = item.purpose
        holder.ptextview4_4.text = item.applicationMode
        holder.ptextview5_4.text = item.duration
        holder.ptextview6_4.text = item.website
        holder.ptextview7_4.text = item.eligibility
        holder.ptextview8_4.text = item.modeOfSelection
        holder.ptextview9_4.text = item.conductedBy
        holder.ptextview10_4.text = item.applicationFor
        holder.ptextview11_4.text = item.notificationMonth
        holder.ptextview12_4.text = item.activity
        holder.ptextview13_4.text = item.schools.toString()
            .replace("[", "")
            .replace("]", "")
            .replace(", ", "\n")

        setDisplay(holder, item)

    }

    private fun setDisplay(holder: ViewHolder, item: Model4_5_6) {

        holder.ptextview1_4.visibility = if (item.name == "") View.GONE else View.VISIBLE
        holder.ptextview2_4.visibility = if (item.type == "") View.GONE else View.VISIBLE
        holder.ptextview3_4.visibility = if (item.purpose == "") View.GONE else View.VISIBLE
        holder.ptextview4_4.visibility = if (item.applicationMode == "") View.GONE else View.VISIBLE
        holder.ptextview5_4.visibility = if (item.duration == "") View.GONE else View.VISIBLE
        holder.ptextview6_4.visibility = if (item.website == "") View.GONE else View.VISIBLE
        holder.ptextview7_4.visibility = if (item.eligibility == "") View.GONE else View.VISIBLE
        holder.ptextview8_4.visibility = if (item.modeOfSelection == "") View.GONE else View.VISIBLE
        holder.ptextview9_4.visibility = if (item.conductedBy == "") View.GONE else View.VISIBLE
        holder.ptextview10_4.visibility = if (item.applicationFor == "") View.GONE else View.VISIBLE
        holder.ptextview11_4.visibility = if (item.notificationMonth == "") View.GONE else View.VISIBLE
        holder.ptextview12_4.visibility = if (item.activity == "") View.GONE else View.VISIBLE

        holder.ptextview13_4.visibility = if (item.activity == "") View.GONE else View.VISIBLE


    }
}