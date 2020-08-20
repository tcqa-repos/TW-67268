package com.example

expect class ExpectClass() {
    fun expectedMethod(): String
}

fun ExpectClass.extension(): String {
    return "extension"
}