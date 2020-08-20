package com.example

import kotlin.test.Test
import kotlin.test.assertEquals

class CommonClassJsTest {
    @Test
    fun testCommonMethod() {
        assertEquals("js", CommonClass().jsTestedMethod())
    }
}