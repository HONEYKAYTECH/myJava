public class TrafficLight{
    public static void main(String[] arghs){

        char Signal = 'r';
        switch(Signal){
            case 'r','R' ->System.out.println("Print Stop");
            case 'y','Y' ->System.out.println("Print Caution");
            case 'g','G' ->System.out.println("Print Go");
            default ->System.out.println("Invalid Signal");
        }
    }
}