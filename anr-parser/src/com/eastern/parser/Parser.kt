package com.eastern.parser

import com.eastern.parser.er.AnalyzerSet
import com.eastern.parser.model.ContentDesc
import com.eastern.parser.report.Reporter
import java.io.File


object Parser : IParser {

    override fun parse(file: File): String {
        val contentDesc = ContentDesc("")
        val reporter = Reporter()
        for (clazz in AnalyzerSet.values()) {
            clazz.go(reporter, contentDesc)
        }
        return ""
    }
}