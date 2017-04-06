
package mywork.arrays.ex1;

import java.util.Arrays;

/**
 * Refer to page 5-13
 *
 */
public class StringOrganizer {
	//instance variables
	String stringArray [];
	
	//constructors
	public StringOrganizer (String [] args) {
		stringArray = args;
	}
	
	//instance methods
	public void reverse() {
		for (int i = stringArray.length - 1; i >= 0; i--)
			System.out.println(stringArray[i]);
	}
	
	public void printArray(String s[]){
        for(int i = 0; i < s.length; i++)
            System.out.print(s[i] + " ");
        System.out.println();
    }

	public void ascendingSort(){
        Arrays.sort(stringArray);
    }

    public void descendingSort(){
        ascendingSort();
        reverse();
    }
    

}
