fun main(args: Array<String>) {
    val studentList = listOf(60 to "Malak", 70 to "Ali", 80 to "Ahmed", 90 to "Kholoud", 70 to "Ramy", 80 to "Salma", 100 to "Aya", 100 to "Yara", 60 to "Jana", 80 to "Mustafa")
    val hashMap = HashMap<Int, String>()
    for ( (grade, student) in studentList ) {
        if (hashMap.containsKey(grade)) {
            hashMap[grade] = hashMap[grade] + " , " + student
        } else {
            hashMap[grade] = student
        }
    }
    val des=hashMap.toSortedMap(compareByDescending { it })
    des.forEach {
            (grade, student) ->println("Grade $grade: $student")
    }
}