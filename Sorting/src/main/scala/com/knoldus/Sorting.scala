package com.knoldus

import scala.annotation.tailrec

class Sorting {

  //function for bubble sort of list of integer
  def bubbleSortListOfInt(list: List[Int]): List[Int] = {
    @tailrec
    def bubbleSort(listOfInt: List[Int], rest: List[Int], sorted: List[Int]): List[Int] = listOfInt match {
      case x :: Nil =>
        if(rest.isEmpty) x :: sorted
        else bubbleSort(rest, Nil, x :: sorted)
      case a :: b :: xs =>
        if (a > b) bubbleSort(a :: xs, b :: rest, sorted)
          else bubbleSort(b :: xs, a :: rest, sorted)
      case _ =>
        Nil
    }

    bubbleSort(list, Nil, Nil)
  }

}
