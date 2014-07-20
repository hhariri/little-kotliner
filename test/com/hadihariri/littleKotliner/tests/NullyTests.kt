package com.hadihariri.littleKotliner.tests

import org.junit.Test
import com.hadihariri.littleKotliner.*
import kotlin.test.assertEquals

public class NullyTests {

    Test fun nullyOnEmptyListReturnsTrue() {
        val list = list<Any>()
        assertEquals(true, nully(list))
    }

    Test fun nullyOnNonEmptyListReturnsFalse() {
        val list = list<Any>("a", "b", "c")
        assertEquals(false, nully(list))
    }

    Test fun nullyOnAtomWilNotCompile() {
        val atom = "spaghetti"
        //assertEquals("", nully(atom))
    }


}