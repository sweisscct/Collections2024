/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
        
        Iterator<Integer> setIterator = intSet.iterator();
        
        while (setIterator.hasNext()) {
            int num = setIterator.next();
            if (Math.sqrt(num) == Math.floor(Math.sqrt(num))) {
                System.out.println(num);
                setIterator.remove();
            }               
        }
        
        
//        int num = 1;
//        while (num * num <= 100) {
//            System.out.println(num * num);
//            intSet.remove(num * num);
//            num++;
//        }


//      Exception in thread "main" java.util.ConcurrentModificationException
//        for (int num : intSet) {
            // sqrt(9) == 3
            // floor(3) == 3
            // sqrt(10) == 3.12
//            floor(3.12) == 3
//            if (Math.sqrt(num) == Math.floor(Math.sqrt(num))) {
//                System.out.println(num);
//                intSet.remove(num);
//            }
//        }
        
//        int setSize = intSet.size();
//        for (int num = 1; num <= setSize; num++) {

//        for (int num = 1; num <= intSet.size(); num++) {  
//            if (Math.sqrt(num) == Math.floor(Math.sqrt(num))) {
//                System.out.println(num);
//                intSet.remove(num);
//            }            
//        }
        
        
        System.out.println(intSet.contains(100));
        System.out.println(intSet.size());
        
//        List<Integer> otherIntList = new ArrayList<>();
//        Map<String, String> coolMap = new HashMap<>();

        HashMap<User, String> userMap = new HashMap<>();
        
        userMap.put(new User("Sam"), "Correct horse stable battery");
        userMap.put(new User("Sean"), "Hello");
        userMap.put(new User("Sean"), "Hello2");
        
        User michael = new User("Michael");
        
        userMap.put(michael, "Password123!");
        System.out.println(userMap.get(michael));
        userMap.put(michael, "Other Michael");
        System.out.println(userMap.get(michael));
        System.out.println(userMap.size());
        



    }
    
}
