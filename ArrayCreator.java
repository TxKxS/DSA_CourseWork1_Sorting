import java.util.ArrayList;

public class ArrayCreator {

    public static ArrayList ListCreator(int limit, ArrayList<Integer> myList) {

        int randomNum;

        for (int i = 0; i < limit; i++) {

            randomNum = (int)(Math.random() * 1000 );
            myList.add(randomNum);

        }

        return myList;



    }


}