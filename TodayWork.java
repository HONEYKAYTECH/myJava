public class TodayWork{
   public static void main(String[] args){

    //declearing double

    // double expectedPrice = 20.0;
    // double costPrice = 20.0;

    // if(costPrice > expectedPrice) {
    //     System.out.println(costPrice + "cost price is too high");
    //     System.out.println(costPrice + "i can buy it");

    // }else if(costPrice < expectedPrice) {
    //     System.out.println(costPrice + "cost price is too cheap");
    //     System.out.println("i will buy many");
    // }
    // else{
    //     System.out.println(costPrice + "cost price is moderate");
    //     System.out.println("i will buy few");
    // }
           //17/08/26 on monday

     int price = 20;
     switch (price){
       case 30->System.out.println("cost price is too high");
       case 20->System.out.println("cost price is moderate");
       case 15->System.out.println("cost price is too cheap");
       default ->System.out.println("Invalid price");
     }
   }


}
