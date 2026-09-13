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


        System.out.println("Creating array of 500 elements");
        my500List = arrayCreator.ListCreator(500 , my500List );

        System.out.println("Creating array of 1000 elements");
        my1000List = arrayCreator.ListCreator(1000 , my1000List );

        System.out.println("Creating array of 2000 elements");
        my2000List = arrayCreator.ListCreator(2000 , my2000List );

        System.out.println("Creating array of 4000 elements");
        my4000List = arrayCreator.ListCreator(4000 , my4000List );

        System.out.println("Creating array of 8000 elements");
        my8000List = arrayCreator.ListCreator(8000 , my8000List );



        //System.out.println(myList); //Testing purposes

        arrTimer[0] = insertionSort.insertionSort(my500List);
        arrTimer[1] = insertionSort.insertionSort(my1000List);
        arrTimer[2] = insertionSort.insertionSort(my2000List);
        arrTimer[3] = insertionSort.insertionSort(my4000List);
        arrTimer[4] = insertionSort.insertionSort(my8000List);



    }

}

