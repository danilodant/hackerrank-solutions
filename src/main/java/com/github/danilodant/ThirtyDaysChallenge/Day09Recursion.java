package com.github.danilodant.ThirtyDaysChallenge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Day09Recursion {

  public static void main(String[] args) {
    try {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      int n = Integer.parseInt(bufferedReader.readLine().trim());

      int result = ResultDay09.factorial(n);

      bufferedWriter.write(String.valueOf(result));
      bufferedWriter.newLine();

      bufferedReader.close();
      bufferedWriter.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

class ResultDay09 {

  /*
   * Complete the 'factorial' function below.
   * The function is expected to return an INTEGER.
   * The function accepts INTEGER n as parameter.
   */

  public static int factorial(int n) {
    // Write your code here
    if (n == 1) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }

}