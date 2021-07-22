package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import java.util.TreeMap;

public class WriteSymptomDataToFile implements ISymptomWriter {

	static final String fileOuput = "result.out";
	private PrintWriter out;

	/**
	 * @author Norhene
	 * @date 15/07/2021
	 * @param TreeMap
	 * 
	 *       write the symptoms with their occurrences from the set "keysOfMap" to
	 *       the file "result.out".
	 */

	public void writerToFile(TreeMap<String, Integer> symptomeMap) throws IOException {

		Set<String> keysOfMap = symptomeMap.keySet();

		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter(fileOuput)));

			for (String key : keysOfMap) {

				out.println(key + ":" + symptomeMap.get(key));}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		 finally {
			out.close();
		}

	}
}
