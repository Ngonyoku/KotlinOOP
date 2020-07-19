package com.rik

import java.nio.file.Paths

fun main() {
//    val postCode = USZipCode("12345")
    val logger: Logger = FileLogger(Paths.get("/some/file.log"))
//    val name = Name()
//    name.name = "Ngonyoku"
//    val review = PersonalReview(
//        meetingName = "My Meeting",
//        employee = Participant(name),
//        reviewers = listOf(),
//        location = Room("Kayole")
//    )
//
//    val meeting = Meeting(
//        meetingName = "Morio Fulani",
//        location = UKAddress(
//            "a House",
//            "a Street",
//            "a City",
//            "a County",
//            "a postcode"
//        )
//    )
//    println("Meeting has the name => $review and at ${review.locationName}")
//    review.closeReview()
//
//    val name = Name()
//    name.name = "Ngonyoku"
//    val participant = Participant(name, "ngonyoku001@gmail.com")
//
//    meeting.addParticipant(participant)
//    val canolicalEmail = participant.canonicalEmail

//    meeting.addParticipant("Ngonyoku")
//    meeting.logger
//    meeting.meetingName = "Ngonyoku"
}