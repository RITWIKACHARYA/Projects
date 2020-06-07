import java.util.*
val sum1 = { a: Int, b: Int -> a + b }      //lambda expression
fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter two numbers: ")

    // nextDouble() reads the next double from the keyboard
    val first = reader.nextInt()
    val second = reader.nextInt()
    if (second != null) {                   //null safety
        print("Enter an operator (+, -, *, /): ")
        val operator = reader.next()[0]

        val result: Int

        when (operator) {
            '+' -> result = sum1(first,second)
            '-' -> result = CalcJava.Sub(first, second) //Kotlin-Java Interoperability, Java Program called by Kotlin
            '*' -> result = first * second
            '/' -> result = first / second
            // operator doesn't match any case constant (+, -, *, /)
            else -> {
                System.out.println("Error! operator is not correct")
                return
            }
        }

        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result) //Kotlin-Java Interoperability
    }
}