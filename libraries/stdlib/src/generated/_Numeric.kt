package kotlin

//
// NOTE THIS FILE IS AUTO-GENERATED by the GenerateStandardLib.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

import java.util.*

/**
 * Returns the sum of all elements in the collection
 */
public fun Iterable<Int>.sum(): Int {
    val iterator = iterator()
    var sum: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection
 */
public fun Stream<Int>.sum(): Int {
    val iterator = iterator()
    var sum: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection
 */
public fun Iterable<Long>.sum(): Long {
    val iterator = iterator()
    var sum: Long = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection
 */
public fun Stream<Long>.sum(): Long {
    val iterator = iterator()
    var sum: Long = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection
 */
public fun Iterable<Double>.sum(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection
 */
public fun Stream<Double>.sum(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection
 */
public fun Iterable<Float>.sum(): Float {
    val iterator = iterator()
    var sum: Float = 0.0f
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection
 */
public fun Stream<Float>.sum(): Float {
    val iterator = iterator()
    var sum: Float = 0.0f
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection
 */
public fun Array<out Int>.sum(): Int {
    val iterator = iterator()
    var sum: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection
 */
public fun IntArray.sum(): Int {
    val iterator = iterator()
    var sum: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection
 */
public fun Array<out Long>.sum(): Long {
    val iterator = iterator()
    var sum: Long = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection
 */
public fun LongArray.sum(): Long {
    val iterator = iterator()
    var sum: Long = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection
 */
public fun Array<out Byte>.sum(): Int {
    val iterator = iterator()
    var sum: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection
 */
public fun ByteArray.sum(): Int {
    val iterator = iterator()
    var sum: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection
 */
public fun Array<out Short>.sum(): Int {
    val iterator = iterator()
    var sum: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection
 */
public fun ShortArray.sum(): Int {
    val iterator = iterator()
    var sum: Int = 0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection
 */
public fun Array<out Double>.sum(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection
 */
public fun DoubleArray.sum(): Double {
    val iterator = iterator()
    var sum: Double = 0.0
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection
 */
public fun Array<out Float>.sum(): Float {
    val iterator = iterator()
    var sum: Float = 0.0f
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

/**
 * Returns the sum of all elements in the collection
 */
public fun FloatArray.sum(): Float {
    val iterator = iterator()
    var sum: Float = 0.0f
    while (iterator.hasNext()) {
        sum += iterator.next()
    }
    return sum
}

