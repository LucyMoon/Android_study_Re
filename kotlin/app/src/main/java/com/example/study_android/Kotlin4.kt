package com.example.study_android

//null값 허용
fun nullexam(str: String): String?{//리턴에도 물음표를 붙여 null 허용 여부 설정 가능
    var variable: String? //타입 다음에 물음표를 붙여서 null 값을 입력할 수 있다.
    if(str != null){//파라미터 str에 null이 허용되었으므로 함수 내부에서 null 체크를 하기 전에는 str 사용 X
    }
    return null
}

fun lateinitexam(){
    lateinit var name: String //var로 선언된 클래스의 프로퍼티에만 사용 가능
    //null 허용 X
    //기본 자료형(Int, Long, Double, Float 등) 사용 X
}

fun runexam(){
    var list = mutableListOf("Scope", "Function")
    list.run{
        val listSize = size //this.size 대신에 this를 생략한 채로 도트연산자 없이 사용 가능
    }
}
fun letexam(){
    var list = mutableListOf("Scope", "Function")
    list.let{ //it 대신에 target등으로 변경 가능
        val listSize = it.size //모든 속성과 함수를 it.멤버로 사용 가능
    }
}
fun thisscopeexam(){
    var list = mutableListOf("Scope", "Function")
    list.apply{
        val listSize = size
    }

    with (list) {
        val listSize = size
    }
}
fun itscopeexam(){
    var list = mutableListOf("Scope", "Function")
    list.let{
        val listSize = it.size
    }
    list.also{
        val listSize = it.size
    }
}
fun returnexam1(){
    var list = mutableListOf("Scope", "Function")
    val afterApply = list.apply{
        add("Apply")
        count() //반환값 : this 그 자체 = [Scope, Function, Apply]
    }
    val afterAlso = list.also{
        it.add("Also")
        it.count() //반환값 : this 그 자체 = [Scope, Function, Apply, Also]
    }
}
fun returnexam2(){
    var list = mutableListOf("Scope", "Function")
    val lastCount = list.let{
        it.add("Run")
        it.count() //반환값 : 마지막실행 코드를 반환 = 3
    }
    val liastItem = list.run{
        add("Run")
        get(size-1) //반환값 : 마지막실행 코드를 반환 = Run
    }
    val lastItemWith = with(list){
        add("With")
        get(size-1) //반환값 : 마지막실행 코드를 반환 = With
    }
}