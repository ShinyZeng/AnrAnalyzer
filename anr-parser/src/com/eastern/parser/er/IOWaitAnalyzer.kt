package com.eastern.parser.er

import com.eastern.parser.model.ContentDesc


class IOWaitAnalyzer : IAnalyzer {

    override fun analyzer(contentDesc: ContentDesc): String {
        return "[IOWaitAnalyzer:]"
    }

}