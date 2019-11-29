package org.logan.test.kotlin

import java.util.concurrent.TimeUnit

/**
 * desc: 只读集合与可变集合 <br/>
 * Kotlin的集合和Java不同，它把访问集合数据的接口和修改集合数据的接口分开了。
 * 只读：kotlin.collections.Collection
 * 读写：kotlin.collections.MutableCollection，其中MutableCollection是继承上面的Collection的。
 *
 * 一般的规则：优先使用只读接口Collection，只在代码需要修改集合的地方使用MutableCollection。
 *
 * 使用集合接口时需要牢记的一个关键点：只读集合不一定是不可变的。
 *
 * 读写集合并不总是线程安全的。如果你在多线程环境下处理数据，
 * 需要保证代码正确地同步了对数据的访问，或者使用支持并发访问的数据结构。
 *
 * time: 2019-11-28 15:39 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */

// 使用只读集合接口与可变集合接口
fun <T> copyElement(source: Collection<T>, target: MutableCollection<T>) {
    for (item in source) {
        target.add(item)
    }
}


fun main() {
    val source: Collection<Int> = arrayListOf(3, 5, 7)
    val target: Collection<Int> = arrayListOf(1)  // MutableCollection
    // copyElement(source, target) // target 参数错误，不能把只读集合类型的变量作为target参数传给函数copyElement()
    // println(target)


    // 测试现成安全问题
    val list1: MutableCollection<Int> = arrayListOf();
    val list2: MutableCollection<Int> = list1

    // 加数据
    Thread(Runnable {
        for (i in 0 until 1000_000) {
            list1.add(i)
        }
    }).start()

    // 写数据
    Thread(Runnable {
        TimeUnit.MILLISECONDS.sleep(2)
        for (i in list2) {
            println(i)
        }
    }).start()

}