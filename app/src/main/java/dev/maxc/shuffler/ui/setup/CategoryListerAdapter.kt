package dev.maxc.shuffler.ui.setup

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.maxc.shuffler.R
import dev.maxc.shuffler.models.nodes.CategoryNode

/**
 * @author Max Carter
 * @since  12/03/2020
 */
class CategoryListerAdapter(nodes: ArrayList<CategoryNode> = arrayListOf()) : RecyclerView.Adapter<CategoryListerAdapter.CategoryViewHolder>() {
    var nodes = ArrayList<CategoryNode>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    private val questionFormat = " Question"
    private val questionFormatPlural = " Questions"

    init {
        this.nodes = nodes
    }

    class CategoryViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val nodeTitle: TextView = itemView.findViewById(R.id.node_category_title)
        val nodeQuestions: TextView = itemView.findViewById(R.id.node_category_questions)
        private val nodeCheckBox: CheckBox = itemView.findViewById(R.id.node_category_checkbox)

        fun isSelected() = nodeCheckBox.isSelected
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.node_category,
                parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return nodes.size
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.nodeTitle.text = nodes[position].title
        val count = nodes[position].questionCount
        val questionCount = "$count ${(if (count == 1) questionFormat else questionFormatPlural)}"
        holder.nodeQuestions.text = questionCount
    }

}
