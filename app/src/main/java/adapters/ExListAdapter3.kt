package adapters

import Models.page3
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.TextView
import com.example.what_next.R
import kotlinx.android.synthetic.main.page3.view.*
import kotlinx.android.synthetic.main.page3_1.view.*

class ExListAdapter3 internal constructor(private val context:Context, private val studentType: ArrayList<page3>, private val options:HashMap<page3,ArrayList<String>>): BaseExpandableListAdapter(){
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

        var convertView= convertView
        val title=getGroup(groupPosition) as page3

        if (convertView==null) {
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.page3, null)
        }
        val studentTypeTv=convertView!!.tv_studentType
        studentTypeTv.setText(title.studentType)
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
        val coursetitle = getChild(groupPosition,childPosition) as String

        if (convertView==null) {
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.page3_1, null)
        }
        val courseNameTv=convertView!!.tv_option
        courseNameTv.setText(coursetitle)
        return convertView
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }
}