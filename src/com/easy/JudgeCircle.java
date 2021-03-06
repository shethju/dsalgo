package com.easy;

public class JudgeCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(judgeCircle("LRUDD"));
	}

	public static boolean judgeCircle(String moves) {
		char[] movesArray = moves.toCharArray();
		int updown=0, leftright = 0;
		for (char move: movesArray) {
			switch (move) {
				case 'U':
					++updown; 
					break;
				case 'D':
					--updown;
					break;
				case 'L':
					++leftright;
					break;
				case 'R':
					--leftright;
					break;
			}
					
		}
        return (updown == 0 && leftright == 0); 
    }
}
