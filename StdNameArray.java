public class StdNameArray{
    public static void main(String[] args){

        // Task 1: Student Name Length Finder Write a program that takes an array of student names  (strings). Use a loop to iterate through the array, print the character count for each name, and find the longest name. Input:  names = ["Alice", "Christopher", "Bob", "Grace"] Output: Alice has 5 characters. Christopher has 11 characters. Bob has 3 characters. Grace has 5 characters. Longest name: Christopher (11 characters)

        // String[] names = {"Alice", "Christopher", "Bob", "Grace"};
        // String longestName = ""; 

        // for (int i = 0; i < names.length; i++) {
        //     String currentName = names[i];
        //     int nameLength = currentName.length(); 
            
        //     System.out.println(currentName + " has " + nameLength + " characters.");
            
        //     if (nameLength > longestName.length()) {
        //         longestName = currentName;
        //     }
        // }

        // System.out.println("Longest name: " + longestName + " (" + longestName.length() + " characters)");

int[] numbers = {3, -1, 7, 0, 9};
   for (int n : numbers) {
  if (n < 0) {
    continue; // skip negative numbers
  }
  if (n == 0) {
    break; // stop loop when zero is found
  }
  System.out.println(n);
}
    
    
    }
}