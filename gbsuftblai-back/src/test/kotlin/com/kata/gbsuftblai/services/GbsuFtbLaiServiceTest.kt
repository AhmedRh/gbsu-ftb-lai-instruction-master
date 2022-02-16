package com.kata.gbsuftblai.services

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class GbsuFtbLaiServiceTest {

    @Test
    fun shouldReturn1IfInputNumberIs1() {
        var gbsuFtbLaiServiceTest = GbsuFtbLaiService()
        assertEquals("1",gbsuFtbLaiServiceTest.convertNumber(1))
    }
}