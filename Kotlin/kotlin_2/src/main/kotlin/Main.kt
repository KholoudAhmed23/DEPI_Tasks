import kotlin.math.abs

fun main(args: Array<String>) {
    /*val x=Teacher(20,"Ali","Teacher1")
    x.test()
    println(x.gender)*/
   /* val int=InterfaceImp()
    int.hello()
    println(int.printTest())*/

    val inter=C()//interface
    inter.test()
    val abst=Operation2("maths")//apstract
    abst.printSum()
    abst.material("phy")
}
interface MyInterface{
    val num:Int
    fun printTest():String
    fun hello(){
        println("Hello")
    }
}
class InterfaceImp:MyInterface{
    override val num:Int=6
    override fun printTest()="Hello!!"
}
interface A{
    fun test(){println("testA")}
}
interface B{
    fun test(){println("testB")}
}
class C:A,B{
    override fun test(){
    super<A>.test()
    super<B>.test()
    }
}
abstract class Operation1(type:String) {
    init {
        println(type)
    }
    fun printSum() {
        println("sum")
    }
    abstract fun material(materialStudy: String)
}
class Operation2(type: String):Operation1(type){
    override fun material(materialStudy: String) {
        println(materialStudy)
    }
}
open class  Person (age:Int ,name:String){
    open var gender:String="female"
    init{ //primary constractor
        println(name)
        println(age)
    }
    open fun test(){
        println("test")
    }
}
class  Teacher :Person{
    override var gender:String="male"
    constructor(age:Int,name:String,jop:String):super(age,name){
        println(jop)
    }
    override fun test(){
        println("test2")
    }
}
