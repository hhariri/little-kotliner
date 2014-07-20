package com.hadihariri.littleKotliner.tests

import org.junit.Test
import kotlin.test.assertEquals
import com.hadihariri.littleKotliner.*


public class LatTests {

    Test fun latOfListWhereEachExpressionIsAtomReturnsTrue() {
        val list = list<Any>("Jack", "Sprat", "could", "eat", "no", "chicken", "fat")
        assertEquals(true, lat(list))
    }

    Test fun latOfListWhereOneExpressionIsListReturnsFalse() {
        val list = list(list("Jack"), "Sprat", "could", "eat", "no", "chicken", "fat")
        assertEquals(false, lat(list))
    }

    org.junit.Test fun latOfEmptyListReturnsTrue() {
        val list = list<Any>()
        assertEquals(true, lat(list))
    }
}
