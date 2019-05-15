public class TestMyMap {

      public static void main(String[] args) {


            MyMap map = new MyMap();

            System.out.println(map.size());
            map.put("Hello", 10);
            map.put("Hello", 11);
            map.put("Hello", 12);
            map.put("Hello", 13);
            map.put("World", 13);
            map.put("g", 45);
            System.out.println(map.containsKey("Hello"));
            System.out.println(map.conatinsValue(13));
            System.out.println(map.conatinsValue(14));
            System.out.println("Remove Jello:   " + map.remove("Jello"));
            System.out.println(map.containsKey("Hello"));

            System.out.println(map.sizeOfLinkedlist("Hello"));
            System.out.println("-----------------");
            map.printPairs();
            //System.out.println("Remove Hello:   " + map.remove("Hello"));
            System.out.println("Print out of values:");
            System.out.println(map.values());
      }

}
