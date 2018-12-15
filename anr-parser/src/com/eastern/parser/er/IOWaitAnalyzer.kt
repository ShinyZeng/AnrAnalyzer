package com.eastern.parser.er

import com.eastern.common.log.Log
import com.eastern.parser.model.ContentDesc


class IOWaitAnalyzer : IAnalyzer {

    override fun analyzer(contentDesc: ContentDesc): String {
        Log.i("start analyze IOWaitAnalyzer")
        return ""
    }

}