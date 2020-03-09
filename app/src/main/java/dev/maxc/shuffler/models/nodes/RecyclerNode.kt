package dev.maxc.shuffler.models.nodes

import dev.maxc.shuffler.models.price.Price
import dev.maxc.shuffler.models.users.Author
import java.util.*

/**
 * @author Max Carter
 * @since  03/03/2020
 */
interface RecyclerNode {
    fun getId() : Int
    fun getType() : RecyclerNodeTypes
    fun getTitle() : String
    fun getSubtitle() : String
    fun getAuthor() : Author
    fun getUploadDate() : Date
    fun getPrice() : Price
    fun getCategory() : Category
}