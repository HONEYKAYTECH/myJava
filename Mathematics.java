class Mathematics{
    public static void main(String[] args){
        Arithmetics calculator = new Arithmetics();
        Interest interest = new Interest();
        double result = interest.getSimpleInterest(200, 2.5, 3);
        double addResult = calculator.addNumbers(60, 5);
        double subResult = calculator.subNumbers(60, 5);
        double mulResult = calculator.mulNumbers(60, 5);
        double divResult = calculator.divNumbers(60, 5);

        System.out.println("Simple interest:" + result);
        System.out.println("Add result" + addResult);
        System.out.println("Subtract result" + subResult);
        System.out.println("Multiply result" + mulResult);
        System.out.println("Divide result" + divResult);
    }
}

class Interest{
    public double getSimpleInterest(int p, double r, int t){
        return(p * r * t) / 100;
    }
}

class Arithmetics{
    public double addNumbers(int a, int b){
        return a + b;
    }
     public double subNumbers(int a, int b){
        return a - b;
    }
     public double mulNumbers(int a, int b){
        return a * b;
    }
     public double divNumbers(int a, int b){
        return a / b;
    }
}