package step3

import org.scalatest.FunSuite

/**
 * Created by sensei on 10/28/15.
 */
class Task2Spec extends FunSuite{

  test("sample data"){


    var result = Task2.digitsSum(3)

    assert(result == 6)


    result = Task2.digitsSum(10)

    assert(result == 46)

   // N = 110
    //sum = 957

    result = Task2.digitsSum(110)

    assert(result == 957)

    //N = 90
    //sum = 774

    result = Task2.digitsSum(90)

    assert(result == 774)

  }


}
