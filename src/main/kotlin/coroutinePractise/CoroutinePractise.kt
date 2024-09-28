package coroutinePractise

import kotlinx.coroutines.*

fun main(vararg args:String){
    CoroutinePractise()
        .doSomething()
}

class CoroutinePractise {

    val scope =
        CoroutineScope(SupervisorJob() + Dispatchers.IO + CoroutineExceptionHandler({ coroutineContext, throwable ->
            throwable.printStackTrace()
        }))

    fun doSomething() {

        scope.launch {



        }

        scope.async {

        }

        scope.cancel(cause = CancellationException("Some Error Occurred"))
    }

}