class Circle{
  // The radius of the Circle
  double radius = 1;
  // Contruct a Circle Object
  Circle(){

  }
  // Contruct a Circle Object
  Circle(double newRadius){
    radius = newRadius;
  }
  // Return the Are of the Circle
  double getArea(){
    return radius * radius * Math.PI;
  }
  // Return the Parameter of the Circle
  double getPerimeter(){
    return 2 * radius * Math.PI;
  }
  // Set a new radius for this Circle
  void setRadius(double newRadius){
    radius = newRadius;
  }
}
