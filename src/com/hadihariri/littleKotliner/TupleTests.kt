package com.hadihariri.littleKotliner.tests

import org.junit.Test
import com.hadihariri.littleKotliner.*
import kotlin.test.assertEquals

public class TupleTests {

    Test fun listOfNumbersIsATuple() {
        val input = list<Any>(2, 11, 3, 79, 47, 6)
        assertEquals(true, tup(input))
    }
}