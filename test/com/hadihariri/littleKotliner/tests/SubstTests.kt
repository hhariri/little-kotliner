package com.hadihariri.littleKotliner.tests

import org.junit.Test
import com.hadihariri.littleKotliner.*
import kotlin.test.assertEquals

public class SubstTests {

    Test fun substReplacesTheFirstOccurenceOfOldInListWithNew() {
        val input = list<Any>("ice", "cream", "with", "fudge", "for", "desert")
        assertEquals(list("ice", "cream", "with", "topping", "for", "desert"),
                subst("topping", "fudge", input))
    }

    Test fun subst2ReplacesTheFirstOccurenceOfOld1OrOld2InListWithNew() {
        val input = list<Any>("banana", "ice", "cream", "with", "chocolate", "topping")
        assertEquals(list("vanilla", "ice", "cream", "with", "chocolate", "topping"),
                subst2("vanilla", "chocolate", "banana", input))
    }


}