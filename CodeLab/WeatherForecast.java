public class WeatherForecast{

  /*deaclare instance variables*/
  private String skies = "Cloud";
  private int high = 0;
  private int low = 0;

  /*create set methods*/
  public void setSkies(String mySkies){
    skies = mySkies;
  }
  public void setHigh(int myHigh){
    high = myHigh;
  }
  public void setLow(int myLow){
    low = myLow;
  }
  /*create get methods*/
  public String getSkies(){
    return skies;
  }
  public int getHigh(){
    return high;
  }
  public int getLow(){
    return low;
  }
}
