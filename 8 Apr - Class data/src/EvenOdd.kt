
// if-else
// Decision Making statements

fun main(args: Array<String>) {

    var first = 10
    var second = 90
    var third = 12
    var max = 0

    // first or second --> max
    max = if(first>second)
            first
        else
            second

    println("value of max = $max")

    //?:

    if(first%2==0) println("Even") else println("Odd")

    // out of 3 which value is greater
    if(first > second && first > third)
        println("first is greater")
    else if(second>third)
        println("Second is greater")
    else
        println("third is greater")

// when

    when{
        first>second && first>third -> println("first value is greater")
        second>third -> println("Second is greater")
        else -> println("Third is greater")
    }


    var userValue = 'a' // vowel or consonant

    when(userValue){
        'a', 'e', 'i', 'o', 'u'-> println("vowel")
        else -> println("consonant")
    }

    max = when{
        first>second -> first
        else -> second
    }

    // with switch in java
}

