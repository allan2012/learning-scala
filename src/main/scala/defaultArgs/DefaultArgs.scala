package defaultArgs

object DefaultArgs extends  App {

  def capturePic(format: String, width: Int, height: Int): Unit = println("saving pic 1 ...")

  capturePic("PNG", 1600, 900)

  // Using default parameter
  def capturePic2(format: String, width: Int = 800, height: Int = 500): Unit = println("saving pic 2 ...")
  capturePic2("JPG")

  // Using parameter naming does not affect the ordering
  def capturePic3(format: String = "JPG", width: Int = 800, height: Int = 500): Unit = println("saving pic 3 ...")
  capturePic3(width=1333)
}
