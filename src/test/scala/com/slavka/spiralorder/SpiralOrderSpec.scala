package com.slavka.spiralorder

import com.slavka.spiralorder.SpiralOrder.spiralOrder
import org.scalatest.{Matchers, WordSpecLike}

class SpiralOrderSpec extends WordSpecLike with Matchers {

  "SpiralOrder" should {

    "work for 3*3" in {
      spiralOrder(List(
        List(1, 2, 3),
        List(4, 5, 6),
        List(7, 8, 9)
      )) === List(1, 2, 3, 6, 9, 8, 7, 4, 5)
    }

    "work for 4*4" in {
      spiralOrder(List(
        List(1, 2, 3, 4),
        List(5, 6, 7, 8),
        List(9, 10, 11, 12),
        List(13, 14, 15, 16)
      )) === List(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7)
    }

    "work for 5*5" in {
      spiralOrder(List(
        List(1, 2, 3, 4, 5),
        List(6, 7, 8, 9, 10),
        List(11, 12, 13, 14, 15),
        List(16, 17, 18, 19, 20),
        List(21, 22, 23, 24, 25)
      )) === List(1, 2, 3, 4, 5, 10, 15, 20, 25, 24, 23, 22, 21, 16, 11, 6, 7, 8, 9, 14, 19, 18, 17, 12, 13)
    }

    "work for 3*5" in {
      spiralOrder(List(
        List(1, 2, 3, 4, 5),
        List(6, 7, 8, 9, 10),
        List(11, 12, 13, 14, 15)
      )) === List(1, 2, 3, 4, 5, 10, 15, 14, 13, 12, 11, 6, 7, 8, 9)
    }

    "work for 5*3" in {
      spiralOrder(List(
        List(1, 2, 3),
        List(4, 5, 6),
        List(7, 8, 9),
        List(10, 11, 12),
        List(13, 14, 15)
      )) === List(1, 2, 3, 6, 9, 12, 15, 14, 13, 10, 7, 4, 5, 8)
    }
  }

}
