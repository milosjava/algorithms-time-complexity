package CaterpillarMethod


//todo improve 45%

//task text: https://codility.com/programmers/task/min_abs_sum_of_two
//performance: https://codility.com/demo/results/trainingUBTVX4-KYS/

object MinAbsSumOfTwo {


  def solution(A: Array[Int]): Int = {

    val itselfAbsSum =A.map(p=> math.abs(p+p))

    val othersAbsSum  = (A.combinations(2).toArray).map(p=> math.abs(p(0)+p(1)))

    val result = (itselfAbsSum ++ othersAbsSum).min

    result

  }


}
