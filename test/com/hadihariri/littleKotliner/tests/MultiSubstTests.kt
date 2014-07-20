package com.hadihariri.littleKotliner.tests

import org.junit.Test
import com.hadihariri.littleKotliner.*
import kotlin.test.assertEquals

public class MultiSubstTests {

    Test fun multiInsertLInsertsNewToTheLeftOfEveryOld() {
        val input = list<Any>("cup", "of", "tea", "and", "cup", "of", "coffee")
        assertEquals(list("cup", "of a", "tea", "and", "cup", "of a", "coffee"),
                multiSubst("of a", "of", input)
        )
    }


}