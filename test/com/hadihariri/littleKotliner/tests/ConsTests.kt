package com.hadihariri.littleKotliner.tests

import org.junit.Test
import com.hadihariri.littleKotliner.*
import kotlin.test.assertEquals


public class ConsTests() {


    Test fun consAddsAtomToFrontOfList() {
        val list = list("butter", "jelly")
        val atom = "peanut"
        assertEquals(list("peanut", "butter", "jelly"), cons(atom, list))
    }

    Test fun consAdssAnySExpressionToFrontOfList() {
        val expression = list("banana", "and")
        val list = list("peanut", "butter", "jelly")
        assertEquals(list(list("banana", "and"), "peanut", "butter", "jelly"), cons(expression, list))
    }

    Test fun consListAndEmptyListReturnsListContainingOriginalList() {
        val list = list("a", "b", list("c"))
        val emptyList = list<Any>()
        assertEquals(list(list("a", "b", list("c"))), cons(list, emptyList))
    }

    Test fun consListAndAtomShouldNotCompile() {
        val expression = list(list("a", "b", "c"))
        //assertEquals("", cons(expression, "b"))
    }


}