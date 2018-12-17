public class ComparableStudent extends Student implements Comparable<ComparableStudent> {

  public ComparableStudent(int id, String firstName, String lastName, double gpa){
    super(id, firstName, lastName, gpa);
  }

  public int compareTo(ComparableStudent o){
    if (getGpa() > o.getGpa())
      return 1;
    else if (getGpa() < o.getGpa())
      return -1;
    else
      return 0;
  }

}
