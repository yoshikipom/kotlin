package com.yoshikipom.dev.spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
