object Q3 extends App{

  class Account(id: String, n: Int, b: Double){
    val NIC:String = id
    val acnumber:Int = n
    var Balance:Double = b

    def withdraw(a:Double): Unit = this.Balance = this.Balance - a

    def deposit(a:Double): Unit = this.Balance = this.Balance + a

    def transfer(a:Account, b:Double):Unit = {
      this.withdraw(b)
      a.deposit(b)
    }
    override def toString: String = "NIC - " + this.NIC + "   Acc. NO - " + this.acnumber + "   Balance - " + this.Balance
  }

  val account1 = new Account("984550348v", 13367899, 60000)
  val account2 = new Account("972749180v", 13324889, 25000)

  println("Account before transfer money: ")
  println(account1)
  println(account2)

  account1.transfer(account2, 15000)
  println("\nAccount after transfer money: ")
  println(account1)
  print(account2)
}
