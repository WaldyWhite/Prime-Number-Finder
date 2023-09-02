import java.util.Arrays;

public class NumberFinder {
    public static void main(String[] args) {
        int[] primNumbers = primNummberFinder(10,50);
        System.out.println(Arrays.toString(primNumbers));

    }
    static int[] primNummberFinder(int start, int end) {
        int foundNumber = 0;
        int numArray[] = new int[end - start +1];
        for (int i = start; i <= end; i++) {
                if(primNumber(i)){
                    numArray[foundNumber] = i;
                    foundNumber++;
                }
            }

        int[] primNumberResult = new int[foundNumber];
        for (int i = 0; i < primNumberResult.length; i++) {
            primNumberResult[i] = numArray[i];
        }
        return primNumberResult;
    }
    static boolean primNumber(int x) {
        if(x <= 1) {
            return false;
        }
        for(int i = 2; i < (x/2); i++) {
            if(x%i == 0) {
                return false;
            }
        }
        return true;
    }

}

