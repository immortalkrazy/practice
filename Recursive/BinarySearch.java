public class BinarySearch {

    private static int list[] = {3, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        BinarySearch b = new BinarySearch();
        b.binarySearch(list);

    }

    public void binarySearch(int[] args) {
        System.out.println("Binary search.");

        int upperBound = args.length;
        int lowerBound = 1;
        int midpoint = (upperBound + lowerBound) / 2;
        int difference = upperBound - lowerBound;

        int search = 7;

        for (int i = 0; i < args.length; i++) {
            if (search < args[midpoint - 1] && difference != 1) {
                upperBound = midpoint - 1;
                midpoint = upperBound / 2;
            } else if (search > args[midpoint - 1] && difference != 1) {
                lowerBound = midpoint + 1;
                midpoint = (lowerBound + upperBound) / 2;

            } else if (search == args[midpoint - 1]) {
                midpoint = midpoint - 1;

                System.out.println("We found " + search + " at position " + midpoint + " in the list.");
                i = args.length;
            } else {
                System.out.println("We couldn't find " + search + " in the list.");
                i = args.length;
            }
        }
    }
}
