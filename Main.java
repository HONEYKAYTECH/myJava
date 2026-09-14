class Car{
     String brand;
     String color;
     int speed;
     public void start(){
     System.out.println(color +  brand  + "is starting" + "at" + speed);
     }
}
public class Main{
     public static void main(String[] args){
      Car car1 = new Car();
      car1.brand = "Toyota";
      car1.color = "Black";
      car1.speed = 80;

      Car car2 = new Car();
      car2.brand = "Mazda";
      car2.color = "Red";
      car2.speed = 100;

      car1.start();
      car2.start();
     
     }	
}	
