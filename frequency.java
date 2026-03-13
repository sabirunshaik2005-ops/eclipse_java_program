package cse;

import java.util.HashMap;
import java.util.Map;
	public class frequency {
	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 2, 1, 4, 5, 3, 2, 1};
	        Map<Integer, Integer> frequencyMap = new HashMap<>();
	        for (int number : numbers) {
	            if (frequencyMap.containsKey(number)) {
	                frequencyMap.put(number, frequencyMap.get(number) + 1);
	            } else {
	                frequencyMap.put(number,1);
	            }
	        }
	        System.out.println("Frequency of numbers in the array:");
	        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
	            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " time(s)");
	        }
	  }
}
