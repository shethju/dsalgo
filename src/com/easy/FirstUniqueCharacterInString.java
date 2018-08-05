package com.easy;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {
//https://leetcode.com/problems/first-unique-character-in-a-string/discuss/86511/Java-One-Pass-Solution-with-LinkedHashMap
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(firstUniqChar("leetcode"));
	}

	public static int firstUniqChar(String s) {
        Set<Character> set = new HashSet<Character>();
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        char[] charArray = s.toCharArray();
        // Cant do Character c: s, since string is not iterable
        int i=0;
        for (Character c: charArray) { // no need to do s.toCharArry(). just do s.charAt(i)
        		if (set.contains(c)) {
        			if (map.get(c) != null) {
        				map.remove(c);
        			}
        		} else {
        			set.add(c);
        			map.put(c, i);
        		}
        		i++;
        }
        return map.entrySet().iterator().next().getValue();
    }
}
