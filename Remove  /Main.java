// C++ program to remove 
// a given word from a string 

#include <bits/stdc++.h> 
using namespace std; 

string removeWord(string str, string word) 
{ 
	// Check if the word is present in string 
	// If found, remove it using removeAll() 
	if (str.find(word) != string::npos) 
	{ 
		size_t p = -1; 

		// To cover the case 
		// if the word is at the 
		// beginning of the string 
		// or anywhere in the middle 
		string tempWord = word + " "; 
		while ((p = str.find(word)) != string::npos) 
			str.replace(p, tempWord.length(), ""); 

		// To cover the edge case 
		// if the word is at the 
		// end of the string 
		tempWord = " " + word; 
		while ((p = str.find(word)) != string::npos) 
			str.replace(p, tempWord.length(), ""); 
	} 

	// Return the resultant string 
	return str; 
} 

// Driver Code 
int main(int argc, char const *argv[]) 
{ 
	// Test Case 1: 
	// If the word is in the middle 
	char string1[200]; 
  cin.getline(string1,200);
	string word1 = "the"; 

	// Test Case 2: 
	// If the word is at the beginning 
	
	// Test Case 3: 
	// If the word is at the end 
	
	// If the word is not present 
	
	cout << removeWord(string1, word1) << endl; 

	return 0; 
} 

// This code is contributed by 
// sanjeev2552 
