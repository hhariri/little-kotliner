package com.hadihariri.littleKotliner.tests

import org.junit.Test
import com.hadihariri.littleKotliner.*
import kotlin.test.assertEquals

public class RemberTests {

    Test fun remberRemovesExpressionFromListIfExists() {
        val list = list<Any>("lamb", "chops", "and", "mint", "jelly")
        assertEquals(list("lamb", "chops", "and", "jelly"), rember("mint", list))
    }

    Test fun remberReturnsOriginalListWhenMemberIsNotPresent() {
        val list = list<Any>("lamb", "chops", "and", "mint")
        assertEquals(list<Any>("lamb", "chops", "and", "mint"), rember("jelly", list))
    }

    Test fun remberOnEmptyListReturnsEmptyList() {
        val list = quote()
        assertEquals(quote(), rember("something", list))
    }
}