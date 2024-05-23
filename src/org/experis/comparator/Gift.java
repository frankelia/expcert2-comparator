package org.experis.comparator;

public class Gift implements Comparable<Gift> {
	private String title;

	private double prezzo;
	
	public Gift(String title, double prezzo) {
		this.title = title;
		this.prezzo = prezzo;
	}
	
	public String getTitle() {
		return title;
	}
	
	public double getPrezzo() {
		return prezzo;
	}

	@Override
	public int compareTo(Gift o) {
		if (this.prezzo < o.prezzo) {
			return 1;
		} else if (this.prezzo > o.prezzo) {
			return -1;
		} else return 0;
	}

	@Override
	public String toString() {
		return "Gift [title=" + title + ", prezzo=" + prezzo + "]";
	}

}
