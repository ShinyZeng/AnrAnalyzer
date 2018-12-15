package com.eastern.parser.model


class ContentDesc(val pkgName: String) {
    /**
     *
     */
    val threadList = ArrayList<ThreadDesc>()

    var systemDesc = SystemDesc("")

    var startTime = ""

    var pid = ""
}