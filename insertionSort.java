import java.util.ArrayList;

public class insertionSort {

    public static long insertionSort(ArrayList<Integer> myList) {

        int i, j, tempNum;

        //Starting stopwatch in the insertion sort to get more accurate results
        System.out.println("\nStarting stopwatch");
        long start = System.nanoTime();

        //Starting at 2nd location as will be comparing backwards
        for (i = 1; i < myList.size(); i++) {
            tempNum = myList.get(i); //temporarily storing it
            j = i - 1; //Cheking the previous one
            while (j >= 0 && tempNum > myList.get(j)) {
                myList.set((j + 1), myList.get(j)); // moving the element one position down
                j--;
            }
            myList.set(j + 1, tempNum); //inserting the number back again

        }
        long end = System.nanoTime();

        //obtaining the time taken
        long duration = end - start;
        System.out.println("Stopwatch stopped ");
        System.out.println("Time took is: " + duration + " nanoseconds. (~ " + duration/1000000 + " ms)");

        return duration;

    }
}