import kotlinx.coroutines.*
import java.lang.Thread.sleep

fun main() {
    println("start")

    runBlocking {
        coroutineScope { // Creates a coroutine scope
            launch {
                delay(500L)
                println("Task from nested launch")
            }

            delay(100L)
            println("Task from coroutine scope") // This line will be printed before the nested launch
        }
    }


    GlobalScope.launch {
        runBlocking {

        }
    }

    val coroutineScope = CoroutineScope(Dispatchers.IO)
    coroutineScope.launch {

    }

}