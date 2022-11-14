package com.padc.themoviebooking.data.vos

import alirezat775.lib.carouselview.CarouselModel

class EmptyVisaVo constructor(private val text: String) : CarouselModel() {

    fun getText(): String {
        return text
    }
}