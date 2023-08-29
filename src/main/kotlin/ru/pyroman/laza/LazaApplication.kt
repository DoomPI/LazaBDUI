package ru.pyroman.laza

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LazaApplication

fun main(args: Array<String>) {
	runApplication<LazaApplication>(*args)
}
