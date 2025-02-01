```scala
import scala.collection.mutable.ListBuffer

object Main extends App {
  val buffer = new ListBuffer[Int]()
  buffer += 1
  buffer += 2
  buffer += 3

  // Correct approach: Convert when needed
  val immutableList1 = buffer.toList 

  buffer += 4
  val immutableList2 = buffer.toList // Get a fresh copy when you need the updated values

  println(immutableList1) // Output: List(1, 2, 3)
  println(immutableList2) // Output: List(1, 2, 3, 4)
}
```