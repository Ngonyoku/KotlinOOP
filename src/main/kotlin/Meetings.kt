package com.rik

import java.lang.IllegalArgumentException

open class Meeting(val meetingName: String, open val location: Location) {

    private val logger = Logger()
    open val locationName = ""
    fun addParticipant(participant: Participant) {
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