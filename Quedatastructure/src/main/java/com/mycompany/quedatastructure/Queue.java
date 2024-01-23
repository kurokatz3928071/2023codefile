/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quedatastructure;

/**
 *
 * @author Aspire S7
 */
public class Queue {
     private int[] elements;
    private int front;
    private int rear;
    private int size;

    public Queue(int capacity) {
        elements = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == elements.length;
    }

    public void enqueue(int element) {
        if (!isFull()) {
            rear = (rear + 1) % elements.length;
            elements[rear] = element;
            size++;
        } else {
            System.out.println("Queue is full. Cannot enqueue.");
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int removedElement = elements[front];
            front = (front + 1) % elements.length;
            size--;
            return removedElement;
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // You can choose to handle this differently based on your application's requirements.
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return elements[front];
        } else {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // You can choose to handle this differently based on your application's requirements.
        }
    }

    public int getSize() {
        return size;
    }
}

