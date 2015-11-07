package PrefixSums

import org.scalatest.FunSuite

/**
 * Created by sensei on 10/29/15.
 */
class GenomicRangeQuerySpec extends FunSuite{



  test("sample data"){

    val P = Array(2,5,0)
    val Q = Array(4,5,6)

    val S = "CAGCCTA"



    val res = GenomicRangeQuery.solution(S,P,Q)


    assert(res.length == 3 )

    assert( res.sorted.deep == Array(1,2,4).deep)


  }

}
