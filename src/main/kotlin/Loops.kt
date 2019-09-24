fun main() {
// Was it easy for you to write a simple loop in Kotlin as a, for example, Java, C++ developer? For me, it was not so easy. There are too many ways to write a loop.

// I am sure that Kotlin language designers and communities must have spent some time on this.
// I am thinking that maybe they want to attract different audiences or newcomers.
// Or they wanted to impress or show off existing Java developers with Kotlin's syntax simplicity.

    // It iterates over anything that is iterable
    val names = listOf("Anne", "Peter", "Jeff")
    for (name in names) {
        println("iterable: $name")
    }

    // You can also create a range with the .. operator
    for (x in 0..10) println(x) // Prints 0 through 10 (inclusive)

    // If you need to count downwards, use the inclusive downTo:
    for (x in 10 downTo 0) println("downTo: $x")

    for (name in names.reversed()) {
        println("reversed: $name")
    }

    // If you want to exclude the last value
    for (x in 0 until 10) println(x) // Prints 0 through 9

    // You can control the increment with step:
    for (x in 0 until 10 step 2) println(x) // Prints 0, 2, 4, 6, 8

    // The step value must be positive.
    // If you need to count downwards, use the inclusive downTo:
    for (x in 10 downTo 0 step 2) println(x) // Prints 10, 8, 6, 4, 2, 0

    val numbers = (0..9).toList()
    for ((index, value) in numbers.withIndex()) {
        println("withIndex - $index: $value")
    }

    for (i in numbers.indices) {
        println("indices - $numbers[i]")
    }

    numbers.forEach { println("forEach: $it") }

    repeat(numbers.size) {
        println("repeat: $it")
    }

    var x = 0
    while (x < 10) {
        println(x)
        x++ // Same as x += 1
    }

    val iterator = numbers.listIterator()
    println("Iterating forwards:")
    while (iterator.hasNext()) {
        print("Index: ${iterator.nextIndex()}")
        println(", value: ${iterator.next()}")
    }
    println("Iterating backwards:")
    while (iterator.hasPrevious()) {
        print("Index: ${iterator.previousIndex()}")
        println(", value: ${iterator.previous()}")
    }

    outer@ for (n in 2..100) {
        for (d in 2 until n) {
            if (n % d == 0) continue@outer
        }
        println("$n is prime")
    }

    mapTest()
}

private fun mapTest() {
    val items = HashMap<String, Int>()
    items["A"] = 10
    items["B"] = 20
    items["C"] = 30

    println("-- Example 1 -- \n $items");

    //for loop
    println("\n-- Example 1.1 -- ");
    for ((k, v) in items) {
        println("$k = $v")
    }

    val items2 = hashMapOf("A" to 10, "B" to 20, "C" to 30)
    items2["D"] = 40

    // foreach example
    println("\n-- Example 2.1 --");
    items2.forEach { k, v ->
        println("$k = $v")
    }

    // foreach + filter
    println("\n-- Example 2.1 --");
    items2.forEach { k, v ->
        if (v == 10) {
            println("$k = $v")
        }
    }

    // using the special 'it' like this
    println("\n-- Example 2.2 --");
    items2.forEach { println("key : ${it.key}, value : ${it.value}") }
}