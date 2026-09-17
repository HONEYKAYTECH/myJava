class CoffeeMakingMachine{
    public static void main(String[] args){
        CoffeeMachine coffee = new CoffeeMachine();
        coffee.makeCoffee();
        coffee.makeCoffee("sugar");
        coffee.makeCoffee("sugar" , "milk");
    }
}
class CoffeeMachine{
    void makeCoffee(){
        System.out.println("make plain coffee");
    }
    void makeCoffee(String addOn){
        System.out.println("make coffe with" + addOn);
    }
    void makeCoffee(String addOn1, String addOn2){
        System.out.println("make coffee with" + addOn1 + "and" + addOn2);
    }
}