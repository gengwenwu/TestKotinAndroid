package org.logan.test.kotlin.basic.cp10

/**
 * desc: Kotlin KCallable - 是函数(KFunction)和属性(KProperty)的超接口。<br/>
 *
 * 它有两个重要的函数：
 * 1，call()：允许你调用对应的函数 或 对应属性的getter <br/>
 * 2，callBy()：？？
 *
 * time: 2019-09-10 11:09 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */

fun foo(x: Int) = println(x)


fun main() {
    val kFunction = ::foo
    kFunction.call(42) // 调用函数foo，输出42

    val KProperty = Person::age
    val age = KProperty.call(Person("Alice", 29))
    println(age)

}