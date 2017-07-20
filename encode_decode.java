/*
*Author: Saul Garza
*Description: Code that will encode and decode a message using ASCII
*/

import java.io.*;
import java.util.*;
public class encode_decode {
 public static void main(String[] args) {
  Scanner kb = new Scanner(System.in);
  System.out.println("Press 1 to encode. Press 2 to decode. Press 0 to exit:");
  int command = kb.nextInt();
  while (command != 0) {
   Queue s = new Queue();
   if (command == 1) //if user wants to encode
   {
    System.out.println("Enter the number of key values");
    int keyval = kb.nextInt();
    System.out.println("Enter the key values with a space in between");
    for (int i = 0; i < keyval; i++) //read n keyvalues and enqueues them
    {
     s.enqueue(kb.nextInt());
    }
    String temp = kb.nextLine();
    String output = "";
    System.out.println("What message do you want to encode?");
    String encode = kb.nextLine();
    int shift;
    for (int i = 0; i < encode.length(); i++) //shifts characters and replaces them with ASCII value
    {
     shift = s.dequeue();
     int x = (int) encode.charAt(i) + shift;
     if (x < 32) {
      while (x < 32) {
       x = 127 - (32 - x);
      }

     } else if (x > 126) {
      while (x > 126) {
       x = 32 + (x - 127);
      }
     }
     char character = (char) x;
     output = output + character;
     s.enqueue(shift);
    }
    System.out.println(output);
    System.out.println("Press 1 to encode. Press 2 to decode. Press 0 to exit.");
    command = kb.nextInt();
   } else //user wants to decode a message
   {
    Queue d = new Queue();
    System.out.println("Enter the number of key values");
    int keyval = kb.nextInt();
    System.out.println("Enter the key values with a space in between");
    for (int i = 0; i < keyval; i++) //gets keyvalues
     d.enqueue(kb.nextInt());
    System.out.println("What message do you want to decode?");
    String temp = kb.nextLine();
    String decode = kb.nextLine();
    int shift;
    String output = "";
    for (int i = 0; i < decode.length(); i++) //shifts characters and replaces them with ASCII value, and essentially reverting it back to original message
    {
     shift = d.dequeue();
     int x = (int) decode.charAt(i) - shift;
     if (x < 32) {
      while (x < 32) {
       x = 127 - (32 - x);
      }
     } else if (x > 126) {
      while (x > 126) {
       x = 32 + (x - 127);
      }
     }
     char character = (char) x;
     output = output + character;
     d.enqueue(shift);
    }
    System.out.println(output);
    System.out.println("Press 1 to encode. Press 2 to decode. Press 0 to exit.");
    command = kb.nextInt();
   }
  }
  System.out.println("Thank you for trying out my program fam"); //exits
 }
}
