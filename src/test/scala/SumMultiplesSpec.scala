import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class SumMultiplesSpec extends AnyFlatSpec with should.Matchers {
  behavior of "The sumMultiples method"

  it should "return 233168 for 3, 5, 1000" in {
    SumMultiples.sumMultiples(3, 5, 1000) shouldBe 233168
  }
}
