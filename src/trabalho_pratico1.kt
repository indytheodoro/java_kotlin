fun main(args: Array<String>) {
    val x = 217
    val y = 43
    val z = 67

    println("Cálculo das Expressões")
    println(x + y*z)
    println(x/y.toDouble() + z)
    println(x+0.5 + 2*z/(3.5-x))
    println(x*y / z.toDouble())
    println((x/2.5 + y*3) + 1/2.toDouble() + z)
    println(2*x + (1/2*x))
    println(x-y + 3.7f.toInt())

    println("\nExpressões Lógicas")
    println(x==y)
    println(x==y && y==z)
    println(x==y || x==z)
    println(x==z && x!=y)
    println(x==(y-z) || y%2==0)
    println(x>5 && x!=(2*z-3))
    println(y>0 && y<10 && z!=x)
}