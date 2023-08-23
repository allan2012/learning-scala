package abstractClassesAndTraits

object AbstractClassesAndTraits extends App {

  abstract class Employee {
    val department: String

    def getEmployeeNumber: String

    def printEmployeeCharter: Unit = println("We serve the customers always")
  }

  trait Onboarding {
    val cohort: String

    def printCohort: Unit

    def printAllCohorts: Unit = println("Money Team, Devs, HR")
  }

  trait Interview {
    println("This is the Interview trait...")
  }

  // Assessing multiple traits
  class FinanceStaff extends Employee with Onboarding with Interview {
    override val department = "Accounting & Finance"

    override val cohort = "Money Squad"

    override def getEmployeeNumber: String = "Some random number ..."

    override def printCohort: Unit = println(cohort)
  }

  val staff = new FinanceStaff
  println(staff.getEmployeeNumber)

  staff.printAllCohorts
  staff.printEmployeeCharter
}
