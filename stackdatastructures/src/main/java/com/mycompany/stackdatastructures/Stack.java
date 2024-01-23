/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stackdatastructures;

/**
 *
 * @author Aspire S7
 */
public class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    // Constructor to initialize the stack with a given size
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Stack is initially empty
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println(value + " pushed to the stack");
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top >= 0) {
            int poppedValue = stackArray[top--];
            System.out.println(poppedValue + " popped from the stack");
            return poppedValue;
        } else {
            System.out.println("Stack is empty. Cannot pop");
            return -1; // Return a sentinel value to indicate an empty stack
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Method to peek at the top element without removing it
    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty. Cannot peek");
            return -1; // Return a sentinel value to indicate an empty stack
        }
    }

    // Method to display the elements of the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example usage of the Stack class
        Stack stack = new Stack(5);

        stack.push(12);
        stack.push(24);
        stack.push(54);
        stack.push(20);
        stack.push(65);

        stack.display();

        System.out.println("Top element: " + stack.peek());

        stack.pop();
        stack.display();
    }
}