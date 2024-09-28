package coroutinePractise.flows

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map


fun main(vararg args: String) {
    val helloWorldFlow = HelloWorldFlow()
    runBlocking {
        helloWorldFlow.helloWorld()
    }
}

class HelloWorldFlow {

    suspend fun helloWorld() {
        flow {
            (0..10).forEach {
                emit(it)
            }
        }.map {
            it + it
        }.collect {
            println(it)
        }
    }
}