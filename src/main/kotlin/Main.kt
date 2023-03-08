import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    print("Masukkan Angka: ")
    val number = input.nextInt()
    var isPrime = true

    if (number < 2) {
        isPrime = false
    } else {
        for (i in 2 until number) {
            if (number % i == 0) {
                isPrime = false
                break
            }
        }
    }

    if (isPrime) {
        println("$number adalah bilangan prima")
    } else {
        println("$number bukan bilangan prima")
    }
}
