package com.example.ci_test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CiTestApplication

fun main(args: Array<String>) {
    runApplication<CiTestApplication>(*args)

}
