/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quedatastructure;

/**
 *
 * @author Aspire S7
 */
public class Quedatastructure {

  public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(76);
        queue.enqueue(56);
        queue.enqueue(45);
        queue.enqueue(34);
        queue.enqueue(23);

        System.out.println("Size of the queue: " + queue.getSize());
        System.out.println("Front element: " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println("Dequeued element: " + queue.dequeue());
        }
    }
}