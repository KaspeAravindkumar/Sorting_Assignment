package com.knoldus

import scala.collection.immutable.List
import scala.io.StdIn.readInt

object SortingApi extends App {

  val sort = new Sorting

  //User Input for number of Integers in a list
  println("Enter the number of Integers in a List to be sorted : ")
  val n = readInt()

  //User Input for list of Integers
  println(s"Enter $n Integers for bubble sorting : ")
  val userInput = List.fill(n) {
    scala.io.StdIn.readInt()
  }

  //printing output
  println(s"Bubblesorted List" + sort.bubbleSortListOfInt(userInput).mkString("(", ", ", ")"))

}
