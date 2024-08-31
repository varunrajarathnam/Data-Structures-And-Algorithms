// clang++ /Users/varunrajarathnam/DSA/Data-Structures-And-Algorithms/cpp_intro/arithmetic_operations.cpp -o arithmetic_operations
// ./arithmetic_operations
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int add(int a, int b);
int subtract(int a, int b);
int multiply(int a, int b);
int quotient(int a, int b);
int mod1(int a, int b);

int main() {
    int a, b;

    // Prompt user for input
    cout << "Enter two integers (a and b): ";
    cin >> a >> b;

    // Check for division by zero
    if (b == 0) {
        cout << "Error: Division or modulus by zero is not allowed.\n";
        return 1;
    }

    // Perform arithmetic operations
    int sum = add(a, b);
    int difference = subtract(a, b);
    int product = multiply(a, b);
    int divide = quotient(a, b);
    int mod = mod1(a, b);

    // Output results
    cout << "Sum: " << sum << "\n";
    cout << "Difference: " << difference << "\n";
    cout << "Product: " << product << "\n";
    cout << "Quotient: " << divide << "\n";
    cout << "Modulus: " << mod << "\n";  

    return 0;
}

int add(int a, int b) {
    return a + b;
}

int subtract(int a, int b) {
    return a - b;
}

int multiply(int a, int b) {
    return a * b;
}

int quotient(int a, int b) {
    return a / b;
}

int mod1(int a, int b) {
    return a % b;
}
