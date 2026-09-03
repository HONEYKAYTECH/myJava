class Arithmetics{
    public static double addittion(int num1, int num2){
        return num1 + num2;
    }
    //SUBTRACTION METHOD
    public static double subtraction(int num1, int num2){
        return num1 - num2;
    }
    //MULTIPLICATION METHOD
    public static double multiplication(int num1, int num2){
        return num1 * num2;
    }
        //DIVISION METHOD
    public static double division(int num1, int num2){
        return num1 / num2;
    }
    //
    public static void main(String[] args){
      int num1 = 50;
      int num2 = 10;
      double addittion = addittion(num1, num2);
      double subtraction = subtraction(num1, num2);
      double multiplication = multiplication(num1, num2);
      double division = division(num1, num2);
      System.out.println("The addition of: "  + num1 +  " and "  + num2 +  " is: "  + addittion);
      System.out.println("The subtraction of: "  + num1 +  " and "  + num2 +  " is: "  + subtraction);
      System.out.println("The multiplication of: "  + num1 +  " and "  + num2 +  " is: "  + multiplication);
      System.out.println("The division of: "  + num1 +  " and "  + num2 +  " is: "  + division);
    }
}