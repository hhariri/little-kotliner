package com.hadihariri.littleKotliner.tests

import org.junit.Test
import com.hadihariri.littleKotliner.*
import kotlin.test.assertEquals

public class AtomTests {

    Test fun atomOfAtomReturnsTrue() {
        val atom = "Harry"
        assertEquals(true, atom(atom))
    }

    Test fun atomOfListReturnsFalse() {
        val list = list("Harry", "had", "a", "heap", "of", "apples")
        assertEquals(false, atom(list))
    }

    Test fun atomOfCarOfListWithAtomReturnsTrue() {
        val list = list<Any>("Harry", "had", "a", "heap", "of", "apples")
        assertEquals(true, atom(car(list)))
    }

    Test fun atomOfCarOfCdrOfListWhereCdrReturnsListsRetursnFalse() {
        val list = list("swing", list("low", "sweet"), "cherry", "oat")
        assertEquals(false, atom(cdr(cdr(list))))
    }
}