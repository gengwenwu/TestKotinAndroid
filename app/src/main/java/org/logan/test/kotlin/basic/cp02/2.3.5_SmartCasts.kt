package org.logan.test.kotlin.basic.cp02

/**
 * desc: 智能转换 is 关键字。<br/>
 * 智能转换只在变量经过了is检查且之后不再发生变化的情况下有效。<br/>
 * 当你对一个类的属性进行智能转换后，1, 这个属性必须是一个val属性，2，而且不能有自定义的访问器get()。<br/>
 * 否则，每次对属性的访问是否能返回同样的值将无从验证。<br/>
 * time: 2019-08-22 19:18 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
interface Expr

class Num(val value: Int) : Expr // 声明类，并实现Expr接口
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num // 显示转换成Num，是多余的操作
        return e.value // 智能转换后，绿色背景高亮提示
    }

    if (e is Sum) { // 通过is判断后，下面的代码的e，已经智能转换成对应的对象
        return eval(e.left) + eval(e.right)
    }

    throw IllegalArgumentException("Unknown expression")
}
