package com.github.danilodant;

import java.util.Scanner;

public class JavaStringReverse {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    sc.close();

    boolean isPalindrome = isPalindrome(A);
    if(isPalindrome){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }

  private static boolean isPalindrome(String a) {
    for (int i = 0; i < a.length() - 1 - i; i++) {
      if(a.charAt(i) != a.charAt(a.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }
  
}
