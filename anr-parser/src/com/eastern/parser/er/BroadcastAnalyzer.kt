package com.eastern.parser.er

import com.eastern.common.log.Log
import com.eastern.parser.model.ContentDesc


class BroadcastAnalyzer : IAnalyzer {
    override fun analyzer(contentDesc: ContentDesc): String {
        Log.i("start analyze BroadcastAnalyzer")
        return ""
    }
}