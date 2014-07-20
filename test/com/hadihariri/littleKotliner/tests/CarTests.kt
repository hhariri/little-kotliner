package com.hadihariri.littleKotliner.tests

import org.junit.Test
import com.hadihariri.littleKotliner.*

public class CarTests {

    Test fun carOnScalarShouldReturnScalar() {

        val list = list<Any>(1, 2, 3, 4, 5)

        test.assertEquals(1, car(list))

    }

    Test fun carOnListShouldReturnList() {

        val list = list(list<Any>(1, 2), 3, 4, 5)

        test.assertEquals(arrayListOf(1, 2), car(list))

    }

    Test fun carOnAtomShouldNotCompile() {
        val input = "hotdog"
        //car(input) // Cannot compile
    }

    Test fun carOnEmptyListShouldReturnInvalidQuestion() {
        val input = list<Any>()

        test.failsWith(javaClass<InvalidQuestionException>(), { car(input) })
    }

    Test fun carOnListWithOtherListsShouldReturnFirstElement() {
        val input = list(list(list("hotdogs")), list("and"), list("pickle"), "relish")
        test.assertEquals(arrayListOf(arrayListOf("hotdogs")), car(input))
    }

}