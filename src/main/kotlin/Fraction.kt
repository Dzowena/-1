class Fraction {
    var x = 0
    var y = 0
    constructor(xx: Int, yy: Int) {
        x = xx
        y = yy
    }
    public fun sum(other: Fraction): Fraction{
        var xxx = this.x * other.y + this.y * other.x
        var yyy = this.y * other.y
        var Fraction3 = Fraction(xxx, yyy)
        return Fraction3
    }
    public fun subtract(other: Fraction): Fraction{
        var xxx = this.x * other.y - this.y * other.x
        var yyy = this.y * other.y
        var Fraction3 = Fraction(xxx, yyy)
        return Fraction3
    }
    public fun multiply(other: Fraction): Fraction{
        var xxx = this.x * other.x
        var yyy = this.y * other.y
        var Fraction3 = Fraction(xxx, yyy)
        return Fraction3
    }
    public fun divide(other: Fraction): Fraction{
        var xxx = this.x * other.y
        var yyy = this.y * other.x
        var Fraction3 = Fraction(xxx, yyy)
        return Fraction3
    }
    public fun shorten(): Fraction{
        var gcd = this.gcd(this.x, this.y);
        this.x = this.x/gcd;
        this.y = this.y/gcd;
        return this;
    }

    fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}