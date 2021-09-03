package com.example.practice2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.TextView
import com.example.whatnext.R
import models.Model10

class EListAdapter10 internal constructor(
    private val context: Context, private val names: ArrayList<String>,
    private val courses: HashMap<String, ArrayList<String>>
) :
    BaseExpandableListAdapter() {


    override fun getGroupCount(): Int {

        return names.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {

        return this.courses[this.names[groupPosition]]!!.size
    }

    override fun getGroup(groupPosition: Int): Any {

        return names[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {

        return this.courses[this.names[groupPosition]]!![childPosition]
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
    ): View? {

        var convertview = convertView

        val textview1_1Title = getGroup(groupPosition) as String

        if (convertview == null) {

            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertview = inflater.inflate(R.layout.parent10, null)
        }


        val ptextview1_10 = convertview?.findViewById<TextView>(R.id.ptextview1_10)

        if (ptextview1_10 != null) {
            ptextview1_10.text = textview1_1Title
        }

        return convertview
    }

    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View? {

        var convertview = convertView

        val textview1_2Title = getChild(groupPosition, childPosition) as String

        if (convertview == null) {

            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertview = inflater.inflate(R.layout.child10, null)
        }

        val ctextview1_10 = convertview!!.findViewById<TextView>(R.id.ctextview1_10)

        ctextview1_10.text = textview1_2Title
        return convertview
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {

        return true
    }


}