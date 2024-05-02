package com.yoshikipom.dev.spring.feign

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient(name = "items", url = "localhost:9000")
interface ItemClient {
    @RequestMapping(method = [RequestMethod.GET], value = ["/items/{id}"])
    fun getItem(@PathVariable("id") id: Int): ResponseEntity<Item>
}

data class Item(val id: Int, val name: String)
