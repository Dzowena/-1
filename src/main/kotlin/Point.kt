class Point {
    var x = 0
    var y = 0
    constructor(xx: Int, yy: Int){
        x= xx
        y = yy
    }
    public override fun toString(): String {
        return "$x and $y"
    }
    public override fun equals(other: Any?): Boolean{
        if(other is Point)
        return this.x == other.x && this.y == other.y
        else return false
    }
    public fun distance(other: Point): Double{
        return Math.pow(Math.pow((this.x - other.x).toDouble(),2.0) + Math.pow((this.y - other.y).toDouble(), 2.0),0.5)
    }
    public fun reverse(){
        this.x = -this.x
        this.y = -this.y
    }
}