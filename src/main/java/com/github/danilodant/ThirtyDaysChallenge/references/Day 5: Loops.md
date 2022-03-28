# Day 5: Loops

**Objective**  
In this challenge, we will use loops to do some math. Check out the [Tutorial](/challenges/30-loops/tutorial) tab to learn more.

**Task**  
Given an integer, , print its first multiples. Each multiple (where ) should be printed on a new line in the form: `n x i = result`.

**Example**  

The printout should look like this:

<pre>3 x 1 = 3
3 x 2 = 6
3 x 3 = 9
3 x 4 = 12
3 x 5 = 15
3 x 6 = 18
3 x 7 = 21
3 x 8 = 24
3 x 9 = 27
3 x 10 = 30
</pre>

**Input Format**

<style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}</style>

A single integer, .

**Constraints**

<style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}</style>

**Output Format**

<style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}</style>

Print lines of output; each line (where ) contains the of in the form:  
`n x i = result`.

**Sample Input**

<style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}</style>

    2

**Sample Output**

<style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}</style>

    2 x 1 = 2
    2 x 2 = 4
    2 x 3 = 6
    2 x 4 = 8
    2 x 5 = 10
    2 x 6 = 12
    2 x 7 = 14
    2 x 8 = 16
    2 x 9 = 18
    2 x 10 = 20