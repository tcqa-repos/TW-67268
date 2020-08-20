package com.example

import kotlin.test.Test
import kotlin.test.assertEquals

class ExpectClassJvmTest {
    @Test
    fun testExtension() {
        assertEquals("expect jvm", ExpectClass().expectedMethod())
    }
}