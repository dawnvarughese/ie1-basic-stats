import java.util.*;


import java.util.*;
import javax.swing.*;


import java.awt.*;
import java.awt.event.*;


public class MinMaxCalculation{
    public static void main(String args) {
        int[] numbers = { /* Array of numbers */ };


        int min = findMin(numbers);
        int max = findMax(numbers);


        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);


        public static int findMin(int[] numbers) {
            Arrays.sort(numbers);
            return numbers[0];
        }
   
        public static int findMax(int[] numbers) {
            Arrays.sort(numbers);
            return numbers[numbers.length - 1];
        }
   


    }
}
