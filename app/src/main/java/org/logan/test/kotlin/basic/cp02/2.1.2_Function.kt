package org.logan.test.kotlin.basic.cp02

/**
 * desc: Kotlin简单函数 <br/>
 * time: 2019-08-22 14:05 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */

// Java 版本写法
fun max(a: Int, b: Int): Int {
    // 在Kotlin中，if是有结果值的表达式。它和Java中的三元运算符相似：(a > b) ? a : b
    return if (a > b) a else b
}

// 表达式函数
fun max1(a: Int, b: Int): Int = if (a > b) a else b

// 表达式体函数，虽然没有显示声明数据返回类型，但支持类型推导。代码块函数不支持！
fun max2(a: Int, b: Int) = if (a > b) a else b


