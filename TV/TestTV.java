class TV{
  
  int channel = 1;    //default channel is 1
  int volumeLevel = 1;   //default volume is 1
  boolean on = false; //TV is off
  public TV(){

  }
  public void turnOn(){
    on = true;
  }
  public void turnOff(){
    on = false;
  }
  public void setVolume(int newVolumeLevel){
    if (on && volumeLevel >= 1 && volumeLevel <=7)
    volumeLevel = newVolumeLevel;
  }
  public void setChannel(int newChannel){
    if (on && channel <= 1 && newChannel <=120)
    channel = newChannel;
  }
  public void channelUp(){
    if (on && channel < 120)
      channel++;
  }
  public void channelDown(){
    if (on && channel > 1)
      channel--;
  }
  public void volumeUp(){
    if (on && volumeLevel < 7)
      volumeLevel++;
  }
  public void volumedown(){
    if (on && volumeLevel > 1)
      volumeLevel--;
  }
}
public class TestTV {
  public static void main(String[]args){

    // Construct a TV class
    TV tv1 = new TV();
    System.out.println(tv1.channel);
    tv1.turnOn();
    tv1.setChannel(100);
    tv1.setVolume(5);
    System.out.println("The channel and vole level for tv1: "
      + tv1.channel+ " and " + tv1.volumeLevel);

    TV tv2 = new TV();
    tv2.turnOn();
    tv2.volumeUp();
    tv2.channelUp();
    tv2.channelUp();
    System.out.println("The channel and vole level for tv2: "
      + tv2.channel+ " and " + tv2.volumeLevel);
  }
}
