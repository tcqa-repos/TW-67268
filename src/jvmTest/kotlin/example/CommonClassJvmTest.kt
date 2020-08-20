package com.example

import kotlin.test.Test
import kotlin.test.assertEquals

class CommonClassJvmTest {
    @Test
    fun testJvmMethod() {
        assertEquals("jvm", CommonClass().jvmTestedMethod())
    }
}