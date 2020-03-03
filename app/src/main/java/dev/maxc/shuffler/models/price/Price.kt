package dev.maxc.shuffler.models.price

/**
 * @author Max Carter
 * @since  03/03/2020
 */
class Price(val initialPrice: Double = 0.0, val currentPrice: Double = initialPrice) {
    fun isDiscounted() = initialPrice > currentPrice;
    fun isFree() = currentPrice == 0.0
}