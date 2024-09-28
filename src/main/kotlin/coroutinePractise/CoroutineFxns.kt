package coroutinePractise

import kotlinx.coroutines.*


fun main(vararg args:String){
    val coroutineFxns = CoroutineFxns()
    coroutineFxns.withYeild()
}

class CoroutineFxns {

    val singleThreadContext = newSingleThreadContext("MyThread")
    val coroutineScope = CoroutineScope(
        Dispatchers.Default
    )

    //1.
    // This function is similar to withTimeout, but instead of throwing a TimeoutCancellationException when the timeout occurs, it returns null.
    //This can be useful if you want to handle the timeout more gracefully.
    suspend fun withTimeOutOrNull() {
        val result = withTimeoutOrNull(1000L) {
            // Some long-running operation
            "Success"
        }
        if (result == null) {
            println("Operation timed out")
        } else {
            println("Operation completed: $result")
        }
    }

    //2.
    // This function suspends the coroutine for a specified amount of time without blocking the thread.
    // It is useful when you need to implement a delay in a coroutine.
    suspend fun withDelay() {
        coroutineScope.launch {
            for (i in 0..5) {
                delay(1000L) // Delays the coroutine for 1 second
                println(i);
            }
        }
    }

    //3. launch with Timeout Handling:
    //You can launch a coroutine with manual timeout handling.
    //task needs to be in give Time-Span otherwise it throw TimeoutCancellationException
    suspend fun withTimeOut() {
        coroutineScope.launch {
            try {
                withTimeout(1000L) {
                    // Some long-running operation
                }
            } catch (e: TimeoutCancellationException) {
                println("Operation timed out")
            }
        }
    }

    //4. withContext and Timeout Handling:
    //You can use withContext along with a timeout to switch the context of a coroutine while enforcing a time limit.
    suspend fun withContextAndTimeout() {
        coroutineScope.launch { // this is running task on Default
            val result = withContext(Dispatchers.IO) {//Switching task to IO dispatcher
                withTimeoutOrNull(1000L) {
                    // Some long-running operation
                }
            }
        }
    }


    //5.
    //The yield() function in Kotlin coroutines is used to suspend the execution of the current coroutine, giving other coroutines a chance to execute.
    // It's particularly useful when you want to create a cooperative multitasking system,
    // allowing the coroutine dispatcher to switch contexts,
    // or when you have a long-running task that you want to periodically suspend to avoid blocking other coroutines.
    // runBlocking: This function starts a coroutine and blocks the current thread until its completion.
    // launch: Launches new coroutines. Here, we have two coroutines, job1 and job2.
    // yield(): Inside each coroutine, yield() is called in every iteration. This suspends the current coroutine and allows other coroutines to run.
    fun withYeild() {
        runBlocking {
            val job1 = launch {
                repeat(5) { i ->
                    println("Coroutine 1 - Iteration $i")
                    yield() // Suspend to let other coroutines run
                }
            }

            val job2 = launch {
                repeat(5) { i ->
                    println("Coroutine 2 - Iteration $i")
                    yield() // Suspend to let other coroutines run
                }
            }

            // Wait for both coroutines to finish
            job1.join()
            job2.join()
        }
    }
}