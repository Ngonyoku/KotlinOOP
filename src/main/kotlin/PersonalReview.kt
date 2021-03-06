package com.rik

class PersonalReview(
    meetingName: String,
    val employee: Participant,
    reviewers: List<Participant>,
    override val location: Room
) : Meeting(meetingName, location) {

    override val locationName
        get() = location.roomName

    fun closeReview() {
        println("Review Ended")
        verifyMeeting()
    }

    override fun verifyMeeting() {
        println("PersonalReview : Verify Meeting")
        super.verifyMeeting()
    }
}