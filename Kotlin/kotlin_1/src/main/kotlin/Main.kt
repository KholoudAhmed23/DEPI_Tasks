fun main() {
    val add:MutableList<Int> = mutableListOf()
    for(i in 1..100) {
        if (i % 2 == 0) {
            add.add(i)
        }
    }
    println(add)
}
