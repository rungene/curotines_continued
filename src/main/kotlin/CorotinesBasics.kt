import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main(){

    muMovies

}

val muMovies: String
    get() {

        return java.net.URL("http://www.cf0385d2.ngrok.io/movies").readText()
    }