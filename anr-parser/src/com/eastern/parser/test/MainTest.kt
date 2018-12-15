package com.eastern.parser.test

import com.eastern.parser.Parser
import java.io.File


object MainTest {


    @JvmStatic
    fun main(args: Array<String>) {
        val ret = Parser.parse("com.duowan.mobile", File("/home/xxx/3cdcbff3-c170-4de2-a5ec-1165b65f2c32/traces.txt"))
        println(ret)
    }

}