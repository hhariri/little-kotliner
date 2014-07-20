package com.hadihariri.littleKotliner.tests

import org.junit.Test
import com.hadihariri.littleKotliner.*
import kotlin.test.assertEquals
import kotlin.test.failsWith

public class NumberTests {


    Test fun add1Adds1ToNumber() {
        val result = add1(67)
        assertEquals(68, result)
    }

    Test fun sub1Removes1FromNumber() {
        val result = sub1(5)
        assertEquals(4, result)
    }

    Test fun sub1From0IsInvalidQuestionException() {
        failsWith(javaClass<InvalidQuestionException>(),{ sub1(0) })
    }

    Test fun plus10and20Gives30() {
        val result = plus(10, 20)
        assertEquals(30, result)
    }
}