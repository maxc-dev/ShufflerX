package dev.maxc.shuffler.models.question

import dev.maxc.shuffler.models.NO_PARENT
import dev.maxc.shuffler.models.users.Author
import java.util.*

/**
 * @author Max Carter
 * @since  03/03/2020
 */
class Bundle(
    id: Int,
    name: String,
    info: String = "",
    uploadDate: Date
) : RecyclerDisplayModel(id, NO_PARENT, name, info, Author.EMPTY_AUTHOR, uploadDate, RecyclerNode.BUNDLE)