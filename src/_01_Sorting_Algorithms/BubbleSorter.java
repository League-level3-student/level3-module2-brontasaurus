package _01_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
    public BubbleSorter() {
        type = "Bubble";
    }

    /* 
     * Use the bubble sorting algorithm to sort the array.
     * You can use display.updateDisplay() to show the current
     * progress on the graph.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
        
    	int n = array.length;
    	for (int i =0; i < n-1; i++) {
    		for (int j = i+1; j < n; j++) {
    			if (array[i] > array[j]) {
    				int temp = array[i];
    				array[i] = array[j];
    				array[j] = temp;
    			}
    			
    			
    		}
    		display.updateDisplay();
    	}
    	
    	
    }
}
