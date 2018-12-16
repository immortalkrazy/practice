import java.util.Date;
public class House implements Cloneable, Comparable<House> {

  private int id;
  private double area;
  private Date whenBuilt;

  public House(){

  }

  public House(int id, double area){
    this.id = id;
    this.area = area;
    whenBuilt = new Date();
  }

  public int getID(){
    return id;
  }

  public double getArea(){
    return area;
  }

  public Date getWhenBuilt(){
    return whenBuilt;
  }
  @Override
  public int compareTo(House o){
    if (getArea() > o.getArea())
      return 1;
    else if(getArea() < o.getArea())
      return -1;
    else
      return 0;
  }
  // 
  // @Override
  // public Object clone(){
  //   try{
  //     return super.clone();
  //   }
  //   catch(CloneNotSupportedException e){
  //     return null;
  //   }
  // }

  @Override
  public Object clone(){
    try{
      // perform a shallow copy on House
      House houseClone = (House)super.clone();
      // deep copy on whenBulit
      houseClone.whenBuilt = (Date)(whenBuilt.clone());

      return houseClone;
    }catch(CloneNotSupportedException e){
      return null;
    }
  }


}
