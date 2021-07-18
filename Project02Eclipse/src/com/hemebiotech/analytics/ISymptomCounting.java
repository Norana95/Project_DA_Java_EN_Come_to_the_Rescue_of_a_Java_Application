package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * @author Norhene
 * @date 19/07/2021
 * 
 		* count the number of occurrences of symptoms and put them in a TreeMap with their symptom key
 		*/

public interface ISymptomCounting {
	
	public Map<String, Integer> counting(List<String> list);
	
}
