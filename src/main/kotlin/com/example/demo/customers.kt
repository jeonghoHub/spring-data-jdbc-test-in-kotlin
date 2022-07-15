package com.example.demo

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface customers: CrudRepository<User, Long> {
    fun findByFirstName(firstName: String): List<User>
}