package com.hadihariri.littleKotliner.tests

import org.junit.Test
import com.hadihariri.littleKotliner.*
import kotlin.test.assertEquals

public class InsertLTests {

    Test fun insertLOnListWillInsertNewToTheLeftOfOld() {
        val input = list<Any>("ice", "cream", "with", "fudge", "for", "desert")
        assertEquals(
                list("ice", "cream", "with", "hot", "fudge", "for", "desert"),
                insertL("hot", "fudge", input)
        )
    }

}