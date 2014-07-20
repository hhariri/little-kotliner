package com.hadihariri.littleKotliner.tests

import org.junit.Test
import com.hadihariri.littleKotliner.*

public class EqTests {

    Test fun eqOfTwoNonNumericAtomsThatAreSameReturnsTrue() {
        val atom1 = "Harry"
        val atom2 = "Harry"
        test.assertEquals(true, eq(atom1, atom2))
    }

    Test fun eqOfTwoNonNumericAtomsThatAreNontSameReturnsTrue() {
        val atom1 = "margarine"
        val atom2 = "butter"
        test.assertEquals(false, eq(atom1, atom2))
    }

    Test fun eqOfTwoListsReturnsInvalidQuestion() {
        val list1 = list<Any>()
        val list2 = list<Any>("strawberry")
        test.failsWith(javaClass<InvalidQuestionException>(), { eq(list1, list2) })
    }

    Test fun eqOfTwoNumbersReturnsInvalidQuestion() {
        val atom1 = 6
        val atom2 = 7
        test.failsWith(javaClass<InvalidQuestionException>(), { eq(atom1, atom2) })
    }

    Test fun eqOfTwoDoublesReturnsInvalidQuestion() {
        val atom1 = 6.1
        val atom2 = 7.1
        test.failsWith(javaClass<InvalidQuestionException>(), { eq(atom1, atom2) })
    }

    Test fun eqOfCarOfListWhichIsAtomAndMatchingAtomReturnsTrue() {
        val atom1 = car(list<Any>("Mary", "had", "a", "little", "lamb", "chop"))
        val atom2 = "Mary"
        test.assertEquals(true, eq(atom1, atom2))
    }

}