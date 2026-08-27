public class StringAndArray{
    public static void main(String[] args){
        //string
        String str = "Mariam";
        System.out.println("string: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 0: " + str.charAt(0));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase:" + str.toLowerCase());

        //Array
        String[] names = {"Mariam", "Oyin", "Meenah","Maleeq"};
        System.out.println(names[0]);
        int[] score = {20, 40,15, 10};
        System.out.println(score[2]);



        Assignment 1 — Print Even Numbers Task: Write a program that prints all even numbers from 1 to 20. Requirements: • Use a for loop. • Use an if statement to check whether a number is even. • Use continue to skip odd numbers. Expected output: 2 4 6 8 10 12 14 16 18 20
    }
}