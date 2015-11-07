package lesson4

import org.scalatest.FunSuite

/**
 * Created by sensei on 10/27/15.
 */
class MaxProductOfThreeSpec extends FunSuite {


  test("sample data"){



    val A =  new Array[Int](6)

    A(0) = -3
    A(1) = 1
    A(2) = 2
    A(3) = -2
    A(4) = 5
    A(5) = 6


    var res = MaxProductOfThree.solution(A)


    assert(res == 60)


  }



  test("sample data"){



    val A =  new Array[Int](6)

    A(0) = -3
    A(1) = -1
    A(2) = -4
    A(3) = -2
    A(4) = 5
    A(5) = 6


    var res = MaxProductOfThree.solution(A)


    assert(res == 60)


  }



}
