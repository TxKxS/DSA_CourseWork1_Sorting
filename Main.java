import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();

        System.out.println("Creating array");
        //Creating list of 8000 at once and will pass chunks of it to the algorithms to remove need of rerunning the algorithm again
        myList = ArrayCreator.ListCreator(100 , myList );

        //System.out.println(myList); //Testing purposes




    }

}

