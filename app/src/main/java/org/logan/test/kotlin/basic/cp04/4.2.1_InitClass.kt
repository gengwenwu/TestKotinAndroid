package org.logan.test.kotlin.basic.cp04

/**
 * desc: 声明一个带默认构造方法或属性的类 <br/>
 * 1，主构造函数 <br/>
 * 2，constructor 关键字 <br/>
 * 3，init关键字 <br/>
 * -
 * time: 2019-08-30 11:43 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */

class User(val nickName: String) // 主构造方法 （声明参数 + 属性初始化）

// 解析上面User类代码 (全量版本)
class User2 constructor(_nickname: String) { // constructor关键字用来开始一个主构造方法或从构造方法的声明。

    val nickname: String


    // init关键字用来引入一个 初始化语句块。
    // 这种语句块包含了在类被创建时执行的代码，并会和主构造方法一起使用。
    // 因为主构造方法有语句限制，不能包含初始化代码，这就是为什么要使用初始化语句块的原因。
    // 可以有多个初始化语句块
    init {
        this.nickname = _nickname
    }

}

// 精简User类代码 (版本1)
class User3(_nickname: String) {
    val nickname = _nickname
}

// 精简User类代码 (最终版版本)
class User4(val nickname: String) // val意味着相应的属性会用构造方法的参数来初始化


// 上面所有的User，都是等价的。