package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component

@Component
class GbsuFtbLaiService {

    fun convertNumber(inputNumber: Int): String {
        var conversionBuilder = StringBuilder()
        if(isDivisibleBy(inputNumber, 3)) {
            conversionBuilder.append("Gbsu")
        }
        if(isDivisibleBy(inputNumber, 5)) {
            conversionBuilder.append("Ftb")
        }
        inputNumber.toString().forEach { c ->
            conversionBuilder.append(getConversionValueByCharNumber(c))
        }
        if(conversionBuilder.isEmpty())
            return inputNumber.toString()
        return conversionBuilder.toString()

    }

    private fun getConversionValueByCharNumber(c: Char): String {
        if (c == '3') {
           return "Gbsu"
        }
        if (c == '5') {
            return "Ftb"
        }
        if (c == '7') {
            return "Lai"
        }
        return ""
    }

    private fun isDivisibleBy(inputNumber: Int, divider: Int) = inputNumber % divider == 0

}