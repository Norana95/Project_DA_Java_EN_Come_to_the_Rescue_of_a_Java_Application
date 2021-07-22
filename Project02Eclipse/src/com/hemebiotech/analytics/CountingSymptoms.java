package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @param List
 * @return TreeMap
 */
public class CountingSymptoms implements ISymptomCounting {

	/**
	 * @param List of symptoms
	 * @return treeMap browse a list of symptoms line by line,counter number of
	 *         occurrence and add it in a map<string,Integer>
	 */
	public Map<String, Integer> counting(List<String> list) {

		Map<String, Integer> map = new TreeMap<String, Integer>();

		for (String i : list) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		return map;
	}

}
