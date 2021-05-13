package com.core.core;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Java8BiFunctionEx {

	public static <R> R powerString(Integer i1, Integer i2, BiFunction<Integer, Integer, Double> fun2, Function<Double, String> fun1) {
		return (R) fun2.andThen(fun1).apply(i1, i2);

	}


	public static <A1, A2, R1, R2> R2 genericResultString(A1 a1, A2 a2,
			BiFunction<A1, A2, R1> func,
			Function<R1, R2> func2) {

		return func.andThen(func2).apply(a1, a2);

	}

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Double> func1 = (a1, a2) -> Math.pow(a1, a2);
		Function<Double, String> func2 = (input) -> "Result : " + String.valueOf(input);

		String result = func1.andThen(func2).apply(2, 4);
		System.out.println(result);

		String res = powerString(2, 4, (i1,i2)->Math.pow(i1, i2), 
				(input) -> "Result: "+String.valueOf(input));
		System.out.println(res);

		String powResult = genericResultString(2, 4,
                (a1, a2) -> Math.pow(a1, a2),
                (r) -> "Pow : " + String.valueOf(r));

        System.out.println(powResult); 
        
        String mulResult = genericResultString(2, 4, 
        		(a1, a2) -> a1*a2, 
        		(r) -> "Multi: "+String.valueOf(r));
        
        System.out.println(mulResult);
        
        String addResult = genericResultString(2, 4, 
        		(a1, a2) -> a1+a2, 
        		(r) -> "Add: "+String.valueOf(r));

        System.out.println(addResult);

	}

}
