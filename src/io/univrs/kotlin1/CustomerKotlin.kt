package io.univrs.kotlin1


/**
 * Created by administrator on 5/21/17.
 */


data class CustomerKotlin(var id: Int, var name: String, var email: String)

fun main(args: Array<String>) {

    val customer = CustomerKotlin(1, "ardeshir", "ardeshir.org@gmail.com")
    val customer2 = CustomerKotlin(1, "ardeshir", "ardeshir.org@gmail.com")

    if (customer == customer2) println("They are the same!")
}