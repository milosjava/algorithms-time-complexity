package lesson1

import org.scalatest.FunSuite

/**
 * Created by sensei on 10/25/15.
 */
class FrogJmpSpec extends FunSuite {


  test("sample data"){

    val res = FrogJmp.solution(10,85,30)

    assert(res == 3)


  }


  test("border case 1"){

    val res = FrogJmp.solution(10,10,30)

    assert(res == 0)


  }


  test("sample 2"){

    val res = FrogJmp.solution(10,31,20)

    assert(res == 2)


  }

  test("sample 3"){

    val res = FrogJmp.solution(10,30,20)

    assert(res == 1)


  }

    val res = FrogJmp.solution(10,29,20)

    assert(res == 1)


  }

}
