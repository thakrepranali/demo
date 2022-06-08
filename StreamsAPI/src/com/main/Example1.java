package com.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
	
	public static void main(String[] args) {
		
		List<String>list=Arrays.asList("abc","","dfg","","ddd","","wer");
		List<String>list1=list.stream().filter(string->!string.isEmpty()).collect(Collectors.toList());
		System.out.println(list1);
	}
	

}
