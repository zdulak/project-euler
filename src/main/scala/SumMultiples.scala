object SumMultiples {


  def sumMultiples(x: Int, y: Int, bound: Int): Int = {
    def upperBound(n: Int) = if (bound % n != 0) bound / n else bound / n - 1

    (1 to upperBound(x)).sum * x + (1 to upperBound(y)).sum * y - (1 to upperBound(x * y)).sum * x * y
  }
}
