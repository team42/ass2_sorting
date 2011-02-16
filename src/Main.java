import java.util.Arrays;



public class Main {

	// Nicolai

	public static void main(String[] args) {
            ArrayCreator ArrCrea = new ArrayCreator();
            Sort srt = new Sort();

            int arrLength = 100000;
            int minVal = -10000;
            int maxVal = 10000;

            int[] random1 = new int[arrLength];
            int[] random2 = new int[arrLength];
            random1 = ArrCrea.randomGen(arrLength, minVal, maxVal);
            random2 = random1;
            
            int[] asc1 = new int[arrLength];
            int[] asc2 = new int[arrLength];
            asc1 = ArrCrea.randomGen(arrLength, minVal, maxVal);
            Arrays.sort(asc1);
            asc2 = asc1;
            
            int[] desc1 = new int[arrLength];
            int[] desc2 = new int[arrLength];
            desc1 = ArrCrea.randomGen(arrLength, minVal, maxVal);
            Arrays.sort(desc1);
            desc1 = ArrCrea.flip(desc1);
            desc2 = desc1;
            
            srt.quickSort(random1);
            srt.quickSort(asc1);
            srt.quickSort(desc1);
            
            srt.selectionSort(random2);
            srt.selectionSort(asc2);
            srt.selectionSort(desc2);

            //srt.selectionSort(random1);
            //srt.quickSort(random2);
	}
}
