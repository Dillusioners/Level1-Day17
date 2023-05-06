// for input and output
# include <iostream>

/*
	Author: LeeTuah
	Program: Multiplication Table
	For SuperB League event
*/

// prints the multiplication table of a number
// int n -> the number for which the table has to be printed
// int limit -> the limit inclusive of which the table will be printed
void printTable(int n, int limit){
	// looping for 'limit' amount and printing the result
	for(int i = 1; i <= limit; i++){
		std::cout << n << " x " << i << " = " << n*i << std::endl;	
	}
}

// execution starts from here
// int argc -> total argument count from run
// char** argv -> all the provided arguments in a string array
int main(int argc, char** argv){
	// variable declaration
	int num, limit;
	
	// taking input the number and the limit
	std::cout << "Enter the number: ";
	std::cin >> num;
	std::cout << "Enter the limit of multiplication: ";
	std::cin >> limit;
        // if the limit is negative, it is made positive
        if(limit < 0) limit *= -1;
        // if the limit is zero, make it one
        if(limit == 0) limit++;
	
	// printing the table for the number and limit
	std::cout << "\n\nThe table is as follows:\n";
	printTable(num, limit);
	return 0;
}
