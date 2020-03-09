package dev.maxc.shuffler.models.nodes

import android.content.Context
import android.graphics.drawable.Drawable
import dev.maxc.shuffler.R

/**
 * @author Max Carter
 * @since  05/03/2020
 */
enum class Category(private val icon: Int) {
    EDUCATIONAL(R.drawable.ic_category_edu_24dp),
    GAMING(R.drawable.ic_category_gaming_24dp);

    fun getIcon(context: Context): Drawable? {
        return context.getDrawable(icon)
    }
}