package com.hadihariri.littleKotliner.tests

import org.junit.Test
import com.hadihariri.littleKotliner.*

public class AtomTests {

    Test fun atomOfAtomReturnsTrue() {
        val atom = "Harry"
        test.assertEquals(true, atom(atom))
    }

    Test fun atomOfListReturnsFalse() {
        val list = list("Harry", "had", "a", "heap", "of", "apples")
        test.assertEquals(false, atom(list))
    }

    Test fun atomOfCarOfListWithAtomReturnsTrue() {
        val list = list<Any>("Harry", "had", "a", "heap", "of", "apples")
        test.assertEquals(true, atom(car(list)))
    }

    Test fun atomOfCarOfCdrOfListWhereCdrReturnsListsRetursnFalse() {
        val list = list("swing", list("low", "sweet"), "cherry", "oat")
        test.assertEquals(false, atom(cdr(cdr(list))))
    }
}