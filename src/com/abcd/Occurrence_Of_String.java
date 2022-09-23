package com.abcd;

import java.util.LinkedHashMap;
import java.util.Map;

public class Occurrence_Of_String {
	public static void main(String[] args) {
		String s = "chennai coimbatore gobi coimbatore erode bangalore gobi";//declare a string
		String[] split = s.split(" ");//split the string
		Map<String,Integer> mp = new LinkedHashMap<String,Integer>();//create a map
		for (String x : split) {                          //enhanced for loop
			if (mp.containsKey(x)) {					//check the map is already contains key(string)
				Integer count = mp.get(x);				// if the map already contains string then
				mp.put(x,count+1);					// put the key value pair in map.(string,count+1)
			} else {									// if the map is not  already contains string then
				mp.put(x,1);							// put the key value pair in map.(string,count)
			}
		}
		System.out.println(mp);	
	}
}






