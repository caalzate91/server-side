package com.camiloalzate.serverside.controller

import com.camiloalzate.serverside.data.Greeting
import com.camiloalzate.serverside.services.GreetingServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {

    val counter = AtomicLong()

    @Autowired
    lateinit var greetingServices: GreetingServices

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) = Greeting(counter.incrementAndGet(), "Hello, $name")

    @GetMapping("/name")
    fun findName(@RequestParam(value = "id") id: Int) : String {
        return "${greetingServices.findEmployeer(id)}\n"
    }
}