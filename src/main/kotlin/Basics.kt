import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main()= runBlocking{

    GlobalScope.launch {

        delay(1000)
        println("Hello")
    }

    println("World")


    doWork()


}

suspend fun doWork() {

    delay(2000)
}