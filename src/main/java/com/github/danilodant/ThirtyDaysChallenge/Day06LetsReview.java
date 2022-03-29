package com.github.danilodant.ThirtyDaysChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day06LetsReview {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberOfStrings = Integer.parseInt(scanner.nextLine());
    List<String> strings = new ArrayList<String>();

    for (int i = 0; i < numberOfStrings; i++) {
      strings.add(scanner.nextLine());
    }

    for (int i = 0; i < numberOfStrings; i++) {
      String tempString = strings.get(i);
      for (int j = 0; j < tempString.length(); j++) {
        if (j % 2 == 0) {
          System.out.print(tempString.charAt(j));
        }
      }
      System.out.print(" ");
      for (int j = 0; j < tempString.length(); j++) {
        if (j % 2 != 0) {
          System.out.print(tempString.charAt(j));
        }
      }
      System.out.println();
    }
    scanner.close();
  }
}
