import java.util.Scanner;
public class GuessNumber{
    public static void main(String[] args){
      int secretNo = 5;
      int inputtedNo = 0;
      int attempts = 0;
       do{
            Scanner inputNo = new Scanner(System.in);
            System.out.println("Enter guess number");
           
            attempts++;
            
            if(inputNo.hasNextInt()){ // it checks if the accepted input is integer and returns boolean true/false
                inputtedNo = inputNo.nextInt(); 
                // System.out.println("The inputted no: "+ inputtedNo);
                if(inputtedNo > secretNo){
                    System.out.println("The Number is too high");
                    System.out.println("Guess Number: "+ inputtedNo);                
                }
                
                if(inputtedNo < secretNo){
                    System.out.println("The Number is too Low");
                    System.out.println("Guess Number: "+ inputtedNo);              
                }
                
                if(inputtedNo == secretNo){
                    System.out.println("Correct!");
                    System.out.println("You got in " + attempts + " attempts");
                    System.out.println("Guess Number: "+ inputtedNo);   
                    break;
                }
            }
        }while(inputtedNo != secretNo);
    }
      
}

