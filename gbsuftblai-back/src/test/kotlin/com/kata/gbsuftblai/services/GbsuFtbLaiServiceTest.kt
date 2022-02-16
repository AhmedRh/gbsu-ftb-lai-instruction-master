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
    fun shouldReturn2IfInputNumberIs2() {
        assertEquals("2", gbsuFtbLaiService.convertNumber(2))
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

    @Test
    fun shouldReturnGbsuFtbIfInputNumberIs51() {
        assertEquals("GbsuFtb", gbsuFtbLaiService.convertNumber(51))
    }

    @Test
    fun shouldReturnFtbGbsuIfInputNumberIs53() {
        assertEquals("FtbGbsu", gbsuFtbLaiService.convertNumber(53))
    }

    @Test
    fun shouldReturnGbsuGbsuGbsuIfInputNumberIs33() {
        assertEquals("GbsuGbsuGbsu", gbsuFtbLaiService.convertNumber(33))
    }

    @Test
    fun shouldReturnGbsuLaiIfInputNumberIs27() {
        assertEquals("GbsuLai", gbsuFtbLaiService.convertNumber(27))
    }

    @Test
    fun shouldReturnGbsuFtbFtbIfInputNumberIs15() {
        assertEquals("GbsuFtbFtb", gbsuFtbLaiService.convertNumber(15))
    }





}