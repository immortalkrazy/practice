public EquilateralTriangle (double base, String color, boolean filled) {
  private double Equilateralbase;
private double Equilateralheight;


public EquilateralTriangle() {

}

public EquilateralTriangle (double base, String color, boolean filled) {
  Equilateralbase= base;

  setColor(color);

  setFilled(filled);

  Equilateralheight = Math.sqrt( (base * base) - ((base / 2) * (base / 2)) );
  }

public double getHeight() {
  return Equilateralheight;

}

public double getBased() {
  return Equilateralbase;
}
}
