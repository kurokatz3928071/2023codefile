/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.array;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Aspire S7
 */
public class Array {

    public static void main(String[] args) {

        int arraySize = 10;

        char[] myArray = new char[arraySize]; // Change the array type to char
        Random random = new Random();

        for (int i = 0; i < arraySize; i++) {
            // Generate random letters (ASCII values for lowercase letters: 97 to 122)
            myArray[i] = (char) (random.nextInt(26) + 'a');
        }

        System.out.print("Array: ");
        for (char letter : myArray) {
            System.out.print(letter + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        char searchElement = scanner.next().charAt(0); // Change the data type to char

        // Perform linear search
        int result = linearSearch(myArray, searchElement);

        // Print the result
        if (result != -1) {
            System.out.println("Element " + searchElement + " found at index " + result + ".");
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }

        scanner.close();
    }

    public static int linearSearch(char[] arr, char target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}