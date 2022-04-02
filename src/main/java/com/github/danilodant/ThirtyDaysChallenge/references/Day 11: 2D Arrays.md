# Day 11: 2D Arrays

**Objective**  
Today, we are building on our knowledge of _arrays_ by adding another dimension. Check out the [Tutorial](/challenges/30-2d-arrays/tutorial) tab for learning materials and an instructional video.

**Context**  
Given a _2D Array_, :

    1 1 1 0 0 0
    0 1 0 0 0 0
    1 1 1 0 0 0
    0 0 0 0 0 0
    0 0 0 0 0 0
    0 0 0 0 0 0

We define an hourglass in to be a subset of values with indices falling in this pattern in 's graphical representation:

    a b c
      d
    e f g

There are hourglasses in , and an _hourglass sum_ is the sum of an hourglass' values.

**Task**  
Calculate the hourglass sum for every hourglass in , then print the _maximum_ hourglass sum.

**Example**

In the array shown above, the maximum hourglass sum is for the hourglass in the top left corner.

**Input Format**

<style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue} .MathJax_SVG_LineBox {display: table!important} .MathJax_SVG_LineBox span {display: table-cell!important; width: 10000em!important; min-width: 0; max-width: none; padding: 0; border: 0; margin: 0}</style>

There are lines of input, where each line contains space-separated integers that describe the _2D Array_ .

**Constraints**

<style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}</style>

**Output Format**

<style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue} .MathJax_SVG_LineBox {display: table!important} .MathJax_SVG_LineBox span {display: table-cell!important; width: 10000em!important; min-width: 0; max-width: none; padding: 0; border: 0; margin: 0}</style>

Print the maximum hourglass sum in .

**Sample Input**

<style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}</style>

    1 1 1 0 0 0
    0 1 0 0 0 0
    1 1 1 0 0 0
    0 0 2 4 4 0
    0 0 0 2 0 0
    0 0 1 2 4 0

**Sample Output**

<style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}</style>

    19

**Explanation**

<style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}</style>

contains the following hourglasses:

    1 1 1   1 1 0   1 0 0   0 0 0
      1       0       0       0
    1 1 1   1 1 0   1 0 0   0 0 0

    0 1 0   1 0 0   0 0 0   0 0 0
      1       1       0       0
    0 0 2   0 2 4   2 4 4   4 4 0

    1 1 1   1 1 0   1 0 0   0 0 0
      0       2       4       4
    0 0 0   0 0 2   0 2 0   2 0 0

    0 0 2   0 2 4   2 4 4   4 4 0
      0       0       2       0
    0 0 1   0 1 2   1 2 4   2 4 0

The hourglass with the maximum sum () is:

    2 4 4
      2
    1 2 4