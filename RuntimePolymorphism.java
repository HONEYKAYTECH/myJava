class Animal{
    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog can bark");
    }
}
class RuntimePolymorphism{
    public static void main(String[] args){
        Dog bulldozer = new Dog();
        bulldozer.makeSound();
    }
}
