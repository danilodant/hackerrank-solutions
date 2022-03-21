package com.github.danilodant;

import java.util.ArrayList;

/**
 * JavaSubstringComparisons
 */
public class JavaSubstringComparisons {

  public static void main(String[] args) {
    System.out.println(getSmallestAndLargest("welcometojava", 3));
  }

  public static String getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";
    
    // Complete the function
    // 'smallest' must be the lexicographically smallest substring of length 'k'
    // 'largest' must be the lexicographically largest substring of length 'k'
    
    ArrayList<String> lista = new ArrayList<String>();
    
    for (int i = 0; i < s.length() - k +1; i++) {
        lista.add(s.substring(i,i+k));
    }
    
    lista.sort(String::compareTo);
    
    smallest = lista.get(0);
    largest = lista.get(lista.size() -1);
    
    return smallest + "\n" + largest;
}
  
}