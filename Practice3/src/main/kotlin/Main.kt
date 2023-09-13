fun main(args: Array<String>) {
//task 1
    val myAge = 19


   val isTeenager = myAge in 13..19
    //-----

    //task 2
    val theirAge = 30
    val bothTeenagers = theirAge in 13..19 && myAge in 13..19
    //-----

    //task 3
    val reader: String = "Angela"
    val author: String = "Richard Lucas"
    val authorIsReader = reader == author
    //----

    //task 4
    val readerBeforeAuthor = reader < author
    //----

    //task 5
    val myAge2 = 18
    if (myAge2 >= 13 && myAge2 <= 19) {
        println("Подросток")
    }
    else {
            println("Не подросток")
    }
    //-----

    //task 6
    val  answer = if (myAge2 in 13..19) {
        println("Подросток")
    }
    else {
        println("Не подросток")
    }
    println(answer)
    //-----

    //task 7
    var counter = 0
    while (counter < 10)
    {
        println("counter равен $counter")
    }
    counter+1
    //----

    //task 8
    var counter = 0
    var roll = 0
    roll = (0..5).random()
    counter++
    println("После $counter бросков, roll равен $roll")
 while (roll != 0)
     //---

     //task 9
     val range =  1..10
    for (number in range)
    {
        val square = number * number
        println("Квадрат числа $number равен $square")
    }
    //---

//task10
    for (number in range) {
        val squareRoot = Math.sqrt(number.toDouble())
        println("Квадратный корень числа $number равен $squareRoot")
    }
    //---











}