import kotlinx.coroutines.*
import java.lang.Thread.sleep
import java.net.URL
import javax.net.ssl.HttpsURLConnection

fun main() = runBlocking {
    println("Hello Coroutine!")
    val deferred = async {
        delay(1000)
        "Let's return this"
    }
    println("deferred: ${deferred.await()}")
    println("The End")
}
