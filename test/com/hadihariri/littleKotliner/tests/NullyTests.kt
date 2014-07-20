package com.hadihariri.littleKotliner.tests

import org.junit.Test
import com.hadihariri.littleKotliner.*

public class NullyTests {

    Test fun nullyOnEmptyListReturnsTrue() {
        val list = list<Any>()
        test.assertEquals(true, nully(list))
    }

    Test fun nullyOnNonEmptyListReturnsFalse() {
        val list = list<Any>("a", "b", "c")
        test.assertEquals(false, nully(list))
    }

    Test fun nullyOnAtomWilNotCompile() {
        val atom = "spaghetti"
        //assertEquals("", nully(atom))
    }


}