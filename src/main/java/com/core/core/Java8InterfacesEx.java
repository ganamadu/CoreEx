package com.core.core;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.cglib.transform.impl.AddInitTransformer;

public class Java8InterfacesEx {
	
	public static Supplier<Integer> rndomNum = () -> new Random().nextInt(70)+10;
	
	public static Consumer<String> consumeStr = (str) -> System.out.println(str);
	
	public static <A1, A2, R1, R2> R2 genericResultString(A1 a1, A2 a2,
			BiFunction<A1, A1, R1> func1,
			Function<R1, R2> func2) {
		
		return func1.andThen(func2).apply(a1, a1);
	}
	
	public static void main(String args[]) {
		
		for(int i=1; i<=5; i++) {
			System.out.println(rndomNum.get());
		}
		consumeStr.accept("Hyderabad");
		
		String multiplyResult = genericResultString(2, 4, (a1,a2)->a1*a2, (r)->String.valueOf(r));
		System.out.println("Multiplication: "+multiplyResult);
		
		String addtionResult = genericResultString(2, 4, (a1,a2)->a1+a2, (r)->String.valueOf(r));
		System.out.println("Addition Result: "+addtionResult);
		
		String substractResult = genericResultString(4, 2, (a1,a2)->a1-a2, (r)->String.valueOf(r));
		System.out.println("Subtract Result: "+substractResult);
		
		List<String> strList = Arrays.asList("Apple","Ankita","Anji","Aniel","Babu","Baloon","Ball","Balu","Aswin","Amer","Bloom");
		strList.stream().filter(n->n.startsWith("A")).forEach(System.out::println);
		Long countOfBletters = strList.stream().filter(n->n.startsWith("B")).count();
		System.out.println(countOfBletters);
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		if(obj1 == obj2)
			System.out.println("Hai...");  //Not Printed...
		
		if(obj1.equals(obj2))
			System.out.println("Hello..."); //Not Printed...
		
		
		
	}

}
