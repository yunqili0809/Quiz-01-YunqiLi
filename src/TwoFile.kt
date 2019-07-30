public fun toDouble(rn:RationalNumber):Double {
    val x: Double = rn.numerator.toDouble() / rn.denominator.toDouble()
    return x
}
public fun add(rn1:RationalNumber,rn2:RationalNumber):RationalNumber{
    val numerator:Int = rn1.numerator*rn2.denominator+rn1.denominator*rn2.numerator
    val denominator:Int =rn1.denominator*rn2.numerator
    val a=RationalNumber (numerator,denominator)
    return a
}

