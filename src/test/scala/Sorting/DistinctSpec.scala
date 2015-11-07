package Sorting

import org.scalatest.FunSuite

/**
 * Created by sensei on 10/27/15.
 */
class DistinctSpec extends FunSuite {


  test("sample data") {


    var A = new Array[Int](6)

    A(0) = 2
    A(1) = 1
    A(2) = 1
    A(3) = 2
    A(4) = 3
    A(5) = 1


    assert(Distinct.solution(A) == 3)



  }


  test("just one") {


    var A = new Array[Int](1)

    A(0) = 2


    assert(Distinct.solution(A) == 1)



  }



}
