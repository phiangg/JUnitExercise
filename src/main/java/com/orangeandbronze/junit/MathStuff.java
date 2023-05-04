package com.orangeandbronze.junit;

class MathStuff { //The class under test
	
	int gcf(int x, int y) {

		return (y == 0) ? x : gcf(y, x % y);   // Euclid's Algorithm
	}
	
	int lcd(int x, int y) {

		return (x * y) / gcf(x, y);
	}

}
