package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component

@Component
class GbsuFtbLaiService {

    fun convertNumber(inputNumber: Int): String {
        var conversionBuilder = StringBuilder()
        if(isDivisibleBy(inputNumber, 3)) {
            conversionBuilder.append("Gbsu")
        }
        if(isContainingByNumberChar(inputNumber, '3')) {
            conversionBuilder.append("Gbsu")
        }
        if(isDivisibleBy(inputNumber, 5)) {
            conversionBuilder.append("Ftb")
        }
        if(isContainingByNumberChar(inputNumber, '5')) {
            conversionBuilder.append("Ftb")
        }
        if(conversionBuilder.isEmpty())
            return "1"
        return conversionBuilder.toString()

    }

    private fun isContainingByNumberChar(inputNumber: Int, divider: Char) = inputNumber.toString().contains(divider)

    private fun isDivisibleBy(inputNumber: Int, divider: Int) = inputNumber % divider == 0

}