
fun main(){
    modulus(27,4)
    add(23,45,21,34)
    greetings()
    intresting()
}

fun modulus(a: Int, b: Int): Int{
    var modulus = a%b
    println(modulus)
    return modulus

}
fun add(s: Int, p: Int, e: Int,r: Int){
    var sum = s+p+e+r
    println(sum)

}
fun greetings(){
    var name = "speria"
    println("hello "+name)

}
fun intresting(){
    var intresting = "i like loughing"
    println(intresting)
}