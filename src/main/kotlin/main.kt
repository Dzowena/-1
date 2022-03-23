import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    var X: Int = read.nextInt()
    var Y: Int = read.nextInt()
    var  Fraction1 = Fraction(X,Y)
     X= read.nextInt()
     Y= read.nextInt()
    var Fraction2 = Fraction(X,Y)
  /*  println(point1.toString())
    println(point2.toString())
    println(point1.equals(point2))
    println(point1.distance(point2)) */
    println(Fraction1.multiply(Fraction2).x)
    println(Fraction1.multiply(Fraction2).y)
    println()
    println(Fraction1.divide(Fraction2).x)
    println(Fraction1.divide(Fraction2).y)
    println()
    println(Fraction1.sum(Fraction2).x)
    println(Fraction1.sum(Fraction2).y)
    println()
    println(Fraction1.subtract(Fraction2).x)
    println(Fraction1.subtract(Fraction2).y)
    println()
    println(Fraction1.shorten().x)
    println(Fraction1.y)

}