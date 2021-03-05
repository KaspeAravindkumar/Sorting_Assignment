package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class SortingTest extends AnyFlatSpec {
  val sort = new Sorting

  //TestCase for bubble sorting
  "bubble sort" should "be found for the List" in {
    val res = sort.bubbleSortListOfInt(List(25, 15, 20, 63, 99))
    assert(res == List(15, 20, 25, 63, 99))
  }
}
