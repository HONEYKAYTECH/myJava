public class MovieTicket{
    public static void main(String[] args){
        int age = 0;

        if (age <  0){
         System.out.println("Invalid Age");
       }
       else if(age > 0 && age <= 12){
         System.out.println("Child Ticket: $5");
       }
       else if(age >= 13 && age <= 64){
        System.out.println("Standard Ticket: $12");
       }
       else if (age >= 65){
        System.out.println("Senior Ticket: $8");
       }
       else 
       System.out.println("Invalid");
     }  
}
