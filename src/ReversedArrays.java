
import java.util.ArrayList;
import java.util.Scanner;

public class ReversedArrays {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Integer> myArray1 = new ArrayList<Integer>();
        System.out.println(" First array : please enter 3 numbers ");
        myArray1.add(sc.nextInt());
        myArray1.add(sc.nextInt());
        myArray1.add(sc.nextInt());
        ArrayList<Integer> myArray2 = new ArrayList<Integer>();
        System.out.println(" Second Array : please enter 4 numbers ");
        myArray2.add(sc.nextInt());
        myArray2.add(sc.nextInt());
        myArray2.add(sc.nextInt());
        myArray2.add(sc.nextInt());
        System.out.println(" First array : " + myArray1);
        System.out.println(" Second Array : " + myArray2);
        ReverseArray reverseArray = new ReverseArray() {{
            setName("Reverse Array");
        }};
        ArrayList<Integer> myReversedArray1 = new ArrayList<Integer>();
        myReversedArray1 = reverseArray.reversedArray(myArray1);
        System.out.println(" reversed First array: " + myReversedArray1);

        ArrayList<Integer> myReversedArray2 = new ArrayList<Integer>();
        myReversedArray2 = reverseArray.reversedArray(myArray2);
        System.out.println(" reversed Second Array: " + myReversedArray2);

        ArrayList<Integer> sumArray = new ArrayList<Integer>();
        Integer length = Math.max(myReversedArray1.size(), myReversedArray2
                .size());
        Integer sum = 0;
        Boolean flag = true;
        if (flag) {
            for (int i = 0; i < length; i++) {
                sum = (reverseArray.checkAndGet(myReversedArray1, i) +
                        reverseArray.checkAndGet(myReversedArray2, i));
                sumArray.add(i, sum);
            }
            flag = false;
        }
        System.out.println("  sum array : " + sumArray);
        System.out.println(" reversed sum array : " + reverseArray.reversedArray(sumArray));

    }
}
