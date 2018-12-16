public class HouseClient{
  public static void main(String []args){

    House house1 = new House(35, 67000.0);
    House house2 = (House)house1.clone();

    System.out.println(house1 == house2);
    System.out.println(house1.equals(house2));
    System.out.println(house1.getWhenBuilt() == house2.getWhenBuilt());


  }
}
