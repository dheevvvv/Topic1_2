fun main() {
    print("Masukkan Angka: ")
    val number = readLine()?.toInt()

    val primeNumber = BIlanganPrima(number ?: 0)

    if (primeNumber.isPrime()) {
        println("$number adalah bilangan prima")
    } else {
        println("$number bukan bilangan prima")
    }
}
