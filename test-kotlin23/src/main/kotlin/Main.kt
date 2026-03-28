package com.example

data class User(val name: String, val age: Int)

fun greet(user: User): String = "Hello ${user.name}, age ${user.age}"

interface Greeter { fun greet(): String }

class FormalGreeter(private val user: User) : Greeter {
    override fun greet() = "Good day, ${user.name}"
}

fun main() {
    val user = User("Test", 42)
    println(greet(user))
    println(FormalGreeter(user).greet())
}
