package com.csi.core;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {
	public static void main(String[] args) {

		Map<String, String> hm = new HashMap<>();
		hm.put("ID", "121");
		hm.put("ID", "122");
		for (Map.Entry<String, String> m : hm.entrySet())

		{
			System.out.println(m.getKey()+": "+m.getValue());
		}
	}
}
