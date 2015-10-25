package lesson1

import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter

import lesson1.TapeEquilibrium

class TapeEquilibriumSpec extends FunSuite  {




  test("sample Data") {

    var A = new Array[Int](5)

    A(0) = 3
    A(1) = 1
    A(2) = 2
    A(3) = 4
    A(4) = 3


    var res = TapeEquilibrium.solution(A)

    assert(res == 1)
  }



}
