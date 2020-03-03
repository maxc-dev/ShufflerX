package dev.maxc.shuffler.ui.packages

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.maxc.shuffler.R

/**
 * @author Max Carter
 * @since  03/03/2020
 */
class PackageAdapter : RecyclerView.Adapter<PackageAdapter.PackageViewHolder>() {

    class PackageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PackageViewHolder {
        return PackageViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.package_node,
                parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return 0 //todo
    }

    override fun onBindViewHolder(holder: PackageViewHolder, position: Int) {
    }

}