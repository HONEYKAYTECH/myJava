public class LoopingAssignment{
    public static void main(String[] args){

        //Assignment 1 — Print Even Numbers Task: Write a program that prints all even numbers from 1 to 20. Requirements: • Use a for loop. • Use an if statement to check whether a number is even. • Use continue to skip odd numbers. Expected output: 2 4 6 8 10 12 14 16 18 20
        //   int i = 0;
          for(int i = 1; i <= 20; i++){
            if (i % 2 != 0){
                continue;
            }
            System.out.println(i);
          }








        // int sum = 0;
        // for (int i = 1; i <= 20; i++){
        //     if (i > 10){
        //         break;
        //     }
        //     if(i % 2 != 0){
        //         continue; // skip odd numbers
        //     }
        //     sum += i; // Add even number to sum
        // }
        // System.out.println(sum);

        // double sumOfNumbers = 0.0;
        // for(int i = 1; i <= 20; i++){
        //     if(i % 2 == 0){
        //         sumOfNumbers = sumOfNumbers + i;
        //     }
        //     if(i == 10) break;
        // }
        // System.out.println(sumOfNumbers);
    }
}