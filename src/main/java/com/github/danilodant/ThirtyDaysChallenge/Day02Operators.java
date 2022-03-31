package com.github.danilodant.ThirtyDaysChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

class ResultDay02 {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    // Write your code here
    BigDecimal mealCost = BigDecimal.valueOf(meal_cost);
    BigDecimal tip = BigDecimal.valueOf(tip_percent).divide(BigDecimal.valueOf(100)).multiply(mealCost);
    BigDecimal tax = BigDecimal.valueOf(tax_percent).divide(BigDecimal.valueOf(100)).multiply(mealCost);
    int totalMealCost = mealCost.add(tip).add(tax).setScale(0, RoundingMode.HALF_EVEN).intValue();

    System.out.println(totalMealCost);

    }

}

public class Day02Operators {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        ResultDay02.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}
