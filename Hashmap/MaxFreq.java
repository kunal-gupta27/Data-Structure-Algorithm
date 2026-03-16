// package Hashmap;

import java.util.HashMap;

public class MaxFreq {
    public static void main(String[] args) {
      int[] arr = {1,4, 2, 4 , 3, 4, 5, 4,4, 4, 5};

      HashMap<Integer, Integer> freq = new HashMap<>();

      for(int el : arr){
        if(!freq.containsKey(el)){
            freq.put(el, 1);
        }else{
            freq.put(el, freq.get(el) + 1);
        }
      }
      System.out.println("Frequency Map");
      System.out.println(freq.entrySet());
      int maxfreq=0, ansKey=-1;

      for(var e: freq.entrySet()){
        if(e.getValue()>maxfreq){
            maxfreq=e.getValue();
            ansKey=e.getKey();
        }
      }
      System.out.printf("%d has max freq. it occurs %d times", ansKey, maxfreq);
      
    }
}
