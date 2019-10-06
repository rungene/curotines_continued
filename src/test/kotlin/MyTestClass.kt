
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test


class MyTestClass {

    @Test
    fun testSomething() {
        Assert.assertEquals(2,1+1)

    }
    @Test
    fun testTowSomething()= runBlocking {
        Assert.assertEquals(2,1+1)
        doWork()

    }
}