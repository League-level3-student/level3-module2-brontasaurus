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
    	for (int i = 0; i < eggs.size(); i++) {
    		if (eggs.get(i).equals("cracked")) {
    			return i;
    		}
    	}
    	
        return 0;
        
    }
    
    public static int countPearls(List<Boolean> oysters) {
    	int count = 0;
    	for (int i = 0; i < oysters.size(); i++) {
    		if (oysters.get(i) == true) {
    			count++;
    		}
    	}
    	
    	return count;
    }
    
    public static double findTallest(List<Double> peeps) {
    	double tallest = 0;
    	for (int i = 0; i< peeps.size()-1; i++) {
    		if (peeps.get(i) < peeps.get(i+1)) {
    			tallest = peeps.get(i+1);
    		}
    	}
    	
    	return tallest;
    }
    
    
    public static String findLongestWord(List<String> words) {
    	String longest = words.get(0);
    	for(int i = 1; i < words.size(); i++) {
    		if (words.get(i).length() >longest.length()) {
    			longest = words.get(i);
    		}
    	}
    	
    	
    	return longest;
    }

    
    
    public static boolean containsSOS(List<String> message) {
    	String morse = "... --- ...";
      if (message.contains(morse)){
    	return true;
    	
   }
      
      return false;
    }
    
    
    
    public static List<Double> sortScores(List<Double> results) {
    	double score = 0;
    	
    	for (int j = 0; j < results.size()-1; j++) {
    		for (int i = j+1; i < results.size(); i++) {
    			if (results.get(i) < results.get(j)) {
    				score = results.get(j);
    				results.set(j,results.get(i));
    				results.set(i, score);
    			}
    		}
    		
    		
    		
    		}
    	
    	return results;
    }
    
    
    public static List<String> sortDNA(List<String> DNA){
    	String count;
    	
    	for (int j = 0; j < DNA.size()-1; j++) {
    		for (int i = j+1; i < DNA.size(); i++) {
    			if (DNA.get(i).length() < DNA.get(j).length()) {
    				count = DNA.get(j);
    				DNA.set(j,DNA.get(i));
    				DNA.set(i, count);
    			}
    		}
    		
    		
    		
    		}
    
    	
    	return DNA;
    }
    
    
    public static List<String> sortWords(List<String> words){
    
    String count;
	
	for (int j = 0; j < words.size()-1; j++) {
		for (int i = j+1; i < words.size(); i++) {
			if (words.get(i).compareTo(words.get(j)) < 0) {
				count = words.get(j);
				words.set(j, words.get(i));
				words.set(i, count);
			}
		}
		
		
		
		}

	
	return words;
}
    
    
   

    
    
    
    
    
    
    
    
}
