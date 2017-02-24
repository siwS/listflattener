package logic

import org.scalatest.FunSuite

/**
  * Tests for Flattener
  * Created by sofia on 24/02/17.
  */
class FlattenerTest extends FunSuite {

  /* Data */

  val list1 = List(List(List(5), 6))
  val expectedResult1 = List(5, 6)

  val list2 = List(1,List(2,3,4,List(5, List(6,7,List(List(7, List(((((((19)))))))))))))
  val expectedResult2 = List(1, 2, 3, 4, 5, 6, 7, 7, 19)

  val list3 = List(4, List(List(List(List(List(List(List(5))))), 6, 2, 4)), List(List(List(List(List(List(List(List(9))), 6, 7, 0, 4), 3, 3, 3, 6))), 1), List(List(List(2))), List(List(List(List(List(List(List(List(8)))), 9)))), List(List(List(List(List(List(List(1))), 4))), 6), List(List(List(List(List(5, 5, 3))))), List(List(List(List(List(List(List(3)), 10, 9, 9, 0)))), 5), List(List(List(List(List(3), 0, 3)), 6)), List(List(List(List(List(List(List(9)))))), 8, 9), List(2), List(List(List(2))), List(List(List(List(List(List(5, 4, 9, 0), 7), 8)))), List(List(List(List(List(List(List(6, 1)))), 9), 1, 9, 1, 7)), List(List(1), 10, 8, 8), List(List(List(List(List(List(List(12), 8, 9, 5), 10, 8, 7))), 6, 1, 5, 6), 9, 5, 3, 1), List(List(List(List(List(7))), 5, 8), 2, 7, 5), List(6), List(List(List(List(List(List(List(45), 3), 7, 8, 3))), 1, 6, 8, 6), 0, 10), List(2), List(List(List(List(List(List(List(List(List(List(9), 6))))), 0, 6, 5)), 4), 3, 9), List(List(List(List(List(List(List(List(4)), 8, 2, 2), 0, 5, 3)))), 5, 3, 3), List(List(List(List(List(List(8)), 3, 5), 4)), 8, 9, 8))
  val expectedResult3 = List(4, 5, 6, 2, 4, 9, 6, 7, 0, 4, 3, 3, 3, 6, 1, 2, 8, 9, 1, 4, 6, 5, 5, 3, 3, 10, 9, 9, 0, 5, 3, 0, 3, 6, 9, 8, 9, 2, 2, 5, 4, 9, 0, 7, 8, 6, 1, 9, 1, 9, 1, 7, 1, 10, 8, 8, 12, 8, 9, 5, 10, 8, 7, 6, 1, 5, 6, 9, 5, 3, 1, 7, 5, 8, 2, 7, 5, 6, 45, 3, 7, 8, 3, 1, 6, 8, 6, 0, 10, 2, 9, 6, 0, 6, 5, 4, 3, 9, 4, 8, 2, 2, 0, 5, 3, 5, 3, 3, 8, 3, 5, 4, 8, 9, 8)

  val listString = List("F",List("L","A", List("T", "T", List("E", "N", "E", List("D")))))
  val expectedResultString = List("F", "L", "A", "T", "T", "E", "N", "E", "D")

  val listMixed = List("A",List(2,"C", List(7, "D", 9, 10, List(2))))
  val expectedListMixed = List("A", 2, "C", 7, "D", 9, 10, 2)

  /* Tests for flatten method */

  test("Flatten Arbitrary List of Integers Test 1") {
    val result = new Flattener flatten(list1)
    assert( result.equals(expectedResult1) )
  }

  test("Flatten Arbitrary List of Integers Test 2") {
    val result = new Flattener flatten(list2)
    assert( result.equals(expectedResult2) )
  }

  test("Flatten Arbitrary List of Integers Test 3") {
    val result = new Flattener flatten(list3)
    assert( result.equals(expectedResult3) )
  }

  test("Flatten Arbitrary List of Strings Test") {
    val result = new Flattener flatten(listString)
    assert (result.equals(expectedResultString))
  }

  test("Flatten Arbitrary List of Mixed Test") {
    val result = new Flattener flatten(listMixed)
    assert (result.equals(expectedListMixed))
  }

  /* Tests for Tail Recursive flatten method */

  test("Tail Recursive Flatten Arbitrary List of Integers Test 1") {
    val result = new Flattener flatten_tail_rec(list1)
    assert( result.equals(expectedResult1) )
  }

  test("Tail Recursive Flatten Arbitrary List of Integers Test 2") {
    val result = new Flattener flatten_tail_rec(list2)
    assert( result.equals(expectedResult2) )
  }

  test("Tail Recursive Flatten Arbitrary List of Integers Test 3") {
    val result = new Flattener flatten_tail_rec(list3)
    assert( result.equals(expectedResult3) )
  }

  test("Tail Recursive Flatten Arbitrary List of Strings Test") {
    val result = new Flattener flatten_tail_rec(listString)
    assert (result.equals(expectedResultString))
  }

  test("Tail Recursive Flatten Arbitrary List of Mixed Test") {
    val result = new Flattener flatten_tail_rec(listMixed)
    assert (result.equals(expectedListMixed))
  }

}
