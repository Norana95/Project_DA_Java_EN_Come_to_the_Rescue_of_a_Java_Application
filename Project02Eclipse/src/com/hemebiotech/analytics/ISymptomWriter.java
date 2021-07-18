package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.TreeMap;

/**
 * @author Norhene
 * @date 15/07/2021
 * 
 		* write the list of symptoms to a file
 		*/

public interface ISymptomWriter {

	public void WriterToFile(TreeMap<String, Integer> symptomeMap) throws IOException;
}