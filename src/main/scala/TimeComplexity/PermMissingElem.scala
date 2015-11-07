package TimeComplexity


//TODO fix some issues , score 50%
//text: https://codility.com/programmers/task/perm_missing_elem
//performance : https://codility.com/demo/results/trainingXYR8XS-7R9/

object PermMissingElem {

  def solution(A: Array[Int]): Int = {


    val As = A.sorted

    if(As(0)==2){
      return 1
    }

    for(ind <- 1 to As.length-1){
      if(As(ind)==(As(ind-1)+2)){
        return As(ind)-1
      }
    }

    -1 // should not come to this

  }

  def main(args: Array[String]) {

    val A = new Array[Int](4)

    A(0) = 2
    A(1) = 3
    A(2) = 1
    A(3) = 5


    val res = PermMissingElem.solution(A)

    println(res)

  }


}
