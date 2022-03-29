package com.github.danilodant.ThirtyDaysChallenge;

import java.util.Scanner;

/* INPUT ALTERNATIVE

BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        bufferedReader.close();
*/

public class Day07Arrays {

  public static void main(String[] args) {
    // Open Scanner
    Scanner input = new java.util.Scanner(System.in);

    // Get lenght of numbers in array
    int n = input.nextInt();

    // Create empty array
    int[] arr = new int[n];

    // Loop for to get numbers in array
    for (int j = 0; j < n; j++) {
      // Get number in array
      arr[j] = input.nextInt();
    }
    input.close();

    // loop in reverse for to get numbers in array
    for (int i = n - 1; i >= 0; i--) {
      // Print number in array
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
