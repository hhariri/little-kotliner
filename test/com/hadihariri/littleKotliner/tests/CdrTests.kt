package com.hadihariri.littleKotliner.tests

import org.junit.Test
import com.hadihariri.littleKotliner.*
import kotlin.test.assertEquals
import kotlin.test.failsWith


public class CdrTests {

    Test fun cdrOnListWithThreeElementsReturnsSecondAndThirdElements() {
        val input = list("a", "b", "c")
        assertEquals(list("b", "c"), cdr(input))
    }

    Test fun cdrOnListWithFourElementsAndFirstOneAListReturnsSecondAndThirdElements() {
        val input = list(list("a", "b", "c"), "x", "y", "z")
        assertEquals(list("x", "y", "z"), cdr(input))
    }

    Test fun cdrOnListWithSingleElementReturnsEmptyList()  {
        val input = list("hamburger")
        assertEquals(list<Any>(), cdr(input))
    }

    Test fun cdrOnAtomShouldNotCompile() {
        val input = "hotdogs"
        //assertEquals("", cdr(input))
    }

    Test fun cdrOnEmptyListShouldReturnInvalidQuestion() {
        val input = list<Any>()
        failsWith(javaClass<InvalidQuestionException>(), { cdr(input) })
    }

    Test fun cdrOnCdrOfAListOfElementsIsTheFirstElementOfList() {
        val input = list(list("b"), list("x", "y"), list(list("c")))
        assertEquals(list(list(list("c"))), cdr(cdr(input)))
    }


}