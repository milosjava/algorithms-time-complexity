package lesson1


//test text:  https://codility.com/programmers/task/tape_equilibrium
//performance: https://codility.com/demo/results/trainingZNZCZN-AGC/

object TapeEquilibrium {

  def solution(A: Array[Int]): Int = {

    //get the whole sum
    val allSum = A.sum

    //calculate left and right sum
    var sumLeft = A(0)
    var sumRight = allSum - sumLeft

    //set initial diff for P=1
    var minDiff = math.abs(sumLeft-sumRight)  //difference

    // loop for all P after the initial P position
    for(p <- 1 to A.length-2){

      //recalculate values
      sumLeft += A(p)
      sumRight -= A(p)

      if(math.abs(sumLeft-sumRight) < minDiff){
        // if difference is smaller then save new min diff
        minDiff = math.abs(sumLeft-sumRight)
      }


    }

    minDiff
  }

}
