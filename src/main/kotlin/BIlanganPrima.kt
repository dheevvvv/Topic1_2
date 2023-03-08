class BIlanganPrima(val number:Int) {
    fun isPrime(): Boolean {
        if (number < 2) {
            return false
        }
        for (i in 2 until number) {
            if (number % i == 0) {
                return false
            }
        }
        return true
    }
}