package dev.maxc.shuffler.models.node

import dev.maxc.shuffler.models.price.Price
import dev.maxc.shuffler.models.users.Author
import java.util.*

/**
 * @author Max Carter
 * @since  03/03/2020
 */
class Package(
    id: Int,
    parentId: Int,
    name: String,
    info: String = "",
    author: Author,
    uploadDate: Date,
    price: Price
) : RecyclerDisplayModel(id, parentId, name, info, author, uploadDate, RecyclerNode.PACKAGE)