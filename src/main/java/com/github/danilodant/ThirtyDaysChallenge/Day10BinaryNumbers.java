package com.github.danilodant.ThirtyDaysChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day10BinaryNumbers {

  public static void main(String[] args) throws IOException {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine().trim());
    bufferedReader.close();

    String binaryString = Integer.toBinaryString(n);
    int count = 0;
    int tempCount = 0;
    
    for (int i = 0; i < binaryString.length(); i++) {
      if (binaryString.charAt(i) == '1') {
        count++;
      } else if (count > tempCount) {
        tempCount = count;
        count = 0;
      } else {
        count = 0;
      }
    }
    
    System.out.println(count > tempCount ? count : tempCount);
  }

}
