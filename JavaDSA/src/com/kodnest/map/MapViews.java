package com.kodnest.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapViews {
	public static void main(String[] args) {
		Map<Integer, String> data = new HashMap<Integer, String>();
		data.put(01 , "Pakija");
		data.put(02 , "Nikhat");
		data.put(03 , "Deepa");
		data.put(04 , "Tarana");
		data.put(05 , "Palvinder");
		
		System.out.println(data);
		
		Set keys = data.keySet();
		Iterator itr = keys.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
		System.out.println();
		Collection values = data.values();
		itr = values.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
		System.out.println();
		
		Set keyValue = data.entrySet();
		itr = keyValue.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}
