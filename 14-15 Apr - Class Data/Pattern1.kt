
/*

    1   row =0/1, 4/5 and column = 0/1, 4/5
    22
    333
    4444
    55555

 */

fun main(args: Array<String>) {

    // for(int row = 1; row<=5; row++)

    // in --> lambda function
//    for(row in 1..5){   // ..  --> start_value range operator end_value
//
//        for(column in 1..row){
//            print(column)           // 1
//        }                           // 12
//        println()                   // 123
//    }
    //for(row in 5..1)

    for(row in 5 downTo 1 step 2){
        println(row)
    }    //

    for(row in 2..10 step 2){
        println(row)
    }

}







