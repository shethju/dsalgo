package com.easy;

public class HammingDistance {
  public static int hammingDistance(int x, int y) {
    int distance = 0;
    String xStr = Integer.toBinaryString(x);
    String yStr = Integer.toBinaryString(y);
    int xStrLength = xStr.length();
    int yStrLength = yStr.length();
    int lengthDiff = Math.abs(xStrLength - yStrLength);
    boolean isXstrLonger = false;
    boolean isYstrLonger = false;
    boolean isSameLength = false;
    if (xStrLength > yStrLength) {
      isXstrLonger = true;
    } else if (yStrLength > xStrLength) {
      isYstrLonger = true;
    } else {
      isSameLength = true;
    }

    if (isSameLength) {
      for (int i = 0; i < xStrLength; i++) {
        if (yStr.charAt(i) != xStr.charAt(i)) {
          distance += 1;
        }
      }
    }
    else {
      for (int i = 0; i <= lengthDiff - 1; i++) {
        if (isXstrLonger) {
          if (xStr.charAt(lengthDiff + i) != yStr.charAt(i)) {
            distance += 1;
          }
        } else if (isYstrLonger) {
          if (yStr.charAt(lengthDiff + i) != xStr.charAt(i)) {
            distance += 1;
          }
        }
      }
      int iterationLength;
      if (isXstrLonger) {
        iterationLength = xStrLength - lengthDiff;
      } else {
        iterationLength = yStrLength - lengthDiff;
      }
      for (int i = 0; i < iterationLength; i++) {
        if (isXstrLonger) {
          if (xStr.charAt(i) == '1') {
            distance += 1;
          }
        } else {
          if (yStr.charAt(i) == '1') {
            distance += 1;
          }
        }
      }
    }
    
    return distance;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println("Hamming distance is **" + hammingDistance(5, 7));
  }

}
