package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {
		
		AnalyticsCounter anCounter = new AnalyticsCounter();

		List<String> listSymptoms = anCounter.readerSymptoms();
		TreeMap<String, Integer> symMap = anCounter.countingSymptoms(listSymptoms);
		anCounter.writerSymptoms(symMap);

	}
}
