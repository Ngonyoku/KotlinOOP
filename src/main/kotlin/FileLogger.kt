package com.rik

import java.nio.file.Path

class FileLogger(val file: Path) : Logger {
    override fun debug(msg: String) {

    }

    override fun warn(msg: String) {
        TODO("Not yet implemented")
    }
}