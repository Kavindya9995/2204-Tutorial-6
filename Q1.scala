package Demo6

object Q1 {

  def main(args: Array[String]): Unit = {

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    println("Two options of Caesar Cipher:  ")
    println("1. Encryption")
    println("2. Decryption")

    print("Select an option: ")
    val option = scala.io.StdIn.readInt()

    val shift = scala.io.StdIn.readLine("Shift By: ")
    val inputText = scala.io.StdIn.readLine("Message: ")

    cipher_func(option)

    // cipher_func()


    def cipher_func(option: Int): Unit = {

      if (option == 1) {
        encryption()
      }
      else if (option == 2) {
        decryption()
      }
    }

    def encryption(): Unit = {
      // This allows to take any number (negative, or bigger than our alphabet length)
      val num1 = (shift.toInt + alphabet.length) % alphabet.length

      // Encrypt the code
      // creates a new list by applying to each element of the input list and return output in order
      val outputText = inputText.map((c: Char) => {

        //We find the Char c  in our alphabet
        val x = alphabet.indexOf(c.toUpper)

        //If the Char c is in our alphabet then we encrypt it
        //If it is not then we leave it be
        if (x == -1) {
          c
        }
        else {
          alphabet((x + num1) % alphabet.length)
        }
      })

      println("Encrypted message: " + outputText.toLowerCase())
    }


    def decryption(): Unit = {

      // This allows to take any number (negative, or bigger than the alphabet length)
      val num2 = (shift.toInt - alphabet.length) % alphabet.length

      // Decrypt the code
      // creates a new list by applying to each element of the input list and return output in order
      val outputText = inputText.map((c: Char) => {

        //We find the c char in the alphabet
        val x = alphabet.indexOf(c.toUpper)

        //If the Char c is in our alphabet then we decrypt it
        //If it is not then we leave it be.
        if (x == -1) {
          c
        }
        else {
          alphabet((x - num2) % alphabet.length)
        }
      })

      println("Decrypted message: " + outputText.toLowerCase())
    }
  }
}