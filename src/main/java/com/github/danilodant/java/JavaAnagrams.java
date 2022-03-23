package com.github.danilodant.java;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaAnagrams {

  static boolean isAnagram(String a, String b) {
    // Complete the function
    String first = a.toLowerCase();
    String second = b.toLowerCase();
    
    if(first.length() != second.length()){
      return false;
    }

    ArrayList<Character> firstList = new ArrayList<Character>();
    ArrayList<Character> secondList = new ArrayList<Character>();

    for (int i = 0; i < first.length(); i++) {
      firstList.add(first.charAt(i));
      secondList.add(second.charAt(i));
    }

    firstList.sort((arg0, arg1) -> Character.compare(arg0, arg1));
    secondList.sort((arg0, arg1) -> Character.compare(arg0, arg1));

    for (int i = 0; i < firstList.size(); i++) {
      if(firstList.get(i) != secondList.get(i)){
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println((ret) ? "Anagrams" : "Not Anagrams");
  }
}
