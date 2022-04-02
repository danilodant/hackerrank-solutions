package com.github.danilodant.ThirtyDaysChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Day11TwoDArrays {

  private final Integer ROWS = 6;
  private final Integer COLUMNS = 6;

  public static void main(String[] args) throws IOException {
    List<List<Integer>> arr = new ArrayList<>();
    // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    // IntStream.range(0, 6).forEach(i -> {
    //   try {
    //     arr.add(
    //         (List<Integer>) Stream.of(
    //             bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
    //             .map(Integer::parseInt)
    //             .collect(Collectors.toList()));
    //   } catch (IOException ex) {
    //     throw new RuntimeException(ex);
    //   }
    // });
    // bufferedReader.close();

    List<Integer> temp = new ArrayList<>();
    temp.addAll(Arrays.stream("1 1 1 0 0 0".split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
    arr.add(temp);
    temp = new ArrayList<>();
    temp.addAll(Arrays.stream("0 1 0 0 0 0".split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
    arr.add(temp);
    temp = new ArrayList<>();
    temp.addAll(Arrays.stream("1 1 1 0 0 0".split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
    arr.add(temp);
    temp = new ArrayList<>();
    temp.addAll(Arrays.stream("0 0 2 4 4 0".split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
    arr.add(temp);
    temp = new ArrayList<>();
    temp.addAll(Arrays.stream("0 0 0 2 0 0".split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
    arr.add(temp);
    temp = new ArrayList<>();
    temp.addAll(Arrays.stream("0 0 1 2 4 0".split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
    arr.add(temp);

    getMaxHourGlass(arr);
  }

  private static void getMaxHourGlass(List<List<Integer>> arr) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.size(); i++) {
      for (int j = 0; j < arr.get(i).size(); j++) {
        if (i + 2 < arr.size() && j + 2 < arr.get(i).size()) {
          int sum =
              arr.get(i).get(j)
                  + arr.get(i).get(j + 1)
                  + arr.get(i).get(j + 2)
                  + arr.get(i + 1).get(j + 1)
                  + arr.get(i + 2).get(j)
                  + arr.get(i + 2).get(j + 1)
                  + arr.get(i + 2).get(j + 2);
          if (sum > max) {
            max = sum;
          }
        }
      }
    }
    System.out.println(max);
  }

}
