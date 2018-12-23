public class Password {

  private String pass;

  public Password(){
    this.pass = setPass(10);
  }

  private String setPass(int length){
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%";
    char[] password = new char[length];
    for (int i = 0; i < length; i++){
      int rand = (int) (Math.random() * passwordSet.length());
      password[i] = passwordSet.charAt(rand);
    }
    return new String(password);
  }

  public String toString(){
    return pass;
  }

}
