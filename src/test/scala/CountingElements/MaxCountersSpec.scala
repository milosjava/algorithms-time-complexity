package CountingElements

import org.scalatest.FunSuite

/**
 * Created by sensei on 10/26/15.
 */
class MaxCountersSpec extends FunSuite{




  test("example data"){

    var A = new Array[Int](7)

    var N = 5

    A(0) = 3
    A(1) = 4
    A(2) = 4
    A(3) = 6
    A(4) = 1
    A(5) = 4
    A(6) = 4


    var res = MaxCounters.solution(N,A)

    res.foreach(println)

    assert(Array(3,2,2,4,2) ===  res )



  }



  test("one element"){

    var A = new Array[Int](1)

    var N = 5

    A(0) = 3



    var res = MaxCounters.solution(N,A)

    assert(Array(0,0,1,0,0) ===  res )



  }

}
