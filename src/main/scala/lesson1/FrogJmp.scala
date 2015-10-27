package lesson1

//100%
//test text: https://codility.com/programmers/task/frog_jmp
//performance: https://codility.com/demo/results/trainingTQS547-ZQW/

object FrogJmp {

  def solution(X: Int, Y: Int, D: Int): Int = {

    //divide distance (Y-X) with fixed jump distance. If there is reminder then add 1 to result to
    // cover that part with one jump

    val jumps  =   (Y-X) / D  + (if(((Y-X) % D) >0 ) 1 else 0)

    jumps

  }

}
