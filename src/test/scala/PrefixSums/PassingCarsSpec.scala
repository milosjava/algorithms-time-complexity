package PrefixSums

import org.scalatest.FunSuite

/**
 * Created by sensei on 10/26/15.
 */
class PassingCarsSpec extends FunSuite{



  test("sample data"){

    var A = new Array[Int](5)

    A(0) = 0
    A(1) = 1
    A(2) = 0
    A(3) = 1
    A(4) = 1


    var res = PassingCars.solution(A)

    assert(res == 5)


  }


  test("only east"){

    var A = new Array[Int](5)

    A(0) = 0
    A(1) = 0
    A(2) = 0
    A(3) = 0
    A(4) = 0


    var res = PassingCars.solution(A)

    assert(res == 0)


  }


  test("only one"){

    var A = new Array[Int](5)

    A(0) = 1
    A(1) = 1
    A(2) = 1
    A(3) = 1
    A(4) = 1


    var res = PassingCars.solution(A)

    assert(res == 0)


  }


  test("one east on end"){

    var A = new Array[Int](5)

    A(0) = 1
    A(1) = 1
    A(2) = 1
    A(3) = 1
    A(4) = 0


    var res = PassingCars.solution(A)

    assert(res == 0)

  }

  test("one west on end"){

    var A = new Array[Int](5)

    A(0) = 0
    A(1) = 0
    A(2) = 0
    A(3) = 0
    A(4) = 1


    var res = PassingCars.solution(A)

    assert(res == 4)

  }



}
