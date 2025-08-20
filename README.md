# Number to Word Converter

## A simple Java program that converts a numeric input (0, 1, or 2) into its corresponding word representation.
Description

This program reads an integer input from the user and outputs the word equivalent for numbers 0, 1, and 2. For any other input value, it outputs "Nothing".
Features

    Converts numbers 0-2 to their word equivalents ("Zero", "One", "Two")

    Handles invalid inputs gracefully by outputting "Nothing"

    Simple and intuitive console-based interface

How to Use

    Compile the program:
    text

javac Main.java

Run the program:
text

    java Main

    Enter a number when prompted:

        Input 0 to see "Zero"

        Input 1 to see "One"

        Input 2 to see "Two"

        Input any other number to see "Nothing"

Example Usage
text

Input: 0
Output: Zero

Input: 1
Output: One

Input: 2
Output: Two

Input: 5
Output: Nothing

Code Structure

The program uses a switch-case statement to handle different input values:

    Case 0: Prints "Zero"

    Case 1: Prints "One"

    Case 2: Prints "Two"

    Default: Prints "Nothing" for any other input

Requirements

    Java Development Kit (JDK) 8 or higher

Limitations

    Only handles integer inputs

    Only converts numbers 0, 1, and 2

    Does not handle non-numeric inputs (will throw an exception)

Future Enhancements

Potential improvements could include:

    Handling a wider range of numbers

    Adding error handling for non-integer inputs

    Implementing a GUI interface

    Adding support for multiple languages

Author

This program was created as a simple demonstration of switch-case statements in Java.
