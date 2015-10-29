package lesson4

//todo issues 44%
//test task:  https://codility.com/programmers/task/max_product_of_three
//performance: https://codility.com/demo/results/trainingVF9SF5-GGR/
object MaxProductOfThree {



  def solution(A : Array[Int]) : Int = {


    if(A.length ==3){

      return A.product
    }

    val N = A.length
    //sort it
    val S = A.sorted


    return (S(N-3)*S(N-2)*S(N-1))

  }


  def main (args: Array[String] ) {
    val A =  new Array[Int](6)

    A(0) = -3
    A(1) = 1
    A(2) = 2
    A(3) = -2
    A(4) = 5
    A(5) = 6


    var res = MaxProductOfThree.solution(A)

  }

}
