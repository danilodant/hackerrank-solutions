package com.github.danilodant.ThirtyDaysChallenge;

public class Day04ClassVsInstance {

  int age;

  Day04ClassVsInstance(Integer initialAge) {
    if(initialAge < 0) {
      this.age = 0;
      System.out.println("Age is not valid, setting age to 0.");
    } else {
      this.age = initialAge;
    }
  }

  void yearPasses(){
    this.age += 1;
  }

  void amIOld(){
    if(this.age < 13){
      System.out.println("You are young.");
    } else if ( this.age < 18 ) {
      System.out.println("You are a teenager.");
    } else {
      System.out.println("You are old.");
    }
  }

}
