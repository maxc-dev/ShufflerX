package dev.maxc.shuffler.models.users

import dev.maxc.shuffler.models.EMPTY_STRING

/**
 * @author Max Carter
 * @since  03/03/2020
 */
data class Author(val username: String, val title: String = EMPTY_STRING, val forename: String, val surname: String) {
    override fun toString(): String {
        return (if (title.isBlank()) "" else "$title ") + "$forename $surname"
    }

    companion object {
        val EMPTY_AUTHOR = Author("", "", "", "")
    }
}
