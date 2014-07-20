package com.hadihariri.littleKotliner.tests

import org.junit.Test
import com.hadihariri.littleKotliner.*
import kotlin.test.assertEquals

public class MultiInsertRTests {

    Test fun multiInsertRInsertsNewToTheRightOfEveryOld() {
        val input = list<Any>("cup", "tea", "and", "cup", "coffee")
        assertEquals(list("cup", "of", "tea", "and", "cup", "of", "coffee"),
                    multiInsertR("of", "cup", input)
                )
    }

}