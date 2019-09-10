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

    val kFunction = ::foo // ::foo表达式的值是来自反射 API的 KFunction 类的一个实例
    kFunction.call(42) // 调用函数foo，输出42
    // kFunction.call("42") // call()参数不做类型检查，这句代码编译通过，但是运行出错！

    val funtion1: Function1<Int, Unit> = ::foo // 使用FunctionN 调用函数
    funtion1.invoke(43)


    /* 2，调用类的属性 */
    val kProperty = Person::age
    val age = kProperty.call(Person("Alice", 29))
    println(age)

}