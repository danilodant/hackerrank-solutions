# Day 8: Dictionaries and Maps

**Objective**  
Today, we're learning about Key-Value pair mappings using a _Map_ or _Dictionary_ data structure. Check out the [Tutorial](/challenges/30-dictionaries-and-maps/tutorial) tab for learning materials and an instructional video!

**Task**  
Given names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. You will then be given an unknown number of names to query your phone book for. For each queried, print the associated entry from your phone book on a new line in the form `name=phoneNumber`; if an entry for is not found, print `Not found` instead.

**Note:** Your phone book should be a Dictionary/Map/HashMap data structure.

**Input Format**

<style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}</style>

The first line contains an integer, , denoting the number of entries in the phone book.  
Each of the subsequent lines describes an entry in the form of space-separated values on a single line. The first value is a friend's name, and the second value is an -digit phone number.

After the lines of phone book entries, there are _an unknown number of lines of queries_. Each line (query) contains a to look up, and you must continue reading lines until there is no more input.

**Note:** Names consist of lowercase English alphabetic letters and are _first names_ only.

**Constraints**

<style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}</style>

**Output Format**

<style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}</style>

On a new line for each query, print `Not found` if the name has no corresponding entry in the phone book; otherwise, print the full and in the format `name=phoneNumber`.

**Sample Input**

<style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}</style>

    3
    sam 99912222
    tom 11122222
    harry 12299933
    sam
    edward
    harry

**Sample Output**

<style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}</style>

    sam=99912222
    Not found
    harry=12299933

**Explanation**

<style id="MathJax_SVG_styles">.MathJax_SVG_Display {text-align: center; margin: 1em 0em; position: relative; display: block!important; text-indent: 0; max-width: none; max-height: none; min-width: 0; min-height: 0; width: 100%} .MathJax_SVG .MJX-monospace {font-family: monospace} .MathJax_SVG .MJX-sans-serif {font-family: sans-serif} .MathJax_SVG {display: inline; font-style: normal; font-weight: normal; line-height: normal; font-size: 100%; font-size-adjust: none; text-indent: 0; text-align: left; text-transform: none; letter-spacing: normal; word-spacing: normal; word-wrap: normal; white-space: nowrap; float: none; direction: ltr; max-width: none; max-height: none; min-width: 0; min-height: 0; border: 0; padding: 0; margin: 0} .MathJax_SVG * {transition: none; -webkit-transition: none; -moz-transition: none; -ms-transition: none; -o-transition: none} .mjx-svg-href {fill: blue; stroke: blue}</style>

We add the following _(Key,Value)_ pairs to our map so it looks like this:

We then process each query and print `key=value` if the queried is found in the map; otherwise, we print `Not found`.

_Query 0:_ `sam`  
Sam is one of the keys in our dictionary, so we print `sam=99912222`.

_Query 1:_ `edward`  
Edward is not one of the keys in our dictionary, so we print `Not found`.

_Query 2:_ `harry`  
Harry is one of the keys in our dictionary, so we print `harry=12299933`.