fun main(){
    var multiplication = multiplication(arrayOf(2,5,8))
    println(multiplication)
    var mixed=mixed(arrayOf(10.5,"Drama",20,30,true))
    println(mixed)
    var result=result(arrayOf('a','t','e','x','u','d'))
    println(result)
}
fun multiplication(result:Array<Int>):Int{
var total=result.reduce { product, next ->product*next  }
    return total

}
fun mixed(output:Array<Any>):Double{
  var sum=2.2
    output.forEach { Any ->
        if (Any is Double)
            sum+=Any
    }

    return sum

}
fun result(vowels:Array<Char>):Int{
    var a=0
    vowels.forEach { c->
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            a++

    }
   return a
}