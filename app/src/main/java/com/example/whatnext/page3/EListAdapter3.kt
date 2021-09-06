package com.example.whatnext.page3

import android.content.Context
import android.graphics.Color
import android.graphics.Color.parseColor
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.TextView
import com.example.whatnext.R
import models.Model3


class EListAdapter3 internal constructor(private val context: Context,
                                         private val studentType: ArrayList<Model3>,
                                         private val options:HashMap<Model3,ArrayList<String>>):
    BaseExpandableListAdapter() {

    override fun getGroupCount(): Int {
        return studentType.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return this.options[this.studentType[groupPosition]]!!.size
    }

    override fun getGroup(groupPosition: Int): Any {
        return studentType[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return this.options[this.studentType[groupPosition]]!![childPosition]
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
        val parentgroup = getGroup(groupPosition) as Model3

        if (convertView == null) {
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.parent3, null)
        }
        val ptextview1_3 = convertView!!.findViewById<TextView>(R.id.ptextview1_3)

        ptextview1_3.text = parentgroup.studentType

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

        val childgroup = getChild(groupPosition, childPosition) as String

        if (convertView == null) {
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.child3, null)
        }
        val ctextview1_3 = convertView!!.findViewById<TextView>(R.id.ctextview1_3)

        ctextview1_3.text = childgroup

        if(childgroup == "Job") ctextview1_3.setBackgroundColor(parseColor("#58A25D"))

        else ctextview1_3.setBackgroundColor(parseColor("#026C6C"))

        return convertView
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }
}