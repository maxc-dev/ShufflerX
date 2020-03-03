package dev.maxc.shuffler.models.node

import dev.maxc.shuffler.models.users.Author
import java.util.*

/**
 * @author Max Carter
 * @since  03/03/2020
 */
class Bundle(
    private val id: Int,
    val name: String,
    val info: String = "",
    private val author: Author,
    private val uploadDate: Date
) : RecyclerDisplayModel {
    override fun getId(): Int = id

    override fun getType(): RecyclerNode = RecyclerNode.BUNDLE

    override fun getTitle(): String = name

    override fun getSubtitle(): String = info

    override fun getAuthor(): Author = author

    override fun getUploadDate(): Date = uploadDate
}