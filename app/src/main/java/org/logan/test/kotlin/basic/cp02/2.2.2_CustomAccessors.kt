package org.logan.test.kotlin.basic.cp02

/**
 * desc: Kotlin 自定义访问器。使用 get() 关键字 <br/>
 * time: 2019-08-22 15:31 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */
class Rectangle(val height: Int, val width: Int) {

    val isSquare: Boolean
        get() { // 声明属性的getter （代码块 形式）
            return height == width
        }


    val isRectangle: Boolean
        // 声明属性的getter (表达式 形式)
        get() = (height > width) || (width > height)

    // 这里有一个疑问，声明一个没有参数的函数(isSquare())，是否比声明带自定义getter的属性更好(isMarried())？
    // 这两种方式几乎一样的：实现和性能没有差别，唯一的差异是可读性。
    // 通常来说，如果描述的是类的特征（属性），应该把它声明成属性。

}