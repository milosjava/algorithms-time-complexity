package PrefixSums

//test text: https://codility.com/programmers/task/genomic_range_query
//performance : https://codility.com/demo/results/trainingEUR4XP-425/

object GenomicRangeQuery {

  def solution(S: String, P: Array[Int], Q: Array[Int]): Array[Int] = {


    val resp = for(ind <- 0 to P.length-1) yield {

      val sub= S.substring(P(ind),Q(ind)+1)


      var factor = 4

      if(sub.contains("A")) {factor=1}
      else{
        if(sub.contains("C")) {factor=2}
        else{
          if(sub.contains("G")) {factor=3}
        }
      }
      factor

    }

    return resp.toArray

  }

}
