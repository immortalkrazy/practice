import java.util.Comparator;
import java.io.Serializable;
public class SortByLastName implements Comparator<Student>{

  public int compare(Student lhs, Student rhs){
    String s1 = lhs.getLastName();
    String s2 = rhs.getLastName();
    return s1.compareTo(s2);
  }
}
