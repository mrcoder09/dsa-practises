


// Generic Array<T> extension function
fun <T> Array<T>.printValue() {
    print("[")
    this.forEach {
        print("$it ")
    }
    print("]")
}

// IntArray extension function
fun IntArray.printValue() {
    print("\n[")
    this.forEach {
        print("$it,")
    }

    print("]")
}

// DoubleArray extension function
fun DoubleArray.printValue() {
    print("[")
    this.forEach {
        print("$it ")
    }
    print("]")
}

// BooleanArray extension function
fun BooleanArray.printValue() {
    print("[")
    this.forEach {
        print("$it ")
    }
    print("]")
}

// Similar extension functions for other primitive arrays like LongArray, FloatArray, etc.

