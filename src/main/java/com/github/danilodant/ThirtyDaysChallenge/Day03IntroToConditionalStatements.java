package com.github.danilodant.ThirtyDaysChallenge;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Day03IntroToConditionalStatements {
  
  public static void main(String[] args) {
    
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
      int number = Integer.parseInt(bufferedReader.readLine().trim());
      if( number % 2 == 1 ||
        ( number >= 6 && number <= 20 )){
        System.out.println("Weird");
      } else {
        System.out.println("Not Weird");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
