package lesson3


//TODO issues, check performance - score 90%
//task text:  https://codility.com/programmers/task/passing_cars
//performance : https://codility.com/demo/results/training37RMAT-VKM/
object PassingCars {

  def solution(A: Array[Int]): Int = {


    var currentGoingEast = 0 //initial value

    var totalPassingCars = 0 // initial value

    for (ind <- 0 to A.length - 1) {


      if (A(ind) == 0) {
        currentGoingEast += 1

      } else {
        //going west


        //Be sure that there are already passing cars east. Cause:
        //"We say that a pair of cars (P, Q), where 0 ≤ P < Q < N, is passing when P is
        // traveling to the east and Q is traveling to the west."
        if (currentGoingEast > 0) {

          totalPassingCars += currentGoingEast


        }

      }


    }

    if (totalPassingCars > 1000000000) -1 else totalPassingCars

  }

}
