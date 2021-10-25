package com.example.study_android

import android.util.Log

class Kotlin {
    var Myname:String = "홍길동" //var 변수명: 타입 = 값
    //var = variable(변수)
    val language = "kotlin" //val 변수명 : 타입 = 값
    //val로 정의된 변수는 값을 변경할 수 없다.
}

//class 클래스명
//fun 함수명

class examclass(){
}

fun examfun(){
}

fun examif(){
    var out = 0
    var strike = 3
    if(strike > 2){
        out = out + 1
    }

    //----------------------

    if(out > 2){
        Log.d("out", "3아웃")
    }
    else{
        examif()
    }
    //---------------------
    var a = 5
    var b = 3
    var bigger = if(a>b) a else b

    bigger = if(a>b){
        var c = 30
        a //마지막 줄의 a값이 변수에 저장
    }
    else {
        b
    }
}

fun examwhen(){
    var now = 10
    when(now){
        7->{
            Log.d("When","7")
        }
        8, 9->{ //콤마로 구분하여 여러개의 값을 처리 가능
            Log.d("When", "8 or 9")
        }
        in 11..15->{ //in을 사용하여 범위값도 가능
            Log.d("When", "11~15")
        }
        else->{ //위의 모든 조건에 맞지 않으면 else 다음 코드가 실행
            Log.d("When", "7, 8, 9, 11~15시가 아닙니다.")
        }
    }

    //---------------------

    var currentTime = 6
    when{
        currentTime == 5 ->{
            Log.d("When", "5")
        }
        currentTime > 5 ->{
            Log.d("When", "5시 넘음")
        }
        else->{
            Log.d("When","5시 이전")
        }
    }
}

//if와 when의 사용
//범위가 넓고 값을 특정할 수 없을 경우에 if문을 사용해서 처리, 반면 범위가 제한되고 값도 특정할 수 있는 경우는 when문을 사용하는 것이 낫다.

fun examarray(){
    var IA = IntArray(10)
    var LA = LongArray(10)
    var CA = CharArray(10)
    var FA = FloatArray(10)
    var DA = DoubleArray(10)
    //
    var SA = Array(10, {item->""}) //문자 배열에 빈 공간 할당
    var dayArray = arrayOf("MON","TUE","WED","THU","FRI","SAT","SUN") //값으로 배열 공간 할당
    //
    IA[0] = 90 //배열명[인덱스] = 값
    IA.set(1,91) //배열명.set(인덱스, 값)

    Log.d("ARRAY", IA[0].toString()) //배열명[인덱스]
    Log.d("ARRAY", IA.get(1).toString()) //배열명.get(인덱스)
}

fun examlist(){ //리스트는 저장된 데이터에 인덱스를 부여한 컬렉션, 중복된 값을 입력할 수 있다.
    var list = mutableListOf("MON","TUE","WED") //동적 배열 리스트 생성
    list.add("THU") //list리스트에 값이 추가되며 동적으로 리스트의 공간이 자동으로 증가
    Log.d("List", list.get(1))//리스트명.get(인덱스)
    list.set(1, "FRI")//리스트명.set(인덱스, "수정할 값")
    list.removeAt(1)//리스트명.removeAt(인덱스)

    //빈리스트 사용하기
    var stringList = mutableListOf<String>()
    //var 변수명 = mutableListOf<컬렉션에 입력될 값의 타입>()

    list.size //컬렉션의 개수를 가져올 수 있다.
    //***********중요**************
    //set, get 등은 함수라고 하고, size는 프로퍼티라는 용어를 사용한다.
    //구분 법은 괄호의 유무이다.
}

fun examset(){//셋은 중복을 허용하지 않는 리스트라고 할 수 있다. 리스트와 유사한 구조지만, 인덱스로 조회할 수 없고, get 함수도 지원하지 않습니다.
    var set = mutableSetOf<String>()
    set.add("JAN")
    set.add("FEB")
    set.add("MAR")
    set.add("JAN")//동일한 값을 입력되지 않습니다.

    Log.d("Set", set.toString())//셋은 인덱스로 조회하는 함수가 없기 때문에 특정 위치의 값을 직접 사용 불가 이 코드는 모든 값을 출력

    set.remove("FEB")//셋은 값이 중복되지 않으므로 값으로 직접 조회하여 삭제 가능
}

fun exammap(){//맵은 키와 값의 쌍으로 입력되는 컬렉션이다. 맵의 키는 인덱스와 비슷한데 맵에서는 키를 직접 입력
    var map = mutableMapOf<String, String>()//키와 값의 데이터 타입을 모두 String으로 사용하기 위한 코드
    map.put("1", "one")//map.put("키", "값")
    map.put("2", "two")
    map.put("3", "three")

    Log.d("Map", map.get("1").toString())//맵의 "1"이라는 키를 가진 값을 꺼내는 방법

    map.put("2", "double")//map.put("키", "넣을 값")

    map.remove("2") //map.remove("키")
}