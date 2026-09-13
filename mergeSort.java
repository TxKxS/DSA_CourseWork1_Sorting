public class mergeSort {

    public static long mergeSort(ArrayList<integer> unsortedList) {

        if (unsortedList.size() > 1) {

            int mid = unsortedList.size()/2;

            ArrayList<integer> left = new ArrayList<>(unsortedList.sublist(0, mid)); //mid is not inclusive
            ArrayList<integer> right = new ArrayList<>(unsortedList.sublist(mid , unsortedList.size())); //mid is inclusize at the start

            return merge(Left, right);


        } else {
            return unsortedList;
        }

    }

    private static ArrayList<integer> merge(ArrayList<integer> left,ArrayList<integer> right ) {

        ArrayList<integer> mergedList = new ArrayList<>();

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
            mergedList.addall(left);
            mergedList.addall(right);
        }

        return mergedList;

    }




}