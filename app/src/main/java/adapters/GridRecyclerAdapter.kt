package adapters

import Models.gridView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.what_next.CellClickListener
import com.example.what_next.R
import kotlinx.android.synthetic.main.grid_layout.view.*

class GridRecyclerAdapter(var exlist:ArrayList<gridView>,private val cellClickListener: CellClickListener): RecyclerView.Adapter<GridRecyclerAdapter.Viewhodlder>() {
    class Viewhodlder(itemView:View): RecyclerView.ViewHolder(itemView){
        var text = itemView.text
        var img = itemView.img
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewhodlder {
        return Viewhodlder(LayoutInflater.from(parent.context).inflate(R.layout.grid_layout, parent, false))
    }

    override fun onBindViewHolder(holder: Viewhodlder, position: Int) {
        val data = exlist[position]
        holder.text.text = exlist[position].text
        holder.img.setImageResource(exlist[position].img)
        holder.itemView.setOnClickListener {
            cellClickListener.onCellClickListener()
        }
    }

    override fun getItemCount(): Int {
        return exlist.size
    }
}