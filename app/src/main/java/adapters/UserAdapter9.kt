package adapters

import Models.page9
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.what_next.R
import kotlinx.android.synthetic.main.page10.view.*
import kotlinx.android.synthetic.main.page9.view.*

class UserAdapter9(val exlist:ArrayList<page9>) : RecyclerView.Adapter<UserAdapter9.Viewholder>() {
    class Viewholder(view: View) : RecyclerView.ViewHolder(view){
        val test = view.tv_test
        val eligibility = view.tv_eligibility
        val syllabus = view.tv_syllabus
        val website = view.tv_website
        val linearlay = view.linearlay
        val exlayout = view.expandable_layout
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.page9, parent, false)
        return Viewholder(itemView)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        val item = exlist[position]
        holder.test.text = item.test
        holder.eligibility.text = item.eligibilty
        holder.syllabus.text = item.syllabus
        holder.website.text = item.website

        val isexpandable: Boolean = exlist[position].expandable
        holder.exlayout.visibility = if(isexpandable) View.VISIBLE else View.GONE

        holder.linearlay.setOnClickListener{
            val v = exlist[position]
            v.expandable = !v.expandable
            notifyItemChanged(position)
        }
    }

    override fun getItemCount(): Int {
        return exlist.size
    }


}