// for input and output
# include <iostream>

/*
    Author: LeeTuah
    Program: Is a number palindrome or not?
    For SuperB league event
*/

// function to show whether a number is palindrome or not
bool isPalindrome(int n){
	int m = 0; // stores the reverse of n	
	
	// looping through all the integers in n
	for(int i = n; i > 0; i /= 10){
		// storing the last integer of i inside m
		m = (10 * m) + (i % 10);	
	}
	
	// returning if the reversed number is equal to original
	return m == n;
}

int main(int argc, char** argv){
	int num; // for user input
	
	// taking number as user input
	std::cout << "Enter your number: ";
	std::cin >> num;
	// if the number is negative, it is made positive
	if(num < 0) num *= 1;
	
	// checking if the number is palindrome or not and giving output accordingly
	if(isPalindrome(num)) std::cout << "The numbers is palindrome";
	else std::cout << "The number is not palindrome";	
}
