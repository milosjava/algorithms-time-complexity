package step3

import scala.io.Source

/**
 * Created by sensei on 10/27/15.
 */
object Task3 {



  def getAnagramWords (W: String) :Array[String] = {

    //read the file
    val source = Source.fromURL(getClass.getResource("/word_list.txt"))
    val lines = source.getLines

    //create words array
    var words  = Array() ++ lines

    var res = Array[String]()


    var inputCharArray = (Array[Char]() ++ W).sorted


    for(ind  <- 0  to words.length-1){


      val w = words(ind)

      if(W.length == w.length){

        var elementCharArray = (Array() ++ w).sorted


        if(inputCharArray.deep == elementCharArray.deep){
          res = res :+w

        }

      }

    }



    res

  }

}
