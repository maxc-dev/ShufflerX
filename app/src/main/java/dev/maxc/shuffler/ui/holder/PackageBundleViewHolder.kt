package dev.maxc.shuffler.ui.holder

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.maxc.shuffler.R
import dev.maxc.shuffler.models.nodes.RecyclerNode
import dev.maxc.shuffler.ui.setup.SetupActivity

/**
 * @author Max Carter
 * @since  07/03/2020
 */
class PackageBundleViewHolder(itemView: View, context: Context) :
    RecyclerView.ViewHolder(itemView) {
    private val nodeTitle: TextView = itemView.findViewById(R.id.node_title)
    private val nodeDescription: TextView = itemView.findViewById(R.id.node_desc)
    private val nodeAuthor: TextView = itemView.findViewById(R.id.node_author)

    //private val nodePrice: TextView = itemView.findViewById(R.id.node_price)
    private val nodeIcon: ImageView = itemView.findViewById(R.id.node_icon)

    init {
        //val nodeButtonInfo: Button = itemView.findViewById(R.id.node_info)
        val nodeButtonStart: Button = itemView.findViewById(R.id.node_start)

        nodeButtonStart.setOnClickListener {
            context.startActivity(Intent(context, SetupActivity::class.java).apply {
                putExtra("title", "Computer Science")
            })
        }
    }

    fun format(node: RecyclerNode, context: Context) {
        nodeTitle.text = node.getTitle()
        nodeAuthor.text = node.getAuthor().toString()
        nodeDescription.text = node.getSubtitle()
        //holder.nodePrice.text = node.getPrice().formatted()
        nodeIcon.setImageDrawable(node.getCategory().getIcon(context))
    }
}