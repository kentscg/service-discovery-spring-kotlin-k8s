package com.tiptapcode.helloworldservice.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by k on 21/02/2020.
 */
@RestController
class HelloWorldController {

    @GetMapping("/echo")
    fun echo(): String = "Hello World"

}
