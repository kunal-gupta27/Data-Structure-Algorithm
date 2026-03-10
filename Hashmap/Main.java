package Hashmap;

import java.util.*;

public class Main {
    static void HashMapMethods(){
        //Syntax
        Map<String, Integer> mp = new HashMap<>();
        //Adding Element
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Rishika", 19);
        mp.put("Harry", 18);

        //Getting value of a key from the Hashmap
        System.out.println(mp.get("Yash")); // 16
        System.out.println(mp.get("Rahul")); // null

        //Changing/updating value of a key int the HashMap
        mp.put("Akash", 25);
        System.out.println(mp.get("Akash"));

        //Removing a pair from the hashmap
        System.out.println(mp.remove("Akash"));  //25
        System.out.println(mp.remove("riya"));  

        //checking if a key is in the HashMap

        System.out.println(mp.containsKey("Yash"));
        System.out.println(mp.containsKey("Akash"));

        //Adding a new entry only if the new key doesnot exits already
        if(!mp.containsKey("Yash")) mp.put("Yash", 30);

        mp.putIfAbsent("Yash", 30); //will not enter
        mp.putIfAbsent("Yashika", 30); //will enter

        //get all keys in the HashMap
        System.out.println(mp.keySet());

        //get all values in the HashMap
        System.out.println(mp.values());

        //get all entries in the HashMap
        System.out.println(mp.entrySet());
         
       //traversing all entries of hashmap- multiple method
       
       for(String key : mp.keySet()){
        System.out.printf("Age of %s is %d\n", key, mp.get(key));
       }
       System.out.println();

       //or

       for(Map.Entry<String, Integer> e : mp.entrySet()){
        System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
       }

       //or
       System.out.println();

       for(var e : mp.entrySet()){
         System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
       }
    }

    

    public static void main(String[] args) {
        HashMapMethods();
    }
}
