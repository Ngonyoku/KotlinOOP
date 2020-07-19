package com.rik

class USAddress(
    firstLine: String,
    secondLine: String,
    city: String,
    state: String,
    zipcode: USZipCode
) : PostalAddress(firstLine, secondLine, city, state, zipcode)