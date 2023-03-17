fun main() {
    Odd()
    drinks(6)
    drinks(15)
    drinks(17)
    number(9)

}
//Create a function that prints out all the odd numbers between 1 and 100

fun Odd(){
    for (b in 1..100 )
        if (b %2 !=0)
        println(b)
}
//create a function that takes in an array of names and returns the number of
// the names longer than 5 characters
fun kil(z:Array<String>):Int{
    var r=0
    for (l in z){
        if (l.length>5){
            println(l)
        }
    }
}

//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca -cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age.
fun drinks(age:Int){
    when(age){
        in 0..6-> println("milk")
        in 7..15-> println("fanta")
        else-> println("coca-cola")

    }

}
//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.
fun number(numbers:Int){
    for(n in 1..100){
        if(n%15 ==0){
            println("FizzBuzz")

        }else if(n %5==0){
            println("Buzz")
        }else if(n %3==0){
            println("Fizz")
        }
        else{
            println(n)
        }
    }
}







