package TimeComplexity

import org.scalatest.{FunSuite, FunSpec}

/**
 * Created by sensei on 10/26/15.
 */
class PermMissingElemSpec extends FunSuite{



  test("initial data sample"){

    val A = new Array[Int](4)

    A(0) = 2
    A(1) = 3
    A(2) = 1
    A(3) = 5


    val res = PermMissingElem.solution(A)

    assert(res == 4)

  }

  test("missing 1"){

    val A = new Array[Int](4)

    A(0) = 2
    A(1) = 3
    A(2) = 4
    A(3) = 5


    val res = PermMissingElem.solution(A)

    assert(res == 1)

  }


  test("N=1"){

    val A = new Array[Int](1)

    A(0) = 2


    val res = PermMissingElem.solution(A)

    assert(res == 1)

  }


  test("large ~100000"){

    val A = 1 to 56734

    val B = 56736 to 100001

    val C = (A++B).toArray


    val res = PermMissingElem.solution(C)

    assert(res == 56735)

  }




}
