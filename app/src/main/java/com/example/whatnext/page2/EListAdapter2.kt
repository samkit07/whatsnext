package com.example.whatnext.page2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.TextView
import com.example.whatnext.R
import models.Degree

class EListAdapter2 internal constructor(
    private val context: Context,
    private val course: ArrayList<Degree>,
    private val degree: HashMap<Degree, ArrayList<String>>
)

    : BaseExpandableListAdapter() {
    override fun getGroupCount(): Int {
        return course.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return this.degree[this.course[groupPosition]]!!.size
    }

    override fun getGroup(groupPosition: Int): Any {
        return course[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return this.degree[this.course[groupPosition]]!![childPosition]
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
        var convertView= convertView
        val title=getGroup(groupPosition) as Degree

        if (convertView==null) {
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.page2, null)
        }
        val courseTypeTv=convertView!!.findViewById<TextView>(R.id.tv_parent)
        val courseDurationTv=convertView!!.findViewById<TextView>(R.id.tv_duration)
        val courseEligTv=convertView!!.findViewById<TextView>(R.id.tv_eligible)

        courseTypeTv.text = title.course
        courseDurationTv.text = title.duration
        courseEligTv.text = title.eligibility

        return convertView
    }

    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        var convertView= convertView
        val degreetitle= getChild(groupPosition,childPosition) as String

        if (convertView==null) {
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.page2_1, null)
        }
        val courseNameTv=convertView!!.findViewById<TextView>(R.id.tv_child)

        courseNameTv.text = degreetitle

        return convertView
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {

        return true
    }


}