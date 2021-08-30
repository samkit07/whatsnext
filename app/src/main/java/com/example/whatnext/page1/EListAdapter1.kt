package com.example.practice2

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import com.example.whatnext.R
import models.Examinations1
import models.Fields
import models.Model1

class EListAdapter1 internal constructor(
    private val context: Context, private val parent: List<Model1>,
    private val child: HashMap<Model1, List<Fields>>
) :
    BaseExpandableListAdapter() {


    override fun getGroupCount(): Int {

        return parent.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {

        return this.child[this.parent[groupPosition]]!!.size
    }

    override fun getGroup(groupPosition: Int): Any {

        return parent[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {

        return this.child[this.parent[groupPosition]]!![childPosition]
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

        val parentgroup = getGroup(groupPosition) as Model1

        if (convertView == null) {

            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.parent1, null)
        }


        val ptextview1_1 = convertView!!.findViewById<TextView>(R.id.ptextview1_1)
        val ptextview2_1 = convertView!!.findViewById<TextView>(R.id.ptextview2_1)
        val ptextview3_1 = convertView!!.findViewById<TextView>(R.id.ptextview3_1)
//        val ptextview4_1 = convertView!!.findViewById<TextView>(R.id.ptextview4_1)

//        val ptextview4_1 = convertView!!.findViewById<TextView>(R.id.l)

        ptextview1_1.text = parentgroup.name
        ptextview2_1.text = "Duration - ${parentgroup.duration}"

        ptextview3_1.visibility = View.GONE

        if(parentgroup.examinations.isNotEmpty()) {

            ptextview3_1.text = "Exams \n \n ${parentgroup.examinations.toString().replace(",","\n")
                .replace("[","").replace("]","")}"
//            ptextview3_1_1.text = parentgroup.examinations.toString()

            ptextview3_1.visibility = View.VISIBLE

        }

//            .toString().replace("[", "")
//            .replace("]", "").replace(",", "\n")


        ptextview2_1.visibility = View.VISIBLE
//        ptextview3_1.visibility = View.VISIBLE
//        ptextview3_1_1.visibility = View.VISIBLE
//        prelativelayout_1.visibility = View.VISIBLE
//        ptextview4_1.visibility = View.VISIBLE

        if (ptextview2_1.text == "") ptextview2_1.visibility = View.GONE

//        if (ptextview4_1.text == "") ptextview4_1.visibility = View.GONE


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
            convertView = inflater.inflate(R.layout.child1, null)
        }

        val ctextview1_2 = convertView!!.findViewById<TextView>(R.id.ctextview1_1)
        var ctextview2_2 = convertView!!.findViewById<TextView>(R.id.ctextview2_1)
//        var prelative = convertView!!.findViewById<RelativeLayout>(R.id.prelative)

        ctextview1_2.setText(textview1_2Title.name)

        if (textview1_2Title.subFields.toString() != "[]") {

            val leftDrawable: Drawable? = AppCompatResources
                .getDrawable(context, R.drawable.keyboard_arrow_down);
            ctextview1_2.setCompoundDrawablesWithIntrinsicBounds(leftDrawable, null, null, null);
        } else ctextview1_2.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);

        var isexpandable: Boolean = textview1_2Title.expandable
        ctextview2_2.setVisibility(View.GONE)

        ctextview1_2.setOnClickListener {

            isexpandable = !isexpandable

            if (isexpandable) {

                if (textview1_2Title.subFields.toString() == "[]") {
                    ctextview1_2.setCompoundDrawablesWithIntrinsicBounds(
                        null,
                        null,
                        null,
                        null
                    )
                    ctextview2_2.setVisibility(View.GONE)

                } else {

                    val leftDrawable: Drawable? = AppCompatResources
                        .getDrawable(context, R.drawable.keyboard_arrow_up)
                    ctextview1_2.setCompoundDrawablesWithIntrinsicBounds(
                        leftDrawable,
                        null,
                        null,
                        null
                    )

                    ctextview2_2.setVisibility(View.VISIBLE)
                    ctextview2_2.setText(
                        textview1_2Title.subFields.toString().replace("[", "")
                            .replace("]", "")
                    )
                }
            } else {

                if (textview1_2Title.subFields.toString() == "[]") {
                    ctextview1_2.setCompoundDrawablesWithIntrinsicBounds(
                        null,
                        null,
                        null,
                        null
                    )
                } else {

                    ctextview2_2.setVisibility(View.GONE)
                    val leftDrawable: Drawable? = AppCompatResources
                        .getDrawable(context, R.drawable.keyboard_arrow_down);
                    ctextview1_2.setCompoundDrawablesWithIntrinsicBounds(
                        leftDrawable,
                        null,
                        null,
                        null
                    );

                }


            }
        }


//        if(isexpandable) View.VISIBLE else View.GONE

        return convertView
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {

        return true
    }


}