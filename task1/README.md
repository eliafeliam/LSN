Task1 : Distinct Elements and Statistics
This Java console application takes a space-separated list of integers as input and provides information about distinct elements and basic statistics.

Usage :

Run the program in the terminal.
Enter a space-separated list of integers.

Features :

Converts input string to an array of integers.
Finds distinct elements and sorts them in ascending order.
Displays count, distinct count, minimum, and maximum values.

Methods :

convertToIntValues(String[] numbersAsStrings)
Converts an array of strings to an array of integers.

getDistinctArr(int[] values)
Finds distinct elements in an array of integers.

showResults(int[] distinctArr, int[] values)
Displays the distinct elements and basic statistics.

show(String s)
Prints a string to the console.

show(String key, int value)
Prints a key-value pair to the console.

Example :

Input :

1 10 20 20 2 5

Output :

1 2 5 10 20

count: 6

distinct: 5

min: 1

max: 20