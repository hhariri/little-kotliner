package com.hadihariri.littleKotliner.tests

import org.junit.Test
import com.hadihariri.littleKotliner.*
import kotlin.test.assertEquals

public class FirstsTests {

    Test fun firstsOnListOfListsReturnsListWithFirstExpressionOfEachList() {
        val input =  list<Any>(
                        list("apple", "peach", "pumpkin"),
                        list("plum", "pear", "cherry"),
                        list("grape", "raisin", "pea"),
                        list("bean", "carrot", "eggplant")
                    )
        assertEquals(list("apple", "plum", "grape","bean"), firsts(input))

    }

    Test fun firstsOnEmptyListsReturnsEmptyList() {
        val input = list<Any>()
        assertEquals(quote(), firsts(input))
    }

}