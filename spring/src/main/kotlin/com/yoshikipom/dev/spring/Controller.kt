package com.yoshikipom.dev.spring

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(private val service: Service) {

    @GetMapping("/resilience-error")
    fun get() {
        service.executeWithCircuitBreaker()
    }
}
