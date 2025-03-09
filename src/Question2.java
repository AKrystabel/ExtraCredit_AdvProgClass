/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author anastasia
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Question2 {

    public static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashMap<Integer, String> hashmap1 = new HashMap<>();
        int i = 1;
        System.out.print("Enter a string in the HashMap / quit to exit: ");
        String user_input = scanner.nextLine();
        
        do{
            hashmap1.put(i, user_input);
            i +=1;
            System.out.print("Enter another string in the HashMap / quit to exit: ");
            user_input = scanner.nextLine();
        }while(!user_input.equalsIgnoreCase("quit"));
        
        for (Map.Entry<Integer,String> entry : hashmap1.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Entry: " + key + ", Value: " + value);
        }
        
    }
    
}
