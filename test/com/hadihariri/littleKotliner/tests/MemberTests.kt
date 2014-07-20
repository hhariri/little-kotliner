package com.hadihariri.littleKotliner.tests

import org.junit.Test

import com.hadihariri.littleKotliner.*

public class MemberTests {

    Test fun memberOfAtomInListReturnTrue() {
        val list = list<Any>("coffee", "tea", "milk")
        test.assertEquals(true, member("tea", list))

    }

    Test fun memberOfAtomNotInListReturnsFalse() {
        val list = list<Any>("coffee", "tea", "milk")
        test.assertEquals(false, member("bread", list))
    }

    Test fun memberOfAtomInEmptyListReturnsFalse() {
        val list = list<Any>()
        test.assertEquals(false, member("tea", list))
    }
}