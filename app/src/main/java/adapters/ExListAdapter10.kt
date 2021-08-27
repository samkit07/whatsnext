package adapters

import Models.page10
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import com.example.what_next.R
import kotlinx.android.synthetic.main.sample10.view.*
import kotlinx.android.synthetic.main.sample10_1.view.*

class ExListAdapter10 internal constructor(private val context:Context, val namelist:ArrayList<page10>, val courselist:HashMap<page10, ArrayList<String>>):
    BaseExpandableListAdapter() {
    override fun getGroupCount(): Int {
        return namelist.size
    }

    override fun getChildrenCount(p0: Int): Int {
        return this.courselist[this.namelist[p0]]!!.size
    }

    override fun getGroup(p0: Int): Any {
        return namelist[p0]
    }

    override fun getChild(p0: Int, p1: Int): Any {
        return this.courselist[this.namelist[p0]]!![p1]
    }

    override fun getGroupId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getChildId(p0: Int, p1: Int): Long {
        return p1.toLong()
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(p0: Int, p1: Boolean, p2: View?, p3: ViewGroup?): View {
        var p2 = p2
        val title = getGroup(p0) as page10
        if (p2 == null){
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            p2 = inflater.inflate(R.layout.sample10, null)
        }
        val nametv = p2!!.tv_name
        nametv.setText(title.name)
        return p2
    }

    override fun getChildView(p0: Int, p1: Int, p2: Boolean, p3: View?, p4: ViewGroup?): View {
        var p3 = p3
        val coursetitle = getChild(p0, p1) as String
        if (p3 == null){
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            p3 = inflater.inflate(R.layout.sample10_1, null)
        }
        val coursetv = p3!!.tv_course
        coursetv.setText(coursetitle)
        return p3
    }

    override fun isChildSelectable(p0: Int, p1: Int): Boolean {
        return true
    }
}