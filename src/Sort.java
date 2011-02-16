/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;

/**
 *
 * @author Nicolai
 */
public class Sort {

    public long selectionSort(int[] unsortArray) {

        long selectStart = System.nanoTime();
        int temp;
        for(int i=0; i<(unsortArray.length-1); i++) {
            for(int k=i; (k<unsortArray.length-1);k++) {
                if(unsortArray[i]>unsortArray[k]) {
                    temp = unsortArray[i];
                    unsortArray[i] = unsortArray[k];
                    unsortArray[k] = temp;
                }  
            }
        }
        long selectEnd = System.nanoTime();

        System.out.println("\nSelection Sort time: " + (selectEnd - selectStart) + " ns");
        
        return (selectEnd-selectStart);
    }

    public long quickSort(int[] unsortArray) {
        long quickStart = System.nanoTime();
        Arrays.sort(unsortArray);
        long quickEnd = System.nanoTime();

        System.out.println("\nQuick Sort time: " + (quickEnd - quickStart) + " ns");
        
        return (quickEnd-quickStart);
    }
}
