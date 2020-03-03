package dev.maxc.shuffler.models.question

import dev.maxc.shuffler.models.users.Author
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import java.util.*

/**
 * @author Max Carter
 * @since  03/03/2020
 */
open class RecyclerDisplayModel(
    val id: Int,
    val parentId: Int,
    val title: String,
    val subtitle: String = "",
    val author: Author,
    val uploadDate: Date,
    val type: RecyclerNode
) {
    //list of all the child nodes
    private val children: ArrayList<Int> = ArrayList()

    fun addChild(vararg children: Int) {
        children.forEach { this.children.add(it) }
    }

    fun removeChild(parent: Int) : Boolean = children.remove(parent)

    /**
     * Returns a flow of the subclass children
     * Bundle -> Package -> Category -> Question -> Answer
     */
    open fun getChildren(): Flow<Int> = children.asFlow()
}