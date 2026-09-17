interface Payment{
    void makePayment(double amount);
    void cancealPayment();
}
interface Settlement{
    void settleTransaction(double amount);
}
class BankApp implements Payment, Settlement{
    
   public void makePayment(double amount){
        System.out.println("i paid " + amount);
    }
    
   public void cancealPayment(){
        System.out.println("payment canceal");
    }
   
    public void settleTransaction(double amount){
        System.out.println("Amount settled");

    }
}
class MainInterface{
    public static void main(String[] args){
        BankApp access = new BankApp();
        access.makePayment(5000.00);
    }
}