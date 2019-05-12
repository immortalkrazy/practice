public class Test {

    public String str;

    public static void main(String[] args) {

        String s1 = "1";
        String s2 = "9";
        System.out.println(s1.compareTo(s2));

        System.out.println(75 % 15);

        String str = "defs";


        System.out.println(getIndex(str));
        System.out.println(index(str));

    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((str == null) ? 0 : str.hashCode());
        return result;
    }


    private static int getIndex(String key) {

        return key.hashCode() % 15;

    }
    private static int index (String str) {

        int total = 0;
        for (int i = 0; i < str.length(); i++) {
            total += (str.charAt(i) - 'a');
        }
        return total % 15;
    }


}
