package com.yoshikipom.dev.spring

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker
import org.springframework.stereotype.Service

@Service
class Service {

    @CircuitBreaker(name = "backend", fallbackMethod = "fallback")
    fun executeWithCircuitBreaker() {
        throw RuntimeException("my error");
    }
}
