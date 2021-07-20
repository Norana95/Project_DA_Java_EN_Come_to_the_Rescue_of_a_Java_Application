package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import java.util.TreeMap;

public class WriteSymptomDataToFile implements ISymptomWriter {

	static final String fileOuput = "result.out";

	public WriteSymptomDataToFile() {
	}

	/**
	 * @author Norhene
	 * @date 15/07/2021
	 * 
	 *       write the symptoms with their occurrences from the set "keysOfMap" to
	 *       the file "result.out".
	 */

	public void WriterToFile(TreeMap<String, Integer> symptomeMap) throws IOException {

		Set<String> keysOfMap = symptomeMap.keySet();

		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileOuput)));

		try {
			for (String key : keysOfMap) {

				out.println(key + ":" + symptomeMap.get(key));

			}
		} finally {
			out.close();
		}

	}
}
