package com.example.practice2

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.TextView
import com.example.whatnext.R
import models.Examinations
import models.Fields
import models.Model1

class EListAdapter internal constructor(
    private val context: Context, private val whatnext_1: List<Model1>,
    private val fields: HashMap<Model1, List<Fields>>
) :
    BaseExpandableListAdapter() {


    override fun getGroupCount(): Int {

        return whatnext_1.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {

        return this.fields[this.whatnext_1[groupPosition]]!!.size
    }

    override fun getGroup(groupPosition: Int): Any {

        return whatnext_1[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {

        return this.fields[this.whatnext_1[groupPosition]]!![childPosition]
    }

    override fun getGroupId(groupPosition: Int): Long {

        return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {

        return childPosition.toLong()
    }

    override fun hasStableIds(): Boolean {

        return false
    }

    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {

        var convertView = convertView

        val textview1_1Title = getGroup(groupPosition) as Model1

        if (convertView == null) {

            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

            convertView = inflater.inflate(R.layout.whatnext_1, null)
        }


        val textview1_1 = convertView!!.findViewById<TextView>(R.id.textview1_1)
        val textview2_1 = convertView!!.findViewById<TextView>(R.id.textview2_1)
        val textview3_1 = convertView!!.findViewById<TextView>(R.id.textview3_1)
        val textview4_1 = convertView!!.findViewById<TextView>(R.id.textview4_1)

        textview1_1.text = textview1_1Title.name
        textview2_1.text = textview1_1Title.duration
        textview3_1.text = textview1_1Title.examinations.toString().replace("[","")
            .replace("]","").replace(",","\n")
        textview4_1.text = textview1_1Title.jobs.replace(",","\n")

        textview2_1.visibility = View.VISIBLE
        textview3_1.visibility = View.VISIBLE
        textview4_1.visibility = View.VISIBLE

        if(textview2_1.text == "") textview2_1.visibility = View.INVISIBLE
        if(textview3_1.text == "[]") textview3_1.visibility = View.INVISIBLE
        if(textview4_1.text == "") textview4_1.visibility = View.INVISIBLE


        return convertView
    }

    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {

        var convertView = convertView

        val textview1_2Title = getChild(groupPosition, childPosition) as Fields

        if (convertView == null) {

            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.fields, null)
        }

        val textview1_2 = convertView!!.findViewById<TextView>(R.id.textview1_2)
        var textview2_2 = convertView!!.findViewById<TextView>(R.id.textview2_2)

        textview1_2.setText(textview1_2Title.name)

        if (textview1_2Title.subFields.isEmpty()) {
            textview2_2.setVisibility(View.INVISIBLE)
        }else {
            textview2_2.setVisibility(View.VISIBLE)
            textview2_2.setText(
                textview1_2Title.subFields.toString().replace("[", "")
                    .replace("]", "").replace(",", "\n")
            )
        }

        return convertView
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {

        return true
    }


}