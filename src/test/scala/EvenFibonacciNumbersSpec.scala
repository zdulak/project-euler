import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class EvenFibonacciNumbersSpec extends AnyFlatSpec with should.Matchers {
  behavior of "EvenFibonacciNumbers.evenFibSequence"

  it should "return even Fibonacci numbers up to 15e6 for 15e6" in {
    EvenFibonacciNumbers.evenFibSequence(15e6.toLong).toList shouldBe
    List[BigInt](0, 2, 8, 34, 144, 610, 2584, 10946, 46368, 196418, 832040, 3524578, 14930352)
  }

  behavior of "EvenFibonacciNumbers.sumEvenFib"

  it should "return 4613732 for 4e6" in {
    EvenFibonacciNumbers.sumEvenFib(4e6.toLong) shouldBe 4613732
  }


}
