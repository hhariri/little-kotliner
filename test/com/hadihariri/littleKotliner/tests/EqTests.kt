package com.hadihariri.littleKotliner.tests

import org.junit.Test
import com.hadihariri.littleKotliner.*
import kotlin.test.assertEquals
import kotlin.test.failsWith

public class EqTests {

    Test fun eqOfTwoNonNumericAtomsThatAreSameReturnsTrue() {
        val atom1 = "Harry"
        val atom2 = "Harry"
        assertEquals(true, eq(atom1, atom2))
    }

    Test fun eqOfTwoNonNumericAtomsThatAreNontSameReturnsTrue() {
        val atom1 = "margarine"
        val atom2 = "butter"
        assertEquals(false, eq(atom1, atom2))
    }

    Test fun eqOfTwoListsReturnsInvalidQuestion() {
        val list1 = list<Any>()
        val list2 = list<Any>("strawberry")
        failsWith(javaClass<InvalidQuestionException>(), { eq(list1, list2) })
    }

    Test fun eqOfTwoNumbersReturnsInvalidQuestion() {
        val atom1 = 6
        val atom2 = 7
        failsWith(javaClass<InvalidQuestionException>(), { eq(atom1, atom2) })
    }

    Test fun eqOfTwoDoublesReturnsInvalidQuestion() {
        val atom1 = 6.1
        val atom2 = 7.1
        failsWith(javaClass<InvalidQuestionException>(), { eq(atom1, atom2) })
    }

    Test fun eqOfCarOfListWhichIsAtomAndMatchingAtomReturnsTrue() {
        val atom1 = car(list("Mary", "had", "a", "little", "lamb", "chop"))
        val atom2 = "Mary"
        assertEquals(true, eq(atom1, atom2))
    }

}