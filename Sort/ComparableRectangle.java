public class ComparableRectangle extends Rectangle
    implements Comparable<ComparableRectangle>{

  public ComparableRectangle(double height, double width){
    super (height, width);
  }

  public int compareTo(ComparableRectangle o){
    if (getArea() > o.getArea()){
      return 1;
    }
    else if(getArea() < o.getArea()){
      return -1;
    }
    else{
      return 0;
    }
  }
  public String toString(){
    return " Area " + getArea();
  }

}
