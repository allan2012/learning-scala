package enums

object Enums extends App {

  enum permissions {
    case READ, WRITE, EXECUTE, NONE
    
    def hello: Unit = println("Hello...")
  }

  val readPermission = permissions.READ
  println(readPermission)

  val allPermissions = permissions.values
  println(permissions.valueOf("READ"))
}
