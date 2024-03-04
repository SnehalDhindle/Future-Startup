// returning the MergedList

import java.util.*;

class Day14{

    static LinkedList<Integer> mergeLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> mergedList = new LinkedList<>();

        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {

            if (list1.get(i)<(list2.get(j))) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<Integer>();
        l1.add(1);
        l1.add(3);
        l1.add(6);
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(2);
        l2.add(4);
        l2.add(7);

        LinkedList<Integer> mergedList = mergeLists(l1, l2);

    
        System.out.println(mergedList);
    }
}
