fun main() {
(numbers(20,3))
    rectangleArea(12,5)
    user("Brenda",10,"pink")
    totalAverage(30,46,60)

    // Invoking totalAverage
    totalAverage(10, 20, 30)
}
//Write a program that asks the useer to enter two numbers and stores them in variables.
///the program should then  calculate and print the sum,diiference,
// product and quotient of two numbers
fun numbers(num1:Int,num2:Int){
    var sum =num1+num2
    println(sum)
    var difference=num1-num2
    println(difference)
    var product=num1*num2
    println(product)
    var quotient=num1/num2
    println(quotient)
}
//Write a program that calculates the area of a rectangle.
// The user should be prompted to enter the length and width of the rectangle.
fun rectangleArea(length:Int,width:Int){
    var area = length*width
    println(area)
}
//Write a program that prompts the user to enter their name, age, and favorite color, and
// then prints out a message including all of that information.
fun user(name:String,age:Int,color:String){
    println("$name,$age, $color")
}

// Write a program that calculates the average of three numbers.
// The user should be prompted to enter the three numbers.

fun totalAverage(numbers1:Int,number2:Int,number3:Int){
    var average = (numbers1 + number2 + number3) / 3
    println(average)
}