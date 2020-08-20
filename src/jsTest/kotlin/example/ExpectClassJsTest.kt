package com.example

import kotlin.test.Test
import kotlin.test.assertEquals

class ExpectClassJsTest {
    @Test
    fun testExtension() {
        assertEquals("expect js", ExpectClass().expectedMethod())
    }
}