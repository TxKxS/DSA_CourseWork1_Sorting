import java.util.ArrayList;

public class arrayCreator {

    public static ArrayList ListCreator(int limit, ArrayList<int> myList) {

        int randomNum;

        for (int i = 0; i < limit; i++) {

            randomNum = (int)(Math.random() * 1000 );
            myList.add(randomNum);

        }





    }


}