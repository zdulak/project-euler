object EvenFibonacciNumbers {
  def sumEvenFib(bound: BigInt): BigInt = evenFibSequence(bound).toList.sum

  def evenFibSequence(bound: BigInt): Iterator[BigInt] = {
//    Formula for even Fibonacci number: fn = 4fn-1 + fn-2; f0 = 0, f1 = 2
    Iterator.unfold((0, 2)) {
      case (f0, f1) if (f0 <= bound) => Some((f0, (f1, 4 * f1 + f0)))
      case _ => None
    }
  }

}
