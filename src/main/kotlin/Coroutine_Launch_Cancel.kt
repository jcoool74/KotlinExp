import kotlinx.coroutines.*
import java.lang.Thread.sleep
import java.net.URL
import javax.net.ssl.HttpsURLConnection
import kotlin.system.measureTimeMillis

fun main() {
    measureTimeMillis {
        val scope = CoroutineScope(Dispatchers.IO)
        val job = scope.launch {
            println("Hello Coroutine!")
        }
//        job.cancel()
        println("The End")
        sleep(100)
    }
}

private fun runBl() {
    runBlocking {
        coroutineScope {
            // Creates a coroutine scope
            launch {
                delay(500L)
                println("Task from nested launch")
            }

            delay(100L)
            println("Task from coroutine scope") // This line will be printed before the nested launch
        }
    }
}

private fun dfsfs() {
    GlobalScope.launch {
        runBlocking {

        }
    }

    val mainScope = MainScope()
    MainScope().launch {

    }
}