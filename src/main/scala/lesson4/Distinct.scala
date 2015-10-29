package lesson4

/**
 * Created by sensei on 10/27/15.
 */

//test text:  https://codility.com/programmers/task/distinct
//performance: https://codility.com/demo/results/training465KN8-2J3/
object Distinct {


//so easy to do it in scala
  def solution(A: Array[Int]): Int = {
    return A.distinct.length
  }

}
