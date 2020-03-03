package dev.maxc.shuffler.models.node

import dev.maxc.shuffler.models.users.Author
import java.util.*

/**
 * @author Max Carter
 * @since  03/03/2020
 */
interface RecyclerDisplayModel {
    fun getId() : Int
    fun getType() : RecyclerNode
    fun getTitle() : String
    fun getSubtitle() : String
    fun getAuthor() : Author
    fun getUploadDate() : Date

}