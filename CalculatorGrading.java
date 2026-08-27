public class CalculatorGrading{
    public static void main(String[] args){


        int score = 85;
        if(score >= 80){
            System.out.println("A");
        }
        else if(score >= 70){
            System.out.println("B");
        }
        else if(score >= 60){
            System.out.println("C");
        }
        else if(score >= 50){
            System.out.println("D");
        }
        else{
             System.out.println("F");
        }
           



            //Switching
            // int score = 85;
            switch(score / 10){
             case 8->System.out.println("Grade A");
             case 7->System.out.println("Grade B");
             case 6->System.out.println("Grade C");
             case 5->System.out.println("Grade D");
             default->System.out.println("Grade F");
            }
    }
}