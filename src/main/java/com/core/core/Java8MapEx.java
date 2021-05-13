package com.core.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8MapEx {
	
	public static void main(String args[]) {
		
		Map<String, String> colors = new HashMap<>();
	    colors.put("#000000", "BLACK");
	    colors.put("#FF0000", "RED");
	    colors.put("#800000", "MAROON");
	    colors.put("#FFFF00", "YELLOW");
	    colors.put("#C0C0C0", "SILVER");
	    colors.put("#808000", "OLIVE");
	    colors.put("#808000", "OLIVE");
	    
	 // Normal method to get keys
	    Set<String> colorHexCodes = getColorCodes(colors);
	    System.out.println("Color Hex Codes: "+colorHexCodes);
	    
	 // Using Stream map() method to get color names
	    Set<String> colorNames = getColorNames(colors);
	    System.out.println("Color Names: "+colorNames);
	    
	    List<String> colorsList = new ArrayList<>();
	    colorsList.add("Red");
	    colorsList.add("Pink");
	    colorsList.add("Orange");
	    colorsList.add("Yellow");
	    colorsList.add("Violet");
	    colorsList.add("Indigo");
	    colorsList.add("Green");

	    System.out.println(getColorNameUpperCase(colorsList));
		
	}
	
	public static Set<String> getColorCodes(Map<String, String> colrMap) {
		return colrMap.keySet();
	}
	
	public static Set<String> getColorNames(Map<String, String> colorMap) {
		return colorMap.entrySet().stream().map(m->m.getValue()).collect(Collectors.toSet());
	}
	
	public static String getColorNameUpperCase(List<String> colorList) {
		return colorList.stream().map(c->c.toUpperCase()).collect(Collectors.joining(","));
	}

}
