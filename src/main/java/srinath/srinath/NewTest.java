package srinath.srinath;

import java.util.ArrayList;
import java.util.List;

public class NewTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int[] arr = {1, 2, 3, 4, 3, 2, 5, 6, 3, 6, 7, 8, 1, 3};

        int highestCount = 0;
        int numberWithHighestCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;  // Initialize count to 1 for the current element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > highestCount) {
                highestCount = count;
                numberWithHighestCount = arr[i];
            }
        }

        System.out.println("Number with the highest count is: " + numberWithHighestCount);
        System.out.println("Count of the highest number is: " + highestCount);
    }

	}


