public class TestTV {
  public static void main (String[] args){

    TV tv1 = new TV();
    tv1.turnOn();
    tv1.setChannel(30);
    tv1.setVolume(5);
    tv1.volumeDown();

    TV tv2 = new TV();
    tv2.turnOn();
    tv2.channelUp();
    tv2.channelUp();
    tv2.volumeUp();
    tv2.volumeDown();

    System.out.println("tv1's Channel is: " + tv1.channel
     + " and Volume level is: "+ tv1.volumeLevel);
    System.out.println("tv2's Channel is: " + tv2.channel
     + " and Volume level is: "+ tv2.volumeLevel);
  }
}
