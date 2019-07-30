fun main(args : Array<String>){
    val x = RationalNumber(5,7)
    val y = RationalNumber(5,6)
    var a = add(x,y)
    println("${a.toString()}")
    val b = RationalNumber(1,2)
    print("${toDouble(b)}")
}