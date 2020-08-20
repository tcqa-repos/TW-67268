package com.example

import kotlin.test.Test
import kotlin.test.assertEquals

class CommonClassTest {
    @Test
    fun testCommonMethod() {
        assertEquals("common", CommonClass().commonTestedMethod())
    }
}