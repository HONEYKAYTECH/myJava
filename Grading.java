class Grading{
    public static void main(String[] args){
        int score = 70;
        String grade;
        if(score >= 70){
        grade = "A";
        }else if (score >= 60){
        grade = "B";
        }else if (score >= 50){
         grade = "C";
        } else{
        grade = "F";
        }
        System.out.println("Grade:" + grade);
        }
    }
