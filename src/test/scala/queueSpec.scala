package ed_mutaveis
import org.scalatest._

class queueSpec extends FlatSpec with Matchers {                            //TO DO: test specific structure aspects, such as FIFO
  behavior of "A Queue"

  it should "have size = 0 / empty, before queueing any element" in {
    val qe = new Queue[Int]
    qe.size should be (0)
    qe.isEmpty should be (true)
  }

  it should "correspond the correct size value for insert and pop functions" in {
    val qe = new Queue[Int]
    qe.insert(1)
    qe.insert(2)
    qe.insert(3)
    qe.remove
    qe.remove
    qe.size should be (1)
  }

  it should "find elements" in {
    val qe = new Queue[Int]
    qe.insert(1)
    qe.insert(2)
    qe.insert(3)

    qe.find(2) should be (Some(1))
  }

  it should "count elements" in {
    val qe = new Queue[Int]
    qe.insert(1)
    qe.insert(2)
    qe.insert(2)
    qe.insert(3)
    qe.insert(2)

    qe.count(2) should be (3)
    qe.count(3) should be (1)
  }

  it should "clear it self" in {
    val qe = new Queue[Int]
    qe.insert(1)
    qe.insert(2)
    qe.insert(3)

    qe.clear
    qe.size should be (0)
    qe.isEmpty should be (true)
  }

}
