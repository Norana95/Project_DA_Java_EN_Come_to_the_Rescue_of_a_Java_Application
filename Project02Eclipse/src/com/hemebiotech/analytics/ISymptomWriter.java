package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;



public interface ISymptomWriter {
	
/**
 * @param TreeMap
 		* write the list of symptoms to a file
 		*/
	
	public void writerToFile(TreeMap<String, Integer> symptomeMap) throws IOException;
}