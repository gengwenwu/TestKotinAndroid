package org.logan.test.kotlin.basic.cp06

import org.logan.test.kotlin.java.Person

/**
 * desc: 平台类型: 本质上就是 Kotlin不知道可空性信息的类型。Java类型在Kotlin中表示为平台类型。<br/>
 * 既可以把它当作可空类型处理，也可以当作非空类型处理。要像在Java中一样，对这个类型上做的操作负有全部责任。
 * 编译器将会允许所有的操作，它不会把对这些值的空安全操作高亮成多余的。
 * 在使用 Java API 时要特别小心这种问题。
 *
 * time: 2019-11-26 15:08 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
fun yellAt(person: Person) { // 这里的Person是平台类型
    println(person.name.toString() + "!!") // person.name可能为null
}

fun yellAtSafe(person: Person) {
    println((person.name ?: "Anyone").toString() + "!!")
}

fun main() {
    yellAtSafe(Person(null))
    yellAt(Person(null)) // NullPointerException
}