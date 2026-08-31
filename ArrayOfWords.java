public class ArrayOfWords{
    public static void main(String[] args){
     // Given an array of words, loop through each word and count how many vowels(a,e,i,o,u)it ( contains. Print the vowel count for each word. Input:  words = ["apple", "sky", "banana", "code"] Output: apple -> 2 vowels sky -> 0 vowels banana -> 3 vowels code -> 2 vowels
     
     String[] words = {"apple", "sky", "banana", "code"};
     String vowels = "aeiou";
      int vowelCount = 0;
     for(int i = 0; i < words.length; i++){
        String currentWord = words[i];
             
     // Loop through each character of the word
    //Atchart retrieves a character from a string at a specific index.
     for (int j = 0; j < currentWord.length(); j++) {
        char currentLetter = currentWord.charAt(j);
                
    // Check if the character is a vowel
    if (vowels.indexOf(currentLetter) != -1) {
          vowelCount++;
        }
    }
    System.out.println(currentWord + " -> " + vowelCount + " vowels");
     }
    }
}