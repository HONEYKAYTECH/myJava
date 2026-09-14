class StudentsGreetings{
    public static void main(String[]args){
      Student studentOne  = new Student(); 
      studentOne.singing("i feel good");
      Student studentTwo = new Student();
      studentTwo.greetings("Oyin");
      Student studentThree = new Student();
      double result = studentThree.avgScore(25,60,35);
      System.out.println("Your average score is:" + result); 
    }
}
class Student{
    public int age = 30;
    
    public void greetings(String name){
        System.out.println("Hello:" + name);
    }

    public void singing(String melody){
        System.out.println("Sing along:" + melody);

    }

    public double avgScore(int a, int b, int c){
           return (a + b + c) / 3;
    }
        
}