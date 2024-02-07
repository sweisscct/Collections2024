/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author celeb
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numArray = {2, 4, 6, 8};
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(2);
        numList.add(4);
        numList.add(6);
        numList.add(8);
        
        HashSet<Integer> numSet = new HashSet<>();
        numSet.add(10);
        numSet.add(2);
        numSet.add(8);
        numSet.add(4);
        numSet.add(8);
        numSet.add(6);
        numSet.add(8);
        
        System.out.println("numArray");
        for (int num : numArray) {
            System.out.println(num);
        }
        System.out.println("numList");
        for (int num : numList) {
            System.out.println(num);
        }
        System.out.println("numSet");        
        for (int num : numSet) {
            System.out.println(num);
        }
        
        // HashMap<KeyType, ValueType>
        // Kind of like JSON - JavaScript Objects
        HashMap<Integer, String> numMap = new HashMap<>();
        numMap.put(3, "Three");
        numMap.put(2, "Two");
        
        System.out.println("********************************");
        HashSet<Integer> intSet = new HashSet<>();
        
        for (int num = 1; num <= 100; num++) {
            intSet.add(num);
        }
        
        int num = 1;
        while (num * num <= 100) {
            System.out.println(num * num);
            intSet.remove(num * num);
            num++;
        }


//      Exception in thread "main" java.util.ConcurrentModificationException
//        for (int num : intSet) {
//            if (Math.sqrt(num) == Math.floor(Math.sqrt(num))) {
//                System.out.println(num);
//                intSet.remove(num);
//            }
//        }
        
//        for (int num = 1; num <= intSet.size(); num++) {
//            if (Math.sqrt(num) == Math.floor(Math.sqrt(num))) {
//                System.out.println(num);
//                intSet.remove(num);
//            }            
//        }
        
        
        System.out.println(intSet.contains(100));
        System.out.println(intSet.size());
        
    }
    
}
