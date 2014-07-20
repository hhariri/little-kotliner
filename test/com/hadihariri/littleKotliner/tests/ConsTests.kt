package com.hadihariri.littleKotliner.tests

import org.junit.Test
import com.hadihariri.littleKotliner.*


public class ConsTests() {


    Test fun consAddsAtomToFrontOfList() {
        val list = list<Any>("butter", "jelly")
        val atom = "peanut"
        test.assertEquals(list("peanut", "butter", "jelly"), cons(atom, list))
    }

    Test fun consAdssAnySExpressionToFrontOfList() {
        val expression = list<Any>("banana", "and")
        val list = list<Any>("peanut", "butter", "jelly")
        test.assertEquals(list(list("banana", "and"), "peanut", "butter", "jelly"), cons(expression, list))
    }

    Test fun consListAndEmptyListReturnsListContainingOriginalList() {
        val list = list("a", "b", list("c"))
        val emptyList = list<Any>()
        test.assertEquals(list(list("a", "b", list("c"))), cons(list, emptyList))
    }

    Test fun consListAndAtomShouldNotCompile() {
        val expression = list(list("a", "b", "c"))
        //assertEquals("", cons(expression, "b"))
    }


}