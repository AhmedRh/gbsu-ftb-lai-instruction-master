package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component

@Component
class GbsuFtbLaiService {

    fun convertNumber(inputNumber: Int): String {
        var conversionBuilder = StringBuilder()
        if(inputNumber % 3 == 0) {
            conversionBuilder.append("Gbsu")
        }
        if(inputNumber.toString().contains('3')) {
            conversionBuilder.append("Gbsu")
        }
        if(conversionBuilder.isEmpty())
            return "1"
        return conversionBuilder.toString()

    }

}