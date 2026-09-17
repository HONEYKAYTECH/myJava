abstract class Payment{
    abstract void makePayment(double amount);
}
class CardPayment extends Payment{
    // @override
    void makePayment(double amount){
        System.out.println("i paid with card a sum of " + amount);
    }
}
class PaymentMethod{
    public static void main(String[] args){
        CardPayment card = new CardPayment();
        card.makePayment(5000.00);
    }
}