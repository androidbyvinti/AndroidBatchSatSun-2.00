
/*

    A   row =0/1, 4/5 and column = 0/1, 4/5
    AB
    ABC
    ABCD
    ABCDE

 */


fun main(args: Array<String>) {

    // for(char row = 'A'; row<='E'; row++)

    for(row in 'A'..'E'){
        for(column in 'A'..row){
            print(column)
        }
        println()
    }

    println('A' + 1)    // String + Int --> A1
                        // Char(ASCII) + Int --> 65 + 1 --> 66(B) --> Char --> B
}


//fun main(args: Array<String>) {
//
    // ASCII --> A-Z --> 65-90
//    var temp = 65
//
//    // row = 1<=5
//    for(row in 1..5) // 2<=5
//    {   // temp --> int = (char)65 --> increment
//        temp = 65                   // A
//                                    // AB
//        for(column in 1..row) // column <=row  1<=1
//        {
//            print(temp.toChar())// 66--> char --> B
//            temp++ // 65 + 1 - > 66
//        }
//        println()
//    }
//}
