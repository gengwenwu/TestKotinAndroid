package org.logan.test.kotlin.basic.cp10

import android.annotation.SuppressLint
import ru.yole.jkid.CustomSerializer
import ru.yole.jkid.ValueSerializer
import ru.yole.jkid.serialization.serialize
import java.text.SimpleDateFormat
import java.util.*

/**
 * desc: Kotlin 使用范型类做注解参数 <br/>
 * time: 2019-09-09 22:33 <br/>
 * author: Logan <br/>
 * since V 1.0 <br/>
 */

// 自定义Date序列化器
object DateSerializer : ValueSerializer<Date> {

    @SuppressLint("SimpleDateFormat")
    private val dateFormat = SimpleDateFormat("yyyy-mm-dd")

    override fun toJsonValue(value: Date): Any? = dateFormat.format(value)

    override fun fromJsonValue(jsonValue: Any?): Date = dateFormat.parse(jsonValue as String)
}

//
data class Person4(
    val name: String,

    @CustomSerializer(DateSerializer::class)
    val birthDate: Date
)


@SuppressLint("SimpleDateFormat")
fun main() {
    val person = Person4("Alice", SimpleDateFormat("dd-mm-yyyy").parse("13-02-1987"))
    println(serialize(person))

}