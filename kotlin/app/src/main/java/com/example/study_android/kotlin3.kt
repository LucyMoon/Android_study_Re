package com.example.study_android

import android.util.Log

//클래스의 기본구조
//class 클래스명 {
//    var 변수
//    fun 함수(){
//        //코드
//    }
//}

class Person constructor(value: String){ }//프라이머리 생성자

class Person2{ //세컨더리 생성자
    constructor(value: String){}
    constructor(value: Int){}
    constructor(value1: Int, value2: String){}
}

//클래스 호출 : 클래스명()

//오브젝트
object Pig {
    var name: String = "Pinky"
    fun printName() {
        Log.d("Class", "Pig의 이름은 ${name}입니다.")
    }
    //호출은 도트 연산자를 이용하여 호출
    //ex) Pig.name
    //Pig.printName()
}

//컴패니언 오브젝트
class Pig2 {
    companion object {
        var name: String = "None"
        fun printName(){
            Log.d("Class", "Pig의 이름은 ${name}입니다.")
        }
    }
    fun walk(){
        Log.d("Class", "Pig가 걸어갑니다.")
    }
}
//companion object 안의 코드 사용
//Pig2.name = "Linda"
//Pig2.printName()

//companion object 밖의 코드 사용
//val cutePig = Pig()
//cutePig.walk()

//데이터 클래스
fun dataclassexam(){
    data class UserData(val name:String, var age:Int)
    var userData = UserData("Michael", 21)
    userData.name = "Sindy" //val로 선언하여 불가능
    userData.age = 18 //가능

    Log.d("DataClass", "UserData : ${userData.toString()}")
    val newData = userData.copy()
}

//상속
//open class 부모클래스{}
//class 자식클래스: 부모클래스(){}

//open class 부모클래스(value: String){}
//class 자식클래스(value: String): 부모클래스(value){}

open class Parent{
    var hello: String = "안녕하세요."
    fun sayHello(){
        Log.d("inheritance", hello)
    }
}
class Child: Parent(){
    fun myHello(){
        hello = "Hello!"
        sayHello()
    }
}

//메서드 오버라이드
open class BaseClass{
    open fun opened(){
    }
    fun noOpened(){
    }
}
class SubClass: BaseClass(){
    override fun opened() {
    }
    override fun notOpened(){
    }//open키워드가 없어서 잘못된 사용
}

//프로퍼티 오버라이드
open class BaseClass2{
    open var opened: String = "I am"
}
class SubClass2: BaseClass2(){
    override var opened: String = "You are"
}

