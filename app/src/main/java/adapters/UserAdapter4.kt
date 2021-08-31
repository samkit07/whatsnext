package adapters

import Models.page4
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.what_next.R
import kotlinx.android.synthetic.main.page10.view.*
import kotlinx.android.synthetic.main.page4.view.*
import kotlinx.android.synthetic.main.page9.view.*
import kotlinx.android.synthetic.main.page9.view.expandable_layout
import kotlinx.android.synthetic.main.page9.view.linearlay
import kotlinx.android.synthetic.main.page9.view.tv_website

class UserAdapter4(val exlist:ArrayList<page4>) : RecyclerView.Adapter<UserAdapter4.Viewholder>() {
    class Viewholder(view: View) : RecyclerView.ViewHolder(view){
        val exam = view.tv_exam
        val conduct= view.findViewById(R.id.tv_conduct) as TextView
        val appliFor = view.tv_appliFor
        val notification = view.tv_notification
        val selection = view.tv_selection
        val website = view.tv_website
        val linearlay = view.linearlay
        val exlayout = view.expandable_layout
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.page4, parent, false)
        return Viewholder(itemView)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        val item = exlist[position]
        holder.exam.text = item.name
//        if (holder.conduct.text == "") {holder.conduct.text = "--"}else{holder.conduct.text = item.conductedBy}
        holder.conduct.text = item.conductedBy
        holder.appliFor.text = item.applicationFor
        holder.notification.text = item.notificationMonth
        holder.selection.text = item.modeOfSelection
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