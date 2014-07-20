package com.hadihariri.littleKotliner.tests

import org.junit.Test
import com.hadihariri.littleKotliner.*
import kotlin.test.assertEquals

public class MultiInsertLTests {

    Test fun multiInsertLInsertsNewToTheLeftOfEveryOld() {
        val input = list<Any>("cup", "of", "tea", "and", "cup", "of", "coffee")
        assertEquals(list("a", "cup", "of", "tea", "and", "a", "cup", "of", "coffee"),
                multiInsertL("a", "cup", input)
        )
    }

    Test fun multiInsertLInsertsNewToTheLeftOfEveryOld1() {
        val input = list<Any>("chips", "and", "fish", "or", "fish", "and", "fried")
        assertEquals(list("chips", "and", "fried", "fish", "or", "fried", "fish", "and", "fried"),
                multiInsertL("fried", "fish", input)
        )
    }

}