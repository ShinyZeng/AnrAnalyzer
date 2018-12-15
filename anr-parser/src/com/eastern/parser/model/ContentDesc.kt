package com.eastern.parser.model


class ContentDesc(val pkgName: String) {
    /**
     *
     */
    val threadList = ArrayList<ThreadDesc>()

    val systemDesc = SystemDesc("")
}