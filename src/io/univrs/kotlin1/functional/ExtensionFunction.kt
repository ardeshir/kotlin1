package io.univrs.kotlin1.functional

/**
 * Created by administrator on 5/21/17.
 */

fun String.hello() {
    println("It's me!")
}

fun String.toTitleCase(prefix: String): String {
    return this.split(" ").joinToString(" ") {  "$prefix ${ it.capitalize() }" }
}

fun main(args: Array<String>) {
    "hello".hello()
    println("this is a sample to Title Case".toTitleCase("Again - "))

}