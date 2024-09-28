

interface Printer {
    fun print(message: String)
}

class ConsolePrinter : Printer {
    override fun print(message: String) {
        println(message)
    }
}


class InkjetPrinter: Printer{
    override fun print(message: String) {
        println("InkjectPrinter:: $message")
    }

}

class DelegatingPrinter(private val printer: Printer) : Printer by printer

fun main() {
    val consolePrinter = ConsolePrinter()
    val inkjetPrinter = InkjetPrinter()
    val delegatingPrinter = DelegatingPrinter(inkjetPrinter)

    delegatingPrinter.print("Hello, Kotlin Delegation!")
}

