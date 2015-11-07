package Leader

//todo improve 91%
//task text:  https://codility.com/programmers/task/dominator
//performance: https://codility.com/demo/results/trainingRY8UX4-NY2/
object Dominator {


  def solution(A: Array[Int]): Int = {

    val N = A.length

    //empty array , no dominator
    if(N == 0) return -1

    //just one element so this element is dominator
    if(N == 1) return A(0)


    //group values
    val count = A.groupBy(identity).mapValues(_.size)

    //find which one shows often
    val maxOccurence = count.valuesIterator.max


    if(N/2 < maxOccurence){

      //get key from the map which is our dominator
      val value = count.find(_._2==maxOccurence).get._1

      //get the first index for dominator
      return A.indexOf(value)

    }else{
      //no dominator
      return -1
    }

  }

}
