package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;



public interface ISymptomWriter {
	
/**
 * write the list of symptoms to a file
 */
	
	public void WriterToFile(TreeMap<String, Integer> symptomeMap) throws IOException;
}