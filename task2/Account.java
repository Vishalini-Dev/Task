//Question3

package guvi.task2;
// create class 
public class Account {
    static double Balance ;
    static long accountNo;
    public Account(){
        this.Balance=0.0 ;
    }
    // Constructor
    public Account(long accountNo, double Balance ){
        this.accountNo=accountNo;
        this.Balance=Balance;
        System.out.println("Account no:"+ accountNo);
        System.out.println("Balance:"+Balance);

    }
    // create deposit method
    public void deposit(double amount){
        if(amount>0){
            System.out.println("Deposited Amount:"+ amount);
            Balance += amount;
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    //create withdraw method
    public void withdraw(double amount){
        if(amount>0&&amount<=Balance){
            System.out.println("Withdraw Amount:"+ amount);
            Balance -= amount;
        }
        else {
            System.out.println("Invalid amount or Insufficient amount");
        }

    }
    // create display method
    public void display(){
        System.out.println("Current Balance:"+Balance);
    }

    public static void main(String[] args) {
        Account acc=new Account(2254556551100L,1000);
        acc.deposit(50000);
        acc.withdraw(20000);
        acc.display();
    }
}
