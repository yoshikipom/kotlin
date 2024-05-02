package com.yoshikipom.dev.spring.feign

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ClientTest {

    @Autowired
    lateinit var itemClient: ItemClient

    @Test
    fun test() {
        val item = itemClient.getItem(1)
        assertEquals(1, item.body!!.id)
        assertEquals("item-name", item.body!!.name)
    }
}
