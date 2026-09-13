import java.util.ArrayList;

public class mergeSort {

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> unsortedList) {

        if (unsortedList.size() > 1) {

            int mid = unsortedList.size()/2;

            ArrayList<Integer> left = new ArrayList<>(unsortedList.subList(0 , mid)); //mid is not inclusive
            ArrayList<Integer> right = new ArrayList<>(unsortedList.subList(mid , unsortedList.size())); //mid is inclusize at the start

            mergeSort(left);
            mergeSort(right);

            return merge(left, right);


        } else {
            return unsortedList;
        }

    }

    private static ArrayList<Integer> merge(ArrayList<Integer> left,ArrayList<Integer> right ) {

        ArrayList<Integer> mergedList = new ArrayList<>();

        //adding the smaller to the merged list and removing the item from the list
        while (left.size() != 0 && right.size() != 0) {

            if (left.get(0) < right.get(0)) {
                mergedList.add(left.get(0));
                left.remove(0);
            } else {
                mergedList.add(right.get(0));
                right.remove(0);
            }

        }

        //One of the lists will not be empty
        if (left.size() != 0 || right.size() != 0) {
            //since one of them is empty, there won't be any erros, left overs will be added to the merged list
            mergedList.addAll(left);
            mergedList.addAll(right);
        }

        return mergedList;

    }




}