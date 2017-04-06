package mywork.arrays.ex1;

import java.util.Arrays;

public class StringOrganizerTest{
    public static void main(String args[]){
        StringOrganizer inputArray = new StringOrganizer(args);
        System.out.println("\nReversing the order..");
        inputArray.reverse();
        System.out.println("\nSorting in asc order..");
        inputArray.ascendingSort();
        System.out.println("\nSorting in desc order..");
        inputArray.descendingSort();
       
    }

}