public class ArrayOfElements{
    public static void main(String[] args){
        // Create a program that takes an array of string values and prints out the elements in reverse order without using built-in reverse functions. Input:  items = ["Red", "Green", "Blue", "Yellow"] Output: Yellow Blue Green Red

        String[] items = {"Red", "Green", "Blue", "Yellow"};
         //loop backward
         for(int i = items.length - 1; i >= 0; i--){
         String currentItem = items[i];

          System.out.println(currentItem);
         }
        
    }
}