package com.example.whatnext.page2
//
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.BaseExpandableListAdapter
//import android.widget.ExpandableListView
//import android.widget.TextView
//import androidx.core.view.get
//import com.example.whatnext.R
//import models.Model2
//import models.Schools2
//
//
//class EListAdapter2 internal constructor(
//    private val context: Context, private val parent: ArrayList<Model2>,
//    private val child: HashMap<Model2, List<Examinations2>>
//) :
//    BaseExpandableListAdapter() {
//
//
//    override fun getGroupCount(): Int {
//
//        return parent.size
//    }
//
//    override fun getChildrenCount(groupPosition: Int): Int {
//
//        return this.child[this.parent[groupPosition]]!!.size
//    }
//
//    override fun getGroup(groupPosition: Int): Any {
//
//        return parent[groupPosition]
//    }
//
//    override fun getChild(groupPosition: Int, childPosition: Int): Any {
//
//        return this.child[this.parent[groupPosition]]!![childPosition]
//    }
//
//    override fun getGroupId(groupPosition: Int): Long {
//
//        return groupPosition.toLong()
//    }
//
//    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
//
//        return childPosition.toLong()
//    }
//
//    override fun hasStableIds(): Boolean {
//
//        return false
//    }
//
//    override fun getGroupView(
//        groupPosition: Int,
//        isExpanded: Boolean,
//        convertView: View?,
//        parent: ViewGroup?
//    ): View? {
//
//        var convertview = convertView
//
//        val parentgroup = getGroup(groupPosition) as Model2
//
//        if (convertview == null) {
//
//            val inflater =
//                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//            convertview = inflater.inflate(R.layout.parent1_2, null)
//        }
//
//        val ptextview5_2 = convertview!!.findViewById<TextView>(R.id.ptextview5_2)
////        val ptextview2_2 = convertview!!.findViewById<TextView>(R.id.ptextview2_2)
////        val ptextview3_2 = convertview!!.findViewById<TextView>(R.id.ptextview3_2)
////        val ptextview4_2 = convertview!!.findViewById<TextView>(R.id.ptextview4_2)
////        val ptextview5_2 = convertview!!.findViewById<TextView>(R.id.ptextview5_2)
//
//
//        ptextview5_2.text = parentgroup.name
////            parentgroup.name
////        ptextview2_2.text = parentgroup.type
////        ptextview3_2.text = parentgroup.duration
////        ptextview4_2.text = parentgroup.eligibility
//
//
////        ptextview2_2.visibility = View.VISIBLE
//        ptextview5_2.visibility = View.VISIBLE
////        ptextview3_2.visibility = View.VISIBLE
////        ptextview4_2.visibility = View.VISIBLE
////        ptextview5_2.visibility = View.VISIBLE
//
////        if (parentgroup.name == "") {
////            ptextview1_2.text = parentgroup.type
////            ptextview2_2.visibility = View.GONE
////        }
//
//        return convertview
//    }
//
//
//
//    override fun getChildView(
//        groupPosition: Int,
//        childPosition: Int,
//        isLastChild: Boolean,
//        convertView: View?,
//        parent: ViewGroup?
//    ): View? {
//
//        var convertview = convertView
//
//        val childgroup = getChild(groupPosition, childPosition) as Examinations2
//
//        if (convertview == null) {
//
//            val inflater =
//                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//            convertview = inflater.inflate(R.layout.child1_2, null)
//        }
//
//        val ctextview1_2 = convertview?.findViewById<TextView>(R.id.ctextview1_2)
//        var ctextview2_2 = convertview?.findViewById<TextView>(R.id.ctextview2_2)
//        var ctextview3_2 = convertview?.findViewById<TextView>(R.id.ctextview3_2)
//        var ctextview4_2 = convertview?.findViewById<TextView>(R.id.ctextview4_2)
//        var ctextview5_2 = convertview?.findViewById<TextView>(R.id.ctextview5_2)
//        var ctextview6_2 = convertview?.findViewById<TextView>(R.id.ctextview6_2)
//        var ctextview7_2 = convertview?.findViewById<TextView>(R.id.ctextview7_2)
//        var ctextview8_2 = convertview?.findViewById<TextView>(R.id.ctextview8_2)
//
//
//        if (ctextview1_2 != null) {
//            addOrNot(ctextview1_2, childgroup.name)
//        }
//        if (ctextview2_2 != null) {
//            addOrNot(ctextview2_2, childgroup.purpose)
//        }
//        if (ctextview3_2 != null) {
//            addOrNot(ctextview3_2, childgroup.eligibility)
//        }
//        if (ctextview4_2 != null) {
//            addOrNot(ctextview4_2, childgroup.applicationMode)
//        }
//        if (ctextview5_2 != null) {
//            addOrNot(ctextview5_2, childgroup.duration)
//        }
//        if (ctextview6_2 != null) {
//            addOrNot(ctextview6_2, childgroup.source)
//        }
//        if (ctextview7_2 != null) {
//            addOrNot(ctextview7_2, childgroup.activity)
//        }
//        if (ctextview8_2 != null) {
//            addOrNot(ctextview8_2, childgroup.schools.toString())
//        }
//
//        return convertview
//    }
//
//    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
//
//        return true
//    }
//
////    override fun
//
//
//
//    fun addOrNot(textview: TextView, str: String) {
//
//        textview.text = str
//    }
//}