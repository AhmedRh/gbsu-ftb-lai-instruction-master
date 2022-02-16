package com.kata.gbsuftblai.controllers

import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
internal class GbsuFtbLaiControllerTest @Autowired constructor(
    val mockMvc: MockMvc
    ) {

    @DisplayName("GET /gbsu-ftb-lai/{inputNumber}")
    @Test
    fun `should return GbsuGbsu as result and the input number with the given input number`() {
        // given
        val inputNumber = 3
        val baseUrl = "/gbsu-ftb-lai"
        // when/then
        mockMvc.get("$baseUrl/$inputNumber")
            .andDo { print() }
            .andExpect {
                status { isOk() }
                content { contentType(MediaType.APPLICATION_JSON) }
                jsonPath("$.numberToConvert") { value(3) }
                jsonPath("$.result") { value("GbsuGbsu") }
            }
    }
}