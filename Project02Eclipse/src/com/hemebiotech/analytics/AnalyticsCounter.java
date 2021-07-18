package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {
	static final String fileInput = "symptoms.txt";


	public List<String> readerSymptoms() {
		ReadSymptomDataFromFile readerFile = new ReadSymptomDataFromFile(fileInput);
		List<String> listSymptoms = readerFile.GetSymptoms();
		return listSymptoms;
	}

	public TreeMap<String, Integer> countingSymptoms(List<String> symptomsList) {
		CountingSymptoms counting = new CountingSymptoms();
		TreeMap<String, Integer> sympMap = (TreeMap<String, Integer>) counting.counting(symptomsList);
		return sympMap;
	}

	public void WriterSymptoms(TreeMap<String, Integer> sympMap) {
		WriteSymptomDataToFile writer = new WriteSymptomDataToFile();
		try {
			writer.WriterToFile(sympMap);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
