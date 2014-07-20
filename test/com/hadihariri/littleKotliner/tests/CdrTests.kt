package com.hadihariri.littleKotliner.tests

import org.junit.Test
import com.hadihariri.littleKotliner.*


public class CdrTests {

    Test fun cdrOnListWithThreeElementsReturnsSecondAndThirdElements() {
        val input = list<Any>("a", "b", "c")
        test.assertEquals(list("b", "c"), cdr(input))
    }

    Test fun cdrOnListWithFourElementsAndFirstOneAListReturnsSecondAndThirdElements() {
        val input = list(list("a", "b", "c"), "x", "y", "z")
        test.assertEquals(list("x", "y", "z"), cdr(input))
    }

    Test fun cdrOnListWithSingleElementReturnsEmptyList()  {
        val input = list<Any>("hamburger")
        test.assertEquals(list<Any>(), cdr(input))
    }

    Test fun cdrOnAtomShouldNotCompile() {
        val input = "hotdogs"
        //assertEquals("", cdr(input))
    }

    Test fun cdrOnEmptyListShouldReturnInvalidQuestion() {
        val input = list<Any>()
        test.failsWith(javaClass<InvalidQuestionException>(), { cdr(input) })
    }

    Test fun cdrOnCdrOfAListOfElementsIsTheFirstElementOfList() {
        val input = list<Any>(list("b"), list("x", "y"), list(list("c")))
        test.assertEquals(list(list(list("c"))), cdr(cdr(input)))
    }


}