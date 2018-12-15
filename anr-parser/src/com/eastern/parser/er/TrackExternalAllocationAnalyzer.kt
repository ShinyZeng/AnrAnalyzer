package com.eastern.parser.er

import com.eastern.common.log.Log
import com.eastern.parser.model.ContentDesc

/**
 * 是否内存不足
 * dalvik.system.VMRuntime.trackExternalAllocation(NativeMethod)
 */
class TrackExternalAllocationAnalyzer : IAnalyzer {

    override fun analyzer(contentDesc: ContentDesc): String {
        Log.i("start analyze TrackExternalAllocationAnalyzer")

        return ""
    }
}