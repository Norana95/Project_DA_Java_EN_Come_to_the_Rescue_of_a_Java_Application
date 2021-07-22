package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * @author Norhene
 * @date 19/07/2021
 */
 		

public interface ISymptomCounting {
	
/** 
 * @param List 
 * @return TreeMap
 * 
	* count the number of occurrences of symptoms and put them in a TreeMap with their symptom key
 	*/
	
	public Map<String, Integer> counting(List<String> list);
	
}
