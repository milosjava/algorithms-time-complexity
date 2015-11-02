package step3

import org.scalatest.FunSuite

/**
 * Created by sensei on 10/28/15.
 */
class Task1Spec extends FunSuite{


  test("sample"){



    var result = Task1.getMetagram("apple")

    assert(result.length == 2)

      //["ample", "apply"]

    assert(result.contains("ample"))
    assert(result.contains("apply"))


    //

    //"sport" => ["short", "snort", "spout", "spurt"]

    result = Task1.getMetagram("sport")

    assert(result.length == 4)


    assert(result.contains("short"))
    assert(result.contains("snort"))
    assert(result.contains("spout"))
    assert(result.contains("spurt"))



    //"film" => ["file", "fill", "firm"]


    result = Task1.getMetagram("film")

    assert(result.length == 3)


    assert(result.contains("file"))
    assert(result.contains("fill"))
    assert(result.contains("firm"))


    //"impact" => ["impart"]

    result = Task1.getMetagram("impact")

    assert(result.length == 1)

    assert(result.contains("impart"))



    //"lucky" => ["bucky", "yucky"]

    result = Task1.getMetagram("lucky")

    assert(result.length == 2)


    assert(result.contains("bucky"))
    assert(result.contains("yucky"))

  }


}
