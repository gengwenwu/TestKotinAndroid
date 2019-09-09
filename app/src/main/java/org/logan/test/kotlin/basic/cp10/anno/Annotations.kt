package org.logan.test.kotlin.basic.cp10.anno

import kotlin.reflect.KClass

/**
 * desc: Kotlin 注解声明的地方 <br/>
 * time: 2019-09-09 14:33 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */

annotation class Anno(val args1: KClass<*>, val arg2: KClass<out Any>)


