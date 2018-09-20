public class PlayListEntry {

  private String title = "";
  private String artist = "";
  private int playCount = 0;

  public void setArtist(String myArtist){
    artist = myArtist;
  }
  public void setTitle(String myTitle){
    title = myTitle;
  }
  public void setPlayCount(int myPlayCount){
    playCount = myPlayCount;
  }

  /*********************/
  public String getArtist(){
    return artist;
  }
  public String getTitle(){
    return title;
  }
  public int getPlayCount(){
    return playCount;
  }
}
