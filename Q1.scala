package Demo7
object Q1 {
  def main(args: Array[String]) {
    val obj1 = new Rational(1, 3)
    val obj2 = new Rational(5, 7)
    println(obj1.neg)
    val q: Rational = obj1.add(obj2)
    println(q)

  }
class Rational(n:Int, d:Int) {
  require(denom > 0, "Denominator must be greater than 0")
  def numer: Int = n
  def denom: Int = d

  def add(r:Rational) = new Rational(this.numer*r.denom + this.denom*r.numer, this.denom*r.denom)
  def neg = new Rational(-this.numer, this.denom)
  override def toString: String = numer + "/" + denom
}
  }