package step3

import scala.io.Source._

/**
 * Created by sensei on 10/28/15.
 */
object Task1 {


  def getMetagram( W: String) : Array[String] = {


    //get lines

    val lines  = fromFile("/home/sensei/wl.txt").getLines()

    val words =  Array() ++ lines

    var res = Array[String]()


    val input = Array() ++ W


    for(ind <- 0 to words.length-1){

      var w = words(ind)


      var element = Array() ++ w

      var different = 0


      if(w.length == input.length){

        for(counter <- 0 to w.length-1) {

          if(element(counter)!=input(counter)){
            different += 1
          }


        }

        if(different==1) {

          res = res :+ w
        }


      }


    }

    return res

  }

}
