package runtime

import logic.Flattener

/**
  * Run Application
  * Created by sofia on 23/02/17.
  */
object SolutionApp {

  // Input Data to Run
  val list1 = List(List(List(5), 6))
  val list2 = List(1,List(2,3,4,List(5, List(6,7,List(List(7, List(((((((19)))))))))))))
  val list3 = List(4, List(List(List(List(List(List(List(5))))), 6, 2, 4)), List(List(List(List(List(List(List(List(9))), 6, 7, 0, 4), 3, 3, 3, 6))), 1), List(List(List(2))), List(List(List(List(List(List(List(List(8)))), 9)))), List(List(List(List(List(List(List(1))), 4))), 6), List(List(List(List(List(5, 5, 3))))), List(List(List(List(List(List(List(3)), 10, 9, 9, 0)))), 5), List(List(List(List(List(3), 0, 3)), 6)), List(List(List(List(List(List(List(9)))))), 8, 9), List(2), List(List(List(2))), List(List(List(List(List(List(5, 4, 9, 0), 7), 8)))), List(List(List(List(List(List(List(6, 1)))), 9), 1, 9, 1, 7)), List(List(1), 10, 8, 8), List(List(List(List(List(List(List(12), 8, 9, 5), 10, 8, 7))), 6, 1, 5, 6), 9, 5, 3, 1), List(List(List(List(List(7))), 5, 8), 2, 7, 5), List(6), List(List(List(List(List(List(List(45), 3), 7, 8, 3))), 1, 6, 8, 6), 0, 10), List(2), List(List(List(List(List(List(List(List(List(List(9), 6))))), 0, 6, 5)), 4), 3, 9), List(List(List(List(List(List(List(List(4)), 8, 2, 2), 0, 5, 3)))), 5, 3, 3), List(List(List(List(List(List(8)), 3, 5), 4)), 8, 9, 8))
  val listString = List("F",List("L","A", List("T", "T", List("E", "N", "E", List("D")))))
  val listMixed = List("A",List(2,"C", List(7, "D", 9, 10, List(2))))

  def main(args: Array[String]) {

    println(new Flattener flatten(list1))

    println(new Flattener flatten_tail_rec(list1))

    println(new Flattener flatten(list2))

    println(new Flattener flatten_tail_rec(list2))

    println(new Flattener flatten(list3))

    println(new Flattener flatten_tail_rec(list3))

    println(new Flattener flatten(listString))

    println(new Flattener flatten_tail_rec(listString))

    println(new Flattener flatten(listMixed))

    println(new Flattener flatten_tail_rec(listMixed))
  }

}
