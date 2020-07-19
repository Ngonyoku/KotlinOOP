package com.rik

interface Logger {
    fun debug(msg: String)
    fun warn(msg: String)
    fun info(msg: String) {
        warn(msg)
    }
}