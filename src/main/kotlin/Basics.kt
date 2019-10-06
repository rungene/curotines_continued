import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Basics {


    fun main(){


        GlobalScope.launch {

            println("Hi From corotine")
        }

        println("Hello from without corotines")
    }


}