
// .kt
//static -> no need to create object for calling main

// public static void main(String args[])

// by default --> public static
fun main(args : Array<String>){ // main method of this program

    // variable declaration

    // int value = 10;

    // var --> variable

    // int, float, char, long, short

    // Int, Float, Char, Long, Short

    //int value = 10

    // int value2 =90

    // int value3 = value


    // Int value = 10
    // Int value1 = 20
    // Int value3 = value

    // type specify

    // swap --> third variable or without third variable

    var first = 90
    var second = 45
    //var temp  = 0

//    temp = first
//    first = second
//    second = temp

//    first += second // 90 + 45 --> 135
//    second = first - second// 135 - 45 --> 90
//    first -= second  // 135 - 90 --> 45

    //second = first

    first = second.also { second = first }

    println("First value = $first")    // String Interpolation
    println("Second value = $second")

}