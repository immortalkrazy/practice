public class Circle{
  /* The radiu of the circle*/
  double radius;
  /* Static variable "numberOfObejects created"*/
  static int numberOfObjects = 0;
  /*Construct a circle with radius 1 */
  Circle(){
    radius = 1.0;
    numberOfObjects++;
  }
  /*Construct a circle with specified newRadius*/
  Circle(double newRadius){
    radius = newRadius;
    numberOfObjects++;
  }
  /*Static method to return the nomberOfObejects created*/
  static int getNumberOfObjects(){
    return numberOfObjects;
  }
  /*Instance method to get the are of obeject*/
  double getArea(){
    return radius * radius * Math.PI;
  }
  void setRadius(double newRadius){
  radius = newRadius;
  }
}
