class Vehicle{
    int speed;
    String color;
    void startEngine(){
        System.out.println("Engine is starting");
    }   
}   
class Car extends Vehicle{
    void playMusic(){
        System.out.println("Music is Playing");
    }
}

class Inheritance{
    public static void main(String[] args){
        Car corrolla = new Car();
        corrolla.startEngine();
        corrolla.playMusic();
    }
}