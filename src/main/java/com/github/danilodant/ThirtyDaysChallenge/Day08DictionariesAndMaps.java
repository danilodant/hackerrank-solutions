package com.github.danilodant.ThirtyDaysChallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Day08DictionariesAndMaps {

  public static void main(String[] args) {
    HashMap<String, String> phoneBook = new HashMap<String, String>();
    List<String> namesToQuery = new ArrayList<String>();
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int i = 0; i < n; i++) {
      String name = in.next();
      String phone = String.valueOf(in.nextInt());
      phoneBook.put(name, phone);
    }
    while (in.hasNext()) {
      String temp = in.next();
      namesToQuery.add(temp);
    }
    in.close();

    namesToQuery.stream().forEach(keyName -> {
      if (phoneBook.keySet().contains(keyName)) {
        System.out.println(keyName + "=" + phoneBook.get(keyName));
      } else {
        System.out.println("Not found");
      }
    });
  }

}
