package step3

/**
 * Created by sensei on 10/28/15.
 */
object Task2 {


  def digitsSum(N: Int) : Int = {


    var r =  1 to N

    var str = Array[String]()

    var bigSum = 0

    for(ind <- 0 to r.length-1){


      var ss = r(ind).toString()

      //println(ss)

      var charsS = Array() ++ ss

      //println(bigSum)

      //very ugly
      var e = charsS.map(p=> p.toInt-48)


      var esum = e.sum


      bigSum += esum

      //str = str :+ charsS

    }

    bigSum


  }

  def main(args: Array[String]) {

    print(digitsSum(10))


  }

}
