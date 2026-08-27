public class GradeChecker{
    public static void main(String[]args){
      int score = 75;
      if(score >= 70 && score <= 100){
        System.out.println("Grade A");
      } 
      else if(score >= 60){
        System.out.println("Grade B");
      } 
      else if(score >= 50){
        System.out.println("Grade C");
      } 
      else if(score >= 45){
        System.out.println("Grade D");
      }
      else if(score >= 40){
        System.out.println("Grade E");
      }
      else if(score >= 0){
        System.out.println("Grade F");
      }
      else{
        System.out.println("Invalid Score");
      }

    }
}