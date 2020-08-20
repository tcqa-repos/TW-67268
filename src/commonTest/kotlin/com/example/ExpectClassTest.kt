package com.example

import kotlin.test.Test
import kotlin.test.assertEquals

class ExpectClassTest {
    @Test
    fun testExtension() {
        assertEquals("extension", ExpectClass().extension())
    }
}