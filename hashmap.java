package cse;

import java.util.HashMap;

public class hashmap {
public static void main(String[] args) {
	HashMap<String,Integer> map=new HashMap<>();
	map.put("sabi",2);
	map.put("aisha",9);
	map.put("noor",3);
	map.put("tahir",10);
	map.put("mohammad",5);
	map.put("usman",8);
	map.put("ezaz",7);
	System.out.println(map.get("sabi"));
	System.out.println(map.get("aisha"));
	System.out.println(map.get("noor"));
	System.out.println(map.get("tahir"));
	System.out.println(map.get("mohammad"));
	System.out.println(map.get("usman"));
	System.out.println(map.get("ezaz"));
}
}
