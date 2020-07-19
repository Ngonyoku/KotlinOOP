package com.rik

class UKAddress(
    firstLine: String,
    secondLine: String,
    city: String,
    county: String,
    postCode: UKPostCode
) : PostalAddress(firstLine, secondLine, city, county, postCode)