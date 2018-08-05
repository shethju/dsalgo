package com.easy;

public class IsPowerOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isPowerOf3(6));
	}

	public static boolean isPowerOf3(int n) {
		return (n > 0) && (maxIntPowerOf3() % n == 0);
	}
	
	public static int maxIntPowerOf3() {
		int maxPowerOf3 = 3;
		int tempPowerOf3 = 3;
		for (;;) {
			maxPowerOf3 = maxPowerOf3 * 3;
			if (maxPowerOf3 > 0) {
				tempPowerOf3 = maxPowerOf3;
			} else {
				break;
			}
		}
		System.out.println(tempPowerOf3);
		return tempPowerOf3;
	}
}
