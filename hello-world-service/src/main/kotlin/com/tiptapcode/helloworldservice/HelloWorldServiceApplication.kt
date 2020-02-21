package com.tiptapcode.helloworldservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
class HelloWorldServiceApplication

fun main(args: Array<String>) {
  runApplication<HelloWorldServiceApplication>(*args)
}

