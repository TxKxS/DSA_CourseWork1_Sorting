import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //'long' as it will be used to measure time in nanoseconds
        long arrTimer[] = new long[5];


        //my different arrays to be sorted
        ArrayList<Integer> my500List = new ArrayList<>();
        ArrayList<Integer> my1000List = new ArrayList<>();
        ArrayList<Integer> my2000List = new ArrayList<>();
        ArrayList<Integer> my4000List = new ArrayList<>();
        ArrayList<Integer> my8000List = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            System.out.println("Run number: " + i);

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
            arrTimer[0] += insertionSort.insertionSort(my500List);
            arrTimer[1] += insertionSort.insertionSort(my1000List);
            arrTimer[2] += insertionSort.insertionSort(my2000List);
            arrTimer[3] += insertionSort.insertionSort(my4000List);
            arrTimer[4] += insertionSort.insertionSort(my8000List);

        }

        for (int i = 0; i < 5; i++) {
            arrTimer[i] /= 5;
            System.out.println((i +1 ) + ". Average time taken is: " + arrTimer[i] + " nanoseconds. (~ " + arrTimer[i]/1000000 + " ms)");
        }

    }

}

