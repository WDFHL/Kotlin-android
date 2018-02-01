package com.kotlin.android.bean

/**
 * Created by j on 2018/2/1.
 */
//Kotlin 中使用关键字 class 声明类
class  Person constructor(name: String){
/*
在 Kotlin 中的一个类可以有一个主构造函数和一个或多个次构造函数。
主构造函数是类头的一部分：它跟在类名（和可选的类型参数）后。
如果主构造函数没有任何注解或者可见性修饰符，可以省略这个 constructor 关键字。
 */
constructor(name: String, parent: Person) : this(name) {

}



}