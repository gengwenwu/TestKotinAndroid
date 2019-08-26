package org.logan.test.kotlin.basic.cp03

/**
 * desc: 顶层属性 <br/>
 * 和函数一样，属性也可以放在文件的顶层。<br/>
 * 默认情况下，顶层属性和其它任意的属性一样，是通过访问器暴露给Java使用。<br/>
 * const 关键字将顶层属性以public static final的属性暴露给Java。 <br/>
 * time: 2019-08-26 15:22 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */

// 声明一个顶层属性，一个静态字段。Java访问依旧通过getter、setter
var opCount = 0
//  Java代码 -> private static int opCount;

fun performOperation() {
    opCount++
}

fun reportOperationCount() {
    println("Operation perform $opCount times")
}


// private常量 (val声明)
val UNIX_LINE_SEPARATOR = "\n"
// Java代码 -> private static final String UNIX_LINE_SEPARATOR = "\n";

// 添加const关键字，变成public常量
const val UNIX_LINE_SEPARATOR_2 = "\n"
//  Java代码 -> public static final String UNIX_LINE_SEPARATOR_2 = "\n";

