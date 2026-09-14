class Student{
    //properties
    int age;
    String fullname,bvn,nin,phone,address,height;

     double getStudentAve(int scoreOne, int scoreTwo, int scoreThree){
         double sum = scoreOne + scoreTwo + scoreThree;
         return sum/3;
     }

     String getStudentName(String name){
        return name;
     }

     char getStudentGrade(double ave){
        char grade;
        if(ave > 70){
            grade = 'A';
        }else if(ave >= 60){
            grade = 'B';
        }else if(ave >= 58){
            grade = 'C';
        }else if(ave >= 40){
            grade = 'D';
        }else{
            grade = 'F';
        }
        return grade;
     }
 
}


 class StudentsData{
    public static void main(String[] args){
        Student oyin = new Student();
        double aveScore = oyin.getStudentAve(50,60,70);
        System.out.println("Average Score is :" + aveScore);

        String stdName = oyin.getStudentName("Tiamiyu oyinkansola");
        System.out.println("Fullname is :" + stdName);

        char stdGrade = oyin.getStudentGrade(aveScore);
        System.out.println("The Grade is :" + stdGrade);
    }
    

}