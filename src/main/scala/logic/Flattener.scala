package logic

import scala.annotation.tailrec

/**
  * Defines functionality to flatten an input List
  * of arbitrary nested Lists
  * Created by sofia on 23/02/17.
  */
class Flattener {

  /**
    * Flattens a List of arbitrary nested Lists
    * @param list arbitrary nested Lists
    * @tparam A type of nested Lists
    * @return list of Integer
    */
  def flatten[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case (head: List[A]) :: tail => flatten(head) ::: flatten(tail)
    case head :: tail => head :: flatten(tail)
  }


  /**
    * Flattens a list of arbitrary nested Lists using tail-recursion
    * @param list arbitrary nested Lists
    * @tparam A type of nested Lists
    * @return list of Integer
    */
  def flatten_tail_rec[A](list: List[A]): List[A] = {

    @tailrec
    def flatten_helper[A](head: List[A], tail: List[A], Result: List[A]): List[A] = (head,tail,Result) match {
      case (Nil, Nil, Result) => Result
      case (Nil, rest, Result) => flatten_helper(rest, Nil, Result);
      case ((ls:List[A]) :: tail, rest, Result) => flatten_helper (ls, tail ::: rest, Result)
      case ((head):: tail, rest, Result) => flatten_helper (tail, rest, head :: Result)
    }

    flatten_helper(list, Nil, Nil).reverse
  }
}
