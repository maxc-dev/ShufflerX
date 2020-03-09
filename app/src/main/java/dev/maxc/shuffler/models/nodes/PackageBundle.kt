package dev.maxc.shuffler.models.nodes

import dev.maxc.shuffler.models.price.Price
import dev.maxc.shuffler.models.users.Author
import java.util.*

/**
 * @author Max Carter
 * @since  03/03/2020
 */
class PackageBundle(
    private val id: Int,
    val name: String,
    val info: String = "",
    private val author: Author,
    private val uploadDate: Date,
    private val category: Category,
    private val price: Price
) : RecyclerNode {
    override fun getId(): Int = id

    override fun getType(): RecyclerNodeTypes = RecyclerNodeTypes.BUNDLE

    override fun getTitle(): String = name

    override fun getSubtitle(): String = info

    override fun getAuthor(): Author = author

    override fun getUploadDate(): Date = uploadDate

    override fun getPrice(): Price = price

    override fun getCategory(): Category = category
}