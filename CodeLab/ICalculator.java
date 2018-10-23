/*Assume the availability of an existing class, ICalculator, that models an
integer arithmetic calculator and contains:

an instance variable currentValue that stores the current int value of the
calculator a getter method for the above instance variable
methods add, sub, mul, and div
Each method in ICalculator receives an int argument and applies its operation
to currentValue and returns the new value of currentValue. So, if currentValue
has the value 8 and sub(6) is invoked then currentValue ends up with the
value 2, and 2 is returned.

So, you are to write the definition of a subclass, ICalculator1,
based on ICalculator. The class ICalculator1 has one additional method,
sign, that receives no arguments, and doesn't modify currentValue.
Instead, it simply returns 1, 0 or -1 depending on the whether currentValue
is positive, zero, or negative respectively.*/
public class ICalculator{
  private int currentValue = 0;

  public void setCurrentValue(int currentValue){
    this.currentValue = currentValue;
  }
  public int getCurrentValue(){
    return currentValue;
  }
  public int add(int newValue){
    return currentValue + newValue;
  }
  public int sub(int newValue){
    return currentValue - newValue;
  }
  public int mul(int newValue){
    return currentValue * newValue;
  }
  public int div(int newValue){
    return currentValue / newValue;
  }
}
