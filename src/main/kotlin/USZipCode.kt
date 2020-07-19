package com.rik

import java.util.regex.Pattern

class USZipCode(zipCode: String) : PostalCode(zipCode) {
    override fun verify() {
        val pattern = Pattern.compile("^[0-9]{5}(?:-[0-9]{4})?$")
        val matcher = pattern.matcher(postCode)
        if (!matcher.matches()) throw IllegalArgumentException()
    }
}