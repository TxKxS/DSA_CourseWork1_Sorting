public static main InsertionSort(ArrayList<int> myList){


        int i, j, tempNum;

        //Starting at 2nd location as will be comparing backwards
        for(i = 1, i < myList, i++) {
            j = i -1;
            if (myList.get(j) > myList(i)) {
                tempNum = myList.get(j);
                while (tempNum > myList(j + 1) && j > 0) {
                    mylist(j+1) = myList(j);
                    j--;
                }
                myList(j) = tempNum;
            }

        }


        }