public class CaseSwitching {
    // public static void main(String[] args){
    //     int score = 70;
    //     switch (score) {
    //         case 80:
    //             System.out.println("Grade A");
    //             break;
    //         case 70:
    //             System.out.println("Grade B");
    //             break;
    //         case 60:
    //             System.out.println("Grade C");
    //             break;
    //         case 50:
    //             System.out.println("Grade D");
    //             break;
    //         case 40:
    //             System.out.println("Grade E");
    //             break;
    //         default:
    //             System.out.println("Invalid");
            
    //     }
    // }
    public static void main(String[] args){
        int score = 70;
        switch (score) {
            case 80->System.out.println("Grade A");    
            case 70->System.out.println("Grade B");    
            case 60->System.out.println("Grade C");   
            case 50->System.out.println("Grade D");   
            case 40->System.out.println("Grade E");  
            default->System.out.println("Invalid");
            
        }
    }
}