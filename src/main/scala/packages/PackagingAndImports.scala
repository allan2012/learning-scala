package packages

import geography.{Cities, Countries => Nations} // Simple importation and importation using alias

import vehicles._

object PackagingAndImports extends App {

  val staff = new Employee("Sammy Henchmen")
  staff.printEmployeeName

  val eastAfrica = new Nations
  eastAfrica.printEastAfricanCountries

  val kenyanCities = new Cities
  println(kenyanCities.getCitiesInKenya)

  // Using package objects
  println(PI)
  greetings

  // Using imported objects from vehicle imports
  val toyota = new Toyota
  val mitsubishi = new Mitsubishi

}
