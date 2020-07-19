package com.rik

abstract class PostalCode(val postCode: String) {
    abstract fun verify()

    init {
        verify()
    }
}