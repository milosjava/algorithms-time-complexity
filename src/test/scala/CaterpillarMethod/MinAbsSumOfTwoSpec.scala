package CaterpillarMethod

import org.scalatest.FunSuite

/**
 * Created by sensei on 10/31/15.
 */
class MinAbsSumOfTwoSpec extends  FunSuite{

  test("sample code"){

    val A = Array(-8,4,5,-10,3)

    assert(MinAbsSumOfTwo.solution(A) == 3)


  }


}
