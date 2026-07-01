# Lab 2 – Interactive Array Algorithms

## Overview
This lab implements two interactive array algorithms in Java using the `Scanner` class for user input.

## Files
- **FindMax.java** – Finds the maximum value in a user-entered array and reports its index.
- **PairSum.java** – Uses a brute-force nested loop to find a pair of numbers in a user-entered array that sum to a target value.

## How to Run

### FindMax.java
```
javac FindMax.java
java FindMax
```
You will be prompted to enter the array size, followed by each element. The program then prints the maximum value and its index.

### PairSum.java
```
javac PairSum.java
java PairSum
```
You will be prompted to enter the array size, each element, and a target sum. The program searches for a pair whose values add up to the target and prints the indices, values, and equation. If no such pair exists, it prints a message stating so.

## Algorithm Notes

### Find Maximum (Linear Search)
- Traverses the array once, keeping track of the largest value seen and its index.
- **Time Complexity:** O(n)

### Pair Sum (Brute Force)
- Uses two nested loops to check every possible pair (i, j) where j > i.
- **Time Complexity:** O(n²) — for an array of size n, roughly n²/2 comparisons are made in the worst case.
- This is less efficient than approaches like sorting + two-pointer (O(n log n)) or using a hash set (O(n)), but it directly demonstrates the brute-force strategy taught in class.

## Author
Flow — DCIT 204, University of Ghana
