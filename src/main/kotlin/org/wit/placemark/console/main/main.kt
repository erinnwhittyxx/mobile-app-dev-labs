package org.wit.placemark.console.main

import mu.KotlinLogging
import org.wit.placemark.console.controllers.PlacemarkController
import org.wit.placemark.console.models.PlacemarkMemStore
import org.wit.placemark.console.views.PlacemarkView

val logger = KotlinLogging.logger {}

val placemarks = PlacemarkMemStore()
val placemarkView = PlacemarkView()
val controller = PlacemarkController()


fun main(args: Array<String>) {
    PlacemarkController().start()
}