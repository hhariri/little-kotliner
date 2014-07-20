package com.hadihariri.littleKotliner.tests

import org.junit.Test
import com.hadihariri.littleKotliner.*
import kotlin.test.assertEquals

public class MultiremberTests {

    Test fun multiremberRemovesAllInstancesOfAtomFromList() {
        val input = list<Any>("coffee", "cup", "tea", "cup", "and", "hick", "cup")
        assertEquals(list("coffee", "tea", "and", "hick"), multiRember("cup", input))
    }
}