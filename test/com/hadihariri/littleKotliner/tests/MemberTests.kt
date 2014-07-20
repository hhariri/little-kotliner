package com.hadihariri.littleKotliner.tests

import org.junit.Test

import com.hadihariri.littleKotliner.*
import kotlin.test.assertEquals

public class MemberTests {

    Test fun memberOfAtomInListReturnTrue() {
        val list = list<Any>("coffee", "tea", "milk")
        assertEquals(true, member("tea", list))

    }

    Test fun memberOfAtomNotInListReturnsFalse() {
        val list = list<Any>("coffee", "tea", "milk")
        assertEquals(false, member("bread", list))
    }

    Test fun memberOfAtomInEmptyListReturnsFalse() {
        val list = list<Any>()
        assertEquals(false, member("tea", list))
    }
}