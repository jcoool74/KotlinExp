import java.io.File

fun main() {
    var str: String? = null
    val len = str?.let {
        it.length
    } ?: 0
    println("len: $len")

    fun makeDir(path: String): File  {
        val result = File(path)
        result.mkdirs()
        return result
    }
}