package com.kata.gbsuftblai.services

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class GbsuFtbLaiServiceTest {

    private lateinit var gbsuFtbLaiService: GbsuFtbLaiService

    @BeforeEach
    fun setup() {
        gbsuFtbLaiService = GbsuFtbLaiService()
    }

    @Test
    fun shouldReturn1IfInputNumberIs1() {
        assertEquals("1", gbsuFtbLaiService.convertNumber(1))
    }

    @Test
    fun shouldReturnGbsuGbsuIfInputNumberIs3() {
        assertEquals("GbsuGbsu", gbsuFtbLaiService.convertNumber(3))
    }

    @Test
    fun shouldReturnFtbFtbIfInputNumberIs5() {
        assertEquals("FtbFtb", gbsuFtbLaiService.convertNumber(5))
    }

    @Test
    fun shouldReturnLaiIfInputNumberIs7() {
        assertEquals("Lai", gbsuFtbLaiService.convertNumber(7))
    }

    @Test
    fun shouldReturnGbsuIfInputNumberIs9() {
        assertEquals("Gbsu", gbsuFtbLaiService.convertNumber(9))
    }


}