package com.camiloalzate.serverside

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ServerSideApplication

fun main(args: Array<String>) {
	runApplication<ServerSideApplication>(*args)
}
