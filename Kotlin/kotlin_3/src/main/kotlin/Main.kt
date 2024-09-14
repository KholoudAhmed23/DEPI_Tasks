fun main(args: Array<String>) {
   // println(Parent.Child1().c1)//nested call
   // Parent.Child1().printText1()//nested call

    //println(Parent().Child2().c2)//inner call
   // Parent().Child2().printText2()//inner call

  //  Parent.printText3("test33")//companion call
  //  println(Parent.test3)//companion call

  //  val extensionF1="Hallo World"//extension function
  //  extensionF1.removeFirstandLastChar()//extension function
  //  println(20.addtwo())//extension function

   // for(day in Days.values()){//loop enum class
    //    print(day)//loop enum class
    //    print(" ")//loop enum class
   // }//loop enum class

   // println("")

   // val square=Shape.Square(3)//seald class call
  //  area(square)//seald class call

    var name=Company("Kholoud")
    var age=Company(10)

    printList(listOf("A","B","C"))



}
class Parent{
    val p="parent"
    class Child1{//nested
        val c1="child1"
        fun printText1() {
            println(c1)
        }
    }
    inner class Child2{ //inner
        val c2="child2"
        fun printText2() {
            println(c2)
        }
    }
    companion object test{//companion object
        fun printText3(text:String){
            println(text)
        }
        val test3=10
    }
}
fun String.removeFirstandLastChar(){ //extension function//"or":String=this.substring(1,this.length-1)
    println(this.substring(1,this.length-1))
}

fun Int.addtwo():Int=this+2 //extension function

enum class Days(val isWeekend:Boolean=false){
    sun,mon,tue,wen,thu,fri(true),sat(true)
}
enum class color(val color:String){
    red("#hffkfk")
}
sealed class Fruit(val f:String){
    class Apple:Fruit("Apple")
    class Mango:Fruit("Mango")
}
fun display(fruit: Fruit){
    when(fruit){
        is Fruit.Apple-> println("Apple is a Fruit")
        else -> {
            println("not a Fruit")
        }
    }
}
sealed class NetworkStatus(val massege:String){
    class networkResponse():NetworkStatus("api response")
    class networkFailer():NetworkStatus("api not response")
}
sealed class Shape{
    class Square(var Lenght:Int):Shape()
}
fun area(e:Shape){
    when(e){
        is Shape.Square->{
            println(e.Lenght*e.Lenght)
        }
    }
}
class Company<C>(name:C){
    var c=name
    init {
        println(c)
    }
}
fun <T>printList(list:List<T>){
    for(element in list) {
        println(element)
    }
}
