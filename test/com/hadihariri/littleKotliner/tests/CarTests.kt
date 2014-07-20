package com.hadihariri.littleKotliner.tests

import org.junit.Test
import com.hadihariri.littleKotliner.*
import kotlin.test.assertEquals
import kotlin.test.failsWith

public class CarTests {

    Test fun carOnScalarShouldReturnScalar() {
        val input = list(1, 2, 3, 4, 5)
        assertEquals(1, car(input))
    }

    Test fun carOnListShouldReturnList() {
        val input = list(list(1, 2), 3, 4, 5)
        assertEquals(arrayListOf(1, 2), car(input))
    }

    Test fun carOnAtomShouldNotCompile() {
        val input = "hotdog"
        //car(input) // Cannot compile
    }

    Test fun carOnEmptyListShouldReturnInvalidQuestion() {
        val input = list<Any>()
        failsWith(javaClass<InvalidQuestionException>(), { car(input) })
    }

    Test fun carOnListWithOtherListsShouldReturnFirstElement() {
        val input = list(list(list("hotdogs")), list("and"), list("pickle"), "relish")
        test.assertEquals(arrayListOf(arrayListOf("hotdogs")), car(input))
    }

}