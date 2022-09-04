package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
        
        
        String[] array = {"word", "hello", "it", "is", "your", "mother", "calling"};
        
        assertTrue(_01_LinearSearch.linearSearch(array, "hello")==1);
        
        
        assertFalse(_01_LinearSearch.linearSearch(array, "fair")==1);
        
        
        
        assertTrue(_01_LinearSearch.linearSearch(array, "calling")==6);
    }
    

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
        
        
        
        int[] ordered = {1,2,3,4,5,6,8,9};
        System.out.println(_02_BinarySearch.binarySearch(ordered, 0, ordered.length-1, 3));
        assertTrue(_02_BinarySearch.binarySearch(ordered, 0, ordered.length-1, 3) == 2);
        
        
        assertTrue(_02_BinarySearch.binarySearch(ordered, 0, ordered.length-1, 8) == 6);
        
        assertFalse(_02_BinarySearch.binarySearch(ordered, 0, ordered.length-1, 4) == 4);
        
    }
}
