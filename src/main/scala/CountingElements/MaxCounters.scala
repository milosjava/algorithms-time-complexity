package CountingElements

import java.util

//100 %
//test text:  https://codility.com/programmers/task/max_counters
//performance:  https://codility.com/demo/results/trainingKJT6Y3-74G/

object MaxCounters {

  def solution(N: Int, A: Array[Int]): Array[Int] = {



    var counters = new Array[Int](N)

    var maxCounter = 0

    for(ind <- 0 to A.length-1){


      if(A(ind) == (N+1)){

        //all to max
        util.Arrays.fill(counters,maxCounter)

      }else{
        //ind -1  cause array index start with 0 which is marked as 1 in the input data
        counters(A(ind)-1) += 1

        //update max counter if necessary
        if(maxCounter< (counters(A(ind)-1))) maxCounter = (counters(A(ind)-1))

      }

    }

    return counters
  }


}
