package com.github.danilodant.ThirtyDaysChallenge;

import java.util.Scanner;

public class Day05Loops {

  public static void main(String[] args) {
    // int number = Integer.parseInt(bufferedReader.readLine().trim());
    // bufferedReader.close();

    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    scanner.close();

    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d x %d = %d\n", number, i, number*i);
    }

  }

}
