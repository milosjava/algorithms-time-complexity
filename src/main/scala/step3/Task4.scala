package lesson2

/**
 * Created by sensei on 10/27/15.
 */
object Task4 {


  def format (N: Int) :String = {


    var numberString = N.toString


    if(numberString.length < 4) {
      println(numberString)
      return numberString
    }

    //for 4 or more create a output string with commas


    var numberOfCommas = (numberString.length  - 1 )/3

    var reverseString  = numberString.reverse


    var iter = reverseString.sliding(3,3)


    var res = new StringBuilder()

    //lets iterate

    for(ss <- iter){

      res ++=ss

      if(numberOfCommas > 0 ) {
        res ++= ","
        numberOfCommas -= 1

      }



    }



    println(res.toString().reverse)
    res.toString().reverse

  }



}
