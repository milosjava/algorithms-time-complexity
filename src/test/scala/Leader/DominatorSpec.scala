package Leader

import org.scalatest.FunSuite

/**
 * Created by sensei on 10/30/15.
 */
class DominatorSpec extends FunSuite {


  test("sample data"){

    val A = Array(3,4,3,2,3,-1,3,3)

    val res  = Dominator.solution(A)

    assert(Array(0, 2, 4, 6 ,7).contains(res))

  }

  test("empty"){

    val A = Array[Int]()

    val res  = Dominator.solution(A)

    assert(res == -1)

  }

  test("one element"){

    val A = Array(66)

    val res  = Dominator.solution(A)

    assert(res == 66)

  }

  test("2 elements"){

    val A = Array(33,44)

    val res  = Dominator.solution(A)

    assert(res == -1)


  }




}
