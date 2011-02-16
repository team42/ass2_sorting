
// @author Nicolai

public class ArrayCreator {

    public int[] flip(int[] inputArr) {

        int[] flipArr = new int[inputArr.length];

        for(int i=0; i<(inputArr.length-1); i++) {
            flipArr[i] = inputArr[(inputArr.length-2-i)];
        }
        return flipArr;
    }

    public int[] randomGen(int arrLength, int minNumb, int maxNumb) {
        int[] randArr;

        randArr = new int[arrLength];

        for(int i=0; i<=arrLength-1; i++) {
            randArr[i] = (int)(minNumb+(Math.random()*(maxNumb-minNumb)));
        }
        return randArr;
    }
}
