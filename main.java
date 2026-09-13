import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //'long' as it will be used to measure time in nanoseconds
        //Insertion Sort Varibles
        long arrISTimer[] = new long[5];
        long arrInsertionSortedTimer[] = new long[5];

        //Merge Sort Varables
        long arrMSTimer[] = new long[5];
        long arrMergeSortedTimer[] = new long[5];
        long start, end, duration;



        //my different arrays to be sorted
        ArrayList<Integer> my500List = new ArrayList<>();
        ArrayList<Integer> my1000List = new ArrayList<>();
        ArrayList<Integer> my2000List = new ArrayList<>();
        ArrayList<Integer> my4000List = new ArrayList<>();
        ArrayList<Integer> my8000List = new ArrayList<>();

        //Insertion Sort O(n^2)

        System.out.println("Creaing list for insertion sort");
        for (int i = 0; i < 5; i++) {

            System.out.println("Run number: " + (i+1));

            System.out.println("\nCreating array of 500 elements\n");
            my500List = arrayCreator.ListCreator(500, my500List);

            System.out.println("Creating array of 1000 elements\n");
            my1000List = arrayCreator.ListCreator(1000, my1000List);

            System.out.println("Creating array of 2000 elements\n");
            my2000List = arrayCreator.ListCreator(2000, my2000List);

            System.out.println("Creating array of 4000 elements\n");
            my4000List = arrayCreator.ListCreator(4000, my4000List);

            System.out.println("Creating array of 8000 elements\n");
            my8000List = arrayCreator.ListCreator(8000, my8000List);


            //System.out.println(myList); //Testing purposes

            ///storing time taken rather than sorted list to get a more accurate result as returning a longer list could end up taking more time
            System.out.println("\nUnsorted list:");
            arrISTimer[0] += insertionSort.insertionSort(my500List);
            System.out.println("\nSorting already sorted list:");
            arrInsertionSortedTimer[0] += insertionSort.insertionSort(globals.sortedList); //Finding time for sorted array

            System.out.println("\nUnsorted list:");
            arrISTimer[1] += insertionSort.insertionSort(my1000List);
            System.out.println("\nSorting already sorted list:");
            arrInsertionSortedTimer[1] += insertionSort.insertionSort(globals.sortedList); //Finding time for sorted array

            System.out.println("\nUnsorted list:");
            arrISTimer[2] += insertionSort.insertionSort(my2000List);
            System.out.println("\nSorting already sorted list:");
            arrInsertionSortedTimer[2] += insertionSort.insertionSort(globals.sortedList); //Finding time for sorted array

            System.out.println("\nUnsorted list:");
            arrISTimer[3] += insertionSort.insertionSort(my4000List);
            System.out.println("\nSorting already sorted list:");
            arrInsertionSortedTimer[3] += insertionSort.insertionSort(globals.sortedList); //Finding time for sorted array

            System.out.println("\nUnsorted list:");
            arrISTimer[4] += insertionSort.insertionSort(my8000List);
            System.out.println("\nSorting already sorted list:");
            arrInsertionSortedTimer[4] += insertionSort.insertionSort(globals.sortedList); //Finding time for sorted array

        }

        //Merge Sort

        System.out.println("Creaing list for Merge Sort now");
        for (int i = 0; i < 5; i++) {

            System.out.println("Run number: " + (i + 1) );

            System.out.println("\nCreating array of 500 elements\n");
            my500List = arrayCreator.ListCreator(500, my500List);

            System.out.println("Creating array of 1000 elements\n");
            my1000List = arrayCreator.ListCreator(1000, my1000List);

            System.out.println("Creating array of 2000 elements\n");
            my2000List = arrayCreator.ListCreator(2000, my2000List);

            System.out.println("Creating array of 4000 elements\n");
            my4000List = arrayCreator.ListCreator(4000, my4000List);

            System.out.println("Creating array of 8000 elements\n");
            my8000List = arrayCreator.ListCreator(8000, my8000List);


            //System.out.println(myList); //Testing purposes

            //storing time taken rather than sorted list to get a more accurate result as returning a longer list could end up taking more time
            //fist list of 500
            System.out.println("\nUnsorted list:");
            System.out.println("\nStarting stopwatch");
            start = System.nanoTime();
            globals.sortedList = mergeSort.mergeSort(my500List);
            end = System.nanoTime();
            System.out.println("Stopwatch stopped ");
            duration =  end - start;
            arrMSTimer[0] += duration;
            System.out.println("Time took is: " + duration + " nanoseconds. (~ " + duration/1000000 + " ms)");

            System.out.println("\nSorting already sorted list:");
            System.out.println("\nStarting stopwatch");
            start = System.nanoTime();
            globals.sortedList = mergeSort.mergeSort(globals.sortedList); //Finding time for sorted array
            end = System.nanoTime();
            System.out.println("Stopwatch stopped ");
            duration =  end - start;
            arrMergeSortedTimer[0] += duration;
            System.out.println("Time took is: " + duration + " nanoseconds. (~ " + duration/1000000 + " ms)");

            //second list of 1000
            System.out.println("\nUnsorted list:");
            System.out.println("\nStarting stopwatch");
            start = System.nanoTime();
            globals.sortedList = mergeSort.mergeSort(my1000List);
            end = System.nanoTime();
            System.out.println("Stopwatch stopped ");
            duration =  end - start;
            arrMSTimer[1] += duration;
            System.out.println("Time took is: " + duration + " nanoseconds. (~ " + duration/1000000 + " ms)");

            System.out.println("\nSorting already sorted list:");
            System.out.println("\nStarting stopwatch");
            start = System.nanoTime();
            globals.sortedList = mergeSort.mergeSort(globals.sortedList); //Finding time for sorted array
            end = System.nanoTime();
            System.out.println("Stopwatch stopped ");
            duration  =  end - start;
            arrMergeSortedTimer[1] += duration;
            System.out.println("Time took is: " + duration + " nanoseconds. (~ " + duration/1000000 + " ms)");

            //third list of 2000
            System.out.println("\nUnsorted list:");
            System.out.println("\nStarting stopwatch");
            start = System.nanoTime();
            globals.sortedList = mergeSort.mergeSort(my2000List);
            end = System.nanoTime();
            System.out.println("Stopwatch stopped ");
            duration  =  end - start;
            arrMSTimer[2] += duration;
            System.out.println("Time took is: " + duration + " nanoseconds. (~ " + duration/1000000 + " ms)");

            System.out.println("\nSorting already sorted list:");
            System.out.println("\nStarting stopwatch");
            start = System.nanoTime();
            globals.sortedList = mergeSort.mergeSort(globals.sortedList); //Finding time for sorted array
            end = System.nanoTime();
            System.out.println("Stopwatch stopped ");
            duration  =  end - start;
            arrMergeSortedTimer[2] += duration;
            System.out.println("Time took is: " + duration + " nanoseconds. (~ " + duration/1000000 + " ms)");

            //fourth list of 4000
            System.out.println("\nUnsorted list:");
            System.out.println("\nStarting stopwatch");
            start = System.nanoTime();
            globals.sortedList = mergeSort.mergeSort(my4000List);
            end = System.nanoTime();
            System.out.println("Stopwatch stopped ");
            duration  =  end - start;
            arrMSTimer[3] += duration;
            System.out.println("Time took is: " + duration + " nanoseconds. (~ " + duration/1000000 + " ms)");

            System.out.println("\nSorting already sorted list:");
            System.out.println("\nStarting stopwatch");
            start = System.nanoTime();
            globals.sortedList = mergeSort.mergeSort(globals.sortedList); //Finding time for sorted array
            end = System.nanoTime();
            System.out.println("Stopwatch stopped ");
            duration = end - start;
            arrMergeSortedTimer[3] += duration;
            System.out.println("Time took is: " + duration + " nanoseconds. (~ " + duration/1000000 + " ms)");

            //five list of 8000
            System.out.println("\nUnsorted list:");
            System.out.println("\nStarting stopwatch");
            start = System.nanoTime();
            globals.sortedList = mergeSort.mergeSort(my8000List);
            end = System.nanoTime();
            System.out.println("Stopwatch stopped ");
            duration  =  end - start;
            arrMSTimer[4] += duration;
            System.out.println("Time took is: " + duration + " nanoseconds. (~ " + duration/1000000 + " ms)");

            System.out.println("\nSorting already sorted list:");
            System.out.println("\nStarting stopwatch");
            start = System.nanoTime();
            globals.sortedList = mergeSort.mergeSort(globals.sortedList); //Finding time for sorted array
            end = System.nanoTime();
            System.out.println("Stopwatch stopped ");
            duration  =  end - start;
            arrMergeSortedTimer[4] += duration;
            System.out.println("Time took is: " + duration + " nanoseconds. (~ " + duration/1000000 + " ms)");

        }


        //Final Results

        System.out.println("\nInsertion sort - O(n^2)");
        System.out.println("Findings: (Unsorted Random Numbers)");
        for (int i = 0; i < 5; i++) {
            arrISTimer[i] /= 5;
            System.out.println((i +1 ) + ". Average time taken is: " + arrISTimer[i] + " nanoseconds. (~ " + arrISTimer[i]/1000000 + " ms)");
        }
        System.out.println("\nFindings: (Sorted Numbers)");
        for (int i = 0; i < 5; i++) {
            arrInsertionSortedTimer[i] /= 5;
            System.out.println((i +1 ) + ". Average time taken is: " + arrInsertionSortedTimer[i] + " nanoseconds. (~ " + arrInsertionSortedTimer[i]/1000000 + " ms)");
        }

        System.out.println("\nMerge sort - O(n log n)");
        System.out.println("Findings: (Unsorted Random Numbers)");
        for (int i = 0; i < 5; i++) {
            arrMSTimer[i] /= 5;
            System.out.println((i +1 ) + ". Average time taken is: " + arrMSTimer[i] + " nanoseconds. (~ " + arrMSTimer[i]/1000000 + " ms)");
        }
        System.out.println("\nFindings: (Sorted Numbers)");
        for (int i = 0; i < 5; i++) {
            arrMergeSortedTimer[i] /= 5;
            System.out.println((i +1 ) + ". Average time taken is: " + arrMergeSortedTimer[i] + " nanoseconds. (~ " + arrMergeSortedTimer[i]/1000000 + " ms)");
        }



    }

}

