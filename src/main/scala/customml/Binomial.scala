package customml

import scala.util.Random

class Binomial(n: Int, p: Double, rand: Random = Random) extends Distribution {
  def next(): Double = ???
  def mean(): Double = ???
  def variance(): Double = ???
  def p(x: Double): Double = ???
}

object Binomial {
  def apply(n: Int, data: Seq[Double], rand: Random = Random): Binomial = ???
}