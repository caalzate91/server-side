package com.camiloalzate.serverside.services

import org.springframework.stereotype.Service

@Service
class GreetingServices {

    val employeerMap = hashMapOf(1 to "Camilo", 2 to "Andres", 3 to "Alzate" )

    fun findEmployeer (Id:Int) = employeerMap[Id] ?: "No hallago"

}