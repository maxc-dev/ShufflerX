package dev.maxc.shuffler.ui.popular

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.maxc.shuffler.R
import dev.maxc.shuffler.models.nodes.RecyclerNode
import dev.maxc.shuffler.ui.holder.PackageBundleViewHolder

/**
 * @author Max Carter
 * @since  03/03/2020
 */
class PackageAdapter(private val context: Context, nodes: ArrayList<RecyclerNode> = arrayListOf()) : RecyclerView.Adapter<PackageBundleViewHolder>() {
    var nodes = ArrayList<RecyclerNode>()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    init {
        this.nodes = nodes
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PackageBundleViewHolder {
        return PackageBundleViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.node_bundle,
                parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return nodes.size
    }

    override fun onBindViewHolder(holder: PackageBundleViewHolder, position: Int) {
        holder.format(nodes[position], context)
    }

}