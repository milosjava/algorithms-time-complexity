package lesson2

import org.scalatest.FunSuite

/**
 * Created by sensei on 10/27/15.
 */
class Task4Spec extends FunSuite {


  test("simple"){



    var res = Task4.format(1)
    assert(res == "1")

    res = Task4.format(10)
    assert(res == "10")


    res = Task4.format(1000)
    assert(res == "1,000")

    res = Task4.format(10000)
    assert(res == "10,000")

    res = Task4.format(100000)
    assert(res == "100,000")


    res = Task4.format(1000000)
    assert(res == "1,000,000")

    res = Task4.format(1000000000)
    assert(res == "1,000,000,000")


    res = Task4.format(1234567899)
    assert(res == "1,234,567,899")


  }

}
