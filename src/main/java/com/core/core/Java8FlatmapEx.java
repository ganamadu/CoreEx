package com.core.core;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8FlatmapEx {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Ganapathi", Arrays.asList("Telugu","English"));
		Person p2 = new Person("Srilatha", Arrays.asList("Telugu","English","Hindi"));
		Person p3 = new Person("Thaneesh", Arrays.asList("Telugu","Hindi"));
		Person p4 = new Person("Rishith", Arrays.asList("Hindi","English"));
		
		List<Person> personList = Arrays.asList(p1,p2,p3,p4);
		
		System.out.println(getPersonNamesList(personList));
		
		System.out.println(getPersonLanguates(personList));
		
		//Find the duplicates
		Map<Integer, Long> findDuplicates = Arrays.asList(9,1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8,9).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("DuplicatesL "+findDuplicates);
		
	}
	
	public static String getPersonNamesList(List<Person> personList) {
		return personList.stream().map(p->p.getName()).collect(Collectors.joining(","));
	}
	
	public static String getPersonLanguates(List<Person> personsList) {
		
		return personsList.stream().map(p->p.getLanguages()).flatMap(l->l.stream()).distinct().collect(Collectors.joining(","));
		
	}

}

class Person {
	
	private String name;
	private List<String> languages;
	
	public Person(String name, List<String> languates) {
		this.name = name;
		this.languages = languates;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	
	
	
}