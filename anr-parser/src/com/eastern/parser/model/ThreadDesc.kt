package com.eastern.parser.model


data class ThreadDesc(private val name: String, private val id: Int) {


    val list = ArrayList<String>()
    /**
     * 持有的锁
     */
    var lock: Array<String>? = null

    /**
     * 等待的锁
     */
    val waitingLock: Array<String>? = null
}