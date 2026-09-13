import java.util.ArrayList;

public class arrayCreator {

    public static ArrayList<Integer> ListCreator(int limit, ArrayList<Integer> myList) {

        int randomNum;

        for (int i = 0; i < limit; i++) {

            randomNum = (int)(Math.random() * 1000 ); //To get a more spread data
            myList.add(randomNum);

        }

        return myList;



    }


}