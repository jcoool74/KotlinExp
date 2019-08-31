fun main() {
    var language = listOf("Ruby", "Koltin", "Python", "Java")
    repeat(language.size) {
        println("i: $it")
    }

    language.forEach { println("forEach: $it") }

    val items = HashMap<String, Int>()
    items["A"] = 10
    items["B"] = 20

    for ((k, v) in items) {
        println("$k = $v")
    }


    println("done")
}

inline fun duplicate(body: () -> Unit) {
    body()
    body()
}

fun test(arg: (Int) -> Unit) {
    arg.invoke(10)
}
