package io.univrs.kotlin1.functional

fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun unOperation(x: Int, op:(Int) -> Int): Int {
 return op(x)
}

fun unOp( op:(Int) -> Int ) {}

fun sum(x: Int, y: Int) = x + y



fun trans( db: Database, code: () -> Unit) {

    try {
        code()
    } finally {
        db.commit()
    }
}

class Database {
    fun commit() {}
}

fun main(args: Array<String>) {

    println( operation(1, 2, ::sum) )

    println( operation(2, 4, {x , y -> x + y }) )

    unOperation(2, { it * it })

    unOperation(2) { it * it }

    unOp {
        it * it
    }

    println(unOperation(3, fun(x:Int ): Int { return x * x }) )

    val db = Database()

    trans( db ) {
        //
    }
}