package org.experis.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GiftLexicographicComparator implements Comparator<Gift> {

	@Override
	public int compare(Gift o1, Gift o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}

}
