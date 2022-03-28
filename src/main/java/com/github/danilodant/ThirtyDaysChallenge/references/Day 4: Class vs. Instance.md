# Day 4: Class vs. Instance

**Objective**  
In this challenge, we're going to learn about the difference between a _class_ and an _instance_; because this is an _Object Oriented_ concept, it's only enabled in certain languages. Check out the [Tutorial](/challenges/30-class-vs-instance/tutorial) tab for learning materials and an instructional video!

**Task**  
Write a _Person_ class with an instance variable, , and a constructor that takes an integer, , as a parameter. The constructor must assign to after confirming the argument passed as is not negative; if a negative argument is passed as , the constructor should set to and print `Age is not valid, setting age to 0.`. In addition, you must write the following instance methods:

1.  _yearPasses()_ should increase the instance variable by 1.
2.  _amIOld()_ should perform the following conditional actions:
    *   If , print `You are young.`.
    *   If and , print `You are a teenager.`.
    *   Otherwise, print `You are old.`.

To help you learn by example and complete this challenge, much of the code is provided for you, but you'll be writing everything in the future. The code that creates each instance of your _Person_ class is in the _main_ method. Don't worry if you don't understand it all quite yet!

**Note:** Do not remove or alter the stub code in the editor.

**Input Format**

<style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}</style>

Input is handled for you by the stub code in the editor.

The first line contains an integer, (the number of test cases), and the subsequent lines each contain an integer denoting the of a Person instance.

**Constraints**

<style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}</style>

**Output Format**

<style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}</style>

Complete the method definitions provided in the editor so they meet the specifications outlined above; the code to test your work is already in the editor. If your methods are implemented correctly, each test case will print or lines (depending on whether or not a valid was passed to the constructor).

**Sample Input**

<style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}</style>

    4
    -1
    10
    16
    18

**Sample Output**

<style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}</style>

    Age is not valid, setting age to 0.
    You are young.
    You are young.

    You are young.
    You are a teenager.

    You are a teenager.
    You are old.

    You are old.
    You are old.

**Explanation**

<style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}</style>

_Test Case 0_:  
Because , our code must set to and print the "Age is not valid..." message followed by the young message. Three years pass and , so we print the young message again.

_Test Case 1:_  
Because , our code should print that the person is young. Three years pass and , so we print that the person is now a teenager.

_Test Case 2:_  
Because , our code should print that the person is a teenager. Three years pass and , so we print that the person is old.

_Test Case 3:_  
Because , our code should print that the person is old. Three years pass and the person is still old at , so we print the old message again.

**The extra line at the end of the output is supposed to be there and is trimmed before being compared against the test case's expected output. If you're failing this challenge, check your logic and review your print statements for spelling errors.**