package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
	
	public static boolean isPrime(int num) {
		for(int i = 2; i <= num/2; i++) {
			if (num%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isSquare(int num) {
		if (num == 1) {
			return true;
		}
		for(int i = 2; i <= num/2; i++) {
			
			if (i*i == num) {
				return true;
			}
			
		}
		return false;
	
	}
	
	public static boolean isCube(int num) {
		if (num == 1) {
			return true;
		}
		for(int i = 2; i <= num/2; i++) {
			
			if (i*i*i == num) {
				return true;
			}
			
		}
		return false;
	
	}
    
    public static String multiply(int num1, int num2) {
        return (num1 + " x " + num2 + " = " + (num1*num2));
    }
    
    public static int findBrokenEgg(List<String> eggs) {
        return 0;
    }
}
