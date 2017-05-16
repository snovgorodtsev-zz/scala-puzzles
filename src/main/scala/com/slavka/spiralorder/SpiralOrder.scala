package com.slavka.spiralorder

import scala.annotation.tailrec

/*
https://www.interviewbit.com/problems/spiral-order-matrix-i/

Given a matrix of m * n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example:

Given the following matrix:

[
    [ 1, 2, 3 ],
    [ 4, 5, 6 ],
    [ 7, 8, 9 ]
]

You should return

[1, 2, 3, 6, 9, 8, 7, 4, 5]
*/

object SpiralOrder {

  def spiralOrder(a: List[List[Int]]): List[Int] = {

    @tailrec
    def spiralOrder(res: List[Int], topRow: Int, leftColumn: Int): List[Int] = {
      val bottomRow = a.size - topRow - 1
      val rightColumn = a.head.size - leftColumn - 1

      @tailrec
      def right(res: List[Int], c: Int): List[Int] =
        if (c <= rightColumn) right(a(topRow)(c) :: res, c + 1) else res

      @tailrec
      def up(res: List[Int], r: Int): List[Int] =
        if (r > topRow) up(a(r)(leftColumn) :: res, r - 1) else res

      @tailrec
      def left(res: List[Int], c: Int): List[Int] =
        if (c > leftColumn) left(a(bottomRow)(c) :: res, c - 1) else res

      @tailrec
      def down(res: List[Int], r: Int): List[Int] =
        if (r < bottomRow) down(a(r)(rightColumn) :: res, r + 1) else res


      if (topRow > a.size / 2) res.reverse else {
        spiralOrder(
          {
            val rightRes = right(res, leftColumn)
            val downRes = down(rightRes, topRow + 1)
            if (rightRes != downRes) {
              val leftRes = left(downRes, rightColumn)
              if (downRes != leftRes) up(leftRes, bottomRow) else leftRes
            } else downRes
          },
          topRow + 1,
          leftColumn + 1)
      }
    }

    spiralOrder(Nil, 0, 0)
  }

}
