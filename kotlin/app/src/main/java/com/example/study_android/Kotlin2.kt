package com.example.study_android

import android.util.Log
import kotlin.math.exp

class Kotlin2 {

}

fun forexam(){
    for(index in 1..10){ //(변수 in 시작값..종료값)
        Log.d("For", "현재 숫자${index}")
    }
    //---------------------
    var array = arrayOf("Jan", "FEB", "MAR", "APR", "MAY", "JUN")
    for(index in 0 until array.size){ //(변수 in 시작값 until 종료값)
        Log.d("For", "현재 월 : ${array.get(index)}")
    }
    //---------------------
    for(index in 0..100 step 3){ //(변수 in 시작값..종료값 step 값)
        Log.d("For", "현재 숫자${index}")
    }
    //---------------------
    for(index in 10 downTo 0){ //(변수 in 시작값 downTo 종료값) step 가능
        Log.d("For", "현재 숫자${index}")
    }
}

fun whileexam(){
    var current = 1
    val until = 12
    while(current < until){ //while(조건식)
        Log.d("while", "현재값${current}")
        current += 1
    }
    //---------------------
    var game = 1
    val match = 6
    do{ //do while은 무조건 do에 있는 코드를 실행 후, while의 조건식이 만족하면 반복
        Log.d("while", "현재숫자${game}")
        game += 1
    } while(game < match)
    //---------------------
}

fun loopcontrolexam(){
    for(index in 1..10){
        Log.d("break", "현재숫자${index}")
        if(index > 5){
            break //반복문 탈출
        }
    }
    for(except in 1..10){
        if(except > 3 && except < 8){
            continue //4, 5, 6, 7 출력 X
        }
        Log.d("continue", "현재숫자${except}")
    }
}

fun functionexam(){
    fun square(x : Int): Int{ //fun 함수형(파라미터 이름: 타입): 반환타입
        return x * x
    }
    //---------------------
    //함수의 사용
    var squareResult = square(30)//함수명(값) <- 함수호출
}