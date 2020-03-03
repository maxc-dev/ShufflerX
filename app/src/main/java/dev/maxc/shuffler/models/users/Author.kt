package dev.maxc.shuffler.models.users

/**
 * @author Max Carter
 * @since  03/03/2020
 */
data class Author(val username: String, val title: String = "", val forename: String, val surname: String) {
    companion object {
        val EMPTY_AUTHOR = Author("", "", "", "")
    }
}
