package com.padc.themoviebooking.data.vos

import alirezat775.lib.carouselview.CarouselModel

class VisaVO constructor(private var id: Int) : CarouselModel() {

    fun getId(): Int {
        return id
    }
}