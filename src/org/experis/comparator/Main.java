package org.experis.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Gift> gifts = new ArrayList<>();
		
		gifts.add(new Gift("Playstation", 499.0));
		gifts.add(new Gift("Computer", 455.0));
		gifts.add(new Gift("Smartphone", 999.0));
		
		Collections.sort(gifts);
		
		for (Gift g : gifts) {
			System.out.println(g);
		}
		
		System.out.println("---------------------------------------------");
		
		Collections.sort(gifts, new GiftLexicographicComparator());
		
		for (Gift g : gifts) {
			System.out.println(g);
		}
		
		
	}
}
