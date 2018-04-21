
/*

    54321
    5432
    543
    54
    5

 */

fun main(args: Array<String>) {

    for(row in 1..5){   // row = 5

        for(column in 5 downTo row){ // col = 5>=5
            print(column)
        }
        println()
    }
}
