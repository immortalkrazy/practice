class ContestResult {

  /*set instance variables*/
  private String winner = "ABC";
  private String secondPlace = "DEF";
  private String thirdPlace = "GHI";

  /*create set methods*/
  public void setWinner(String myWinner){
    winner = myWinner;
  }
  public void setSecondPlace(String mySecondPlace){
    secondPlace = mySecondPlace;
  }
  public void setThirdPlace(String myThirdPlace){
    thirdPlace = myThirdPlace;
  }
  /*create get methods*/
  public String getWinner(){
    return winner;
  }
  public String getSecondPlace(){
    return secondPlace;
  }
  public String getThirdPlace(){
    return thirdPlace;
  }
}
class TestContestResult {
  public static void main(String[]args){
    ContestResult Cr = new ContestResult();
    System.out.println("Before Change:  " + Cr.getWinner() +"\t"+
      Cr.getSecondPlace() + "\t" + Cr.getThirdPlace());
    Cr.setWinner("faisal");
    Cr.setSecondPlace("Tom");
    Cr.setThirdPlace("John");
    System.out.println("After Change:  " + Cr.getWinner() +"\t"+
      Cr.getSecondPlace() + "\t" + Cr.getThirdPlace());

  }
}
