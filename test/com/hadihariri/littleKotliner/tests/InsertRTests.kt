package com.hadihariri.littleKotliner.tests

import org.junit.Test
import com.hadihariri.littleKotliner.*
import kotlin.test.assertEquals

public class InsertRTests {

    Test fun insertROnListWillInsertNewToTheRightOfOld() {
        val input = list<Any>("ice", "cream", "with", "fudge", "for", "desert")
        assertEquals(
                        list("ice", "cream", "with", "fudge", "topping", "for", "desert"),
                        insertR("topping", "fudge", input)
                    )
    }


}