package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component

@Component
class GbsuFtbLaiService {

    fun convertNumber(inputNumber: Int): String {
        var conversionBuilder = StringBuilder()
        appendByDivider(conversionBuilder, inputNumber, 3 )
        appendByDivider(conversionBuilder, inputNumber, 5 )
        appendByContainingNumbers(conversionBuilder, inputNumber)
        return getConversionResult(conversionBuilder, inputNumber)
    }

    private fun getConversionResult(conversionBuilder: StringBuilder, inputNumber: Int): String {
        if(conversionBuilder.isEmpty())
            return inputNumber.toString()
        return conversionBuilder.toString()
    }

    private fun appendByContainingNumbers(conversionBuilder: StringBuilder, inputNumber: Int) {
        inputNumber.toString().forEach { c ->
            conversionBuilder.append(getConversionValueByCharNumber(c))
        }
    }

    private fun appendByDivider(conversionBuilder: StringBuilder, inputNumber: Int,  divider: Int) {
        if (isDivisibleBy(inputNumber, divider)) {
            conversionBuilder.append(getConversionValueByCharNumber(divider.toString().elementAt(0)))
        }
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