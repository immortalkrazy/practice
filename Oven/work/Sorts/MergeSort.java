public class MergeSort {

    public static void mergeSort(int[] list) {

        if (list.length > 1) {
            // merge sort the first half
            int firstHalfLength = list.length / 2;
            // create the new first half array
            int[] firstHalf = new int[firstHalfLength];
            // make another array which is half in length of the original one
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            // recursive call
            mergeSort(firstHalf);

            // merge sort the second half
            int secondHalfLength = list.length - (list.length / 2);
            // create the second half array
            int[] secondHalf = new int[secondHalfLength];
            // make the second half new array
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
            // recursive call
            mergeSort(secondHalf);

            // merge firstHalf with secondHalf into list
            merge(firstHalf, secondHalf, list);

        }
    }

    public static void merge (int[] list1, int[] list2, int[] temp) {

        int current1 = 0; // current index in list1
        int current2 = 0; // current index in list2
        int current3 = 0; // current index in temp

        while (current1 < list1.length && current2 < list2.length) {

            if (list1[current1] < list2[current2]) {
                temp[current3] = list1[current1];
                current1++;
            }
            else {
                temp[current3] = list2[current2];
                current2++;
            }
            current3++;
        }

        while (current1 < list1.length) {
            temp[current3] = list1[current1];
            current3++;
            current1++;
        }
        while (current2 < list2.length) {
            temp[current3] = list2[current2];
            current3++;
            current2++;
        }
    }

    public static void main(String[] args) {

        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

        mergeSort(list);

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
