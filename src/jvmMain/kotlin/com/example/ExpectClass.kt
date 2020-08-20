package com.example

actual class ExpectClass {
    actual fun expectedMethod(): String {
        return "expect jvm"
    }
}