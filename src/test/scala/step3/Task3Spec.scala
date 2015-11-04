package step3

import org.scalatest.FunSuite

/**
 * Created by sensei on 10/27/15.
 */
class Task3Spec extends FunSuite {



  test("sample") {


    var res = Task3.getAnagramWords("beat")


    assert(res.length == 3)

    // ["beat", "beta", "bate"]

    assert(res.contains("beat") == true)
    assert(res.contains("beta") == true)
    assert(res.contains("bate") == true)



  }


  test("sample2") {


    var res = Task3.getAnagramWords("able")


    assert(res.length == 4)

    // ["beat", "beta", "bate"]

    assert(res.contains("abel") == true)
    assert(res.contains("able") == true)
    assert(res.contains("bale") == true)
    assert(res.contains("beal") == true)



  }

}
