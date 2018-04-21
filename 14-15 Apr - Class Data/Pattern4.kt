
/*
         *
        **
       ***
      ****
     *****

 */


fun main(args: Array<String>) {

    for (row in 1..5) {

//        for (space in 5 downTo row) {
//            print(" ")
//        }
        for (column in 1..5) {
        //    print("*")
                if(column<=5-row){
                    print(" ")
                }else{
                    print("*")
                }
        }
        println()
    }
}