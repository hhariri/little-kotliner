package com.hadihariri.littleKotliner.tests

import org.junit.Test
import com.hadihariri.littleKotliner.*

public class RemberTests {

    Test fun remberRemovesExpressionFromListIfExists() {
        val list = list<Any>("lamb", "chops", "and", "mint", "jelly")
        test.assertEquals(list("lamb", "chops", "and", "jelly"), rember("mint", list))
    }
}