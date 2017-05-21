package io.univrs.kotlin1.functional

/**
 * Created by administrator on 5/21/17.
 */

fun outsideFunction() {

    for(number in 1 ..30) {

        unOperation(20, { x ->
              println(number)
            x * number
        })

    }

}


fun main(args: Array<String> ) { outsideFunction() }