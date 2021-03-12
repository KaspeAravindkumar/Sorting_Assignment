package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class SortingTest extends AnyFlatSpec {
  val sort = new Sorting

  //TestCase for bubble sorting
  "bubble sort" should "be found for the List" in {
    val res = sort.bubbleSortListOfInt(List(25, 15, 20, 63, 99))
    assert(res == List(15, 20, 25, 63, 99))
  }

  //for List with 0 elements throughts Nil
  it should "through Nil" in {
    val res = sort.bubbleSortListOfInt(List())
    assert(res == Nil)
  }

  //It should fail as expected is wrong
  it should "fail" in {
    val res = sort.bubbleSortListOfInt(List(25, 15, 20, 63, 99))
    assert(!(res == List(99,63,25,20,15)))
  }


}
