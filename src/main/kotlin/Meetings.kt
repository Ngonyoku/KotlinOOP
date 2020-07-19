package com.rik

import java.lang.IllegalArgumentException
import java.nio.file.Paths

open class Meeting(val meetingName: String, open val location: Location, val logger: Logger) {

    //    private val logger: Logger = FileLogger(Paths.get("/some/file.log"))
    open val locationName = ""
    fun addParticipant(participant: Participant) {
        logger.info("Participant Added")
        if (verifyParticipant(participant)) {
            println("Added ${participant.participantName}")
        }
    }

    private fun verifyParticipant(participant: Participant): Boolean {
        println("Try to Verify")
        return true
    }

    open fun verifyMeeting() {
        println("Meeting : Verify Meeting")
    }
}