package lectures.basics

object ValuesVariableTypes extends App {

  // VALS São Imutáveis
  val x: Int = 42
  println(x)

//  Strings
  val str: String = "Olá, Scala"
  println(str)

//  Inferência de Tipo
  val outraString = "Teste"
  println(outraString)

  def showStatus(status: String): Unit =
    println(status)

  showStatus("APROVADO")

  val simpleBool : Boolean = true
  println(simpleBool)

  val aChar : Char =  'J';
  val aShort : Short = Short.MaxValue

  val aLong : Long = Long.MaxValue
  val decimal : Float = 2.0F
  val decimalDouble : Double = 2.0

  var aVar =  decimal + 2

  aVar += 2

  println(aVar)

  println(aLong)
}
