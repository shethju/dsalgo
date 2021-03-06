package com.easy;

import java.util.Hashtable;
import java.util.Stack;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {12, 28, 46, 32, 50, 50};
		int[] B = {50, 12, 32, 46, 28, 50};
		anagramMappings(A,B);
	}
	
	public static int[] anagramMappings(int[] A, int[] B) {
		int[] result = new int[A.length];
		Hashtable<Integer, Stack<Integer>> keyValue = new Hashtable<Integer, Stack<Integer>>();
		int i=0;
		for (int b: B) {
			Stack<Integer> indices = keyValue.get(b);
			if (indices == null) indices = new Stack<Integer>();
			indices.push(i++);
			keyValue.put(b, indices);
		}
		int j=0;
		for (int a: A) {
			result[j++] = keyValue.get(a).pop();
		}
		return result;
	}

}
