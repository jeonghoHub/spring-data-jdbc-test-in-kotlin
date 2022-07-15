package com.example.demo

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.datasource.DataSourceUtils

@SpringBootApplication
class DemoApplication(val jdbcTemplate: JdbcTemplate, val customers: customers): CommandLineRunner {

	override fun run(vararg args: String?) {
		val findByFirstName = customers.findByFirstName("john")
	}
}

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}