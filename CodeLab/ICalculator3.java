/*Assume the availability of an existing class, ICalculator,
that models an integer arithmetic calculator and contains:

an instance variable currentValue that stores the current int value of the calculator
a getter method for the above instance variable methods add, sub, mul, and div
Each method in ICalculator receives an int argument and applies its operation to
currentValue and returns the new value of currentValue.
So, if currentValue has the value 8 and sub(6) is invoked then currentValue
ends up with the value 2, and 2 is returned.

So, you are to write the definition of a subclass, ICalculator3,
based on ICalculator. The class ICalculator3 overrides the div method of ICalculator.
It checks its argument and if the argument is zero,
it prints to standard output the message "ZERO DIVIDE ATTEMPTED"
and simply returns the value of currentValue. Otherwise,
if the argument is NOT zero, the method invokes the base class method
div (from ICalculator) and returns the value that it receives from that call.*/
public class ICalculator3 extends ICalculator{

  public int div(int newValue){
    if (newValue != 0){
      return super.div(newValue);
    }
    else{
      System.out.println("ZERO DIVIDE ATTEMPTED");
      return getCurrentValue();
    }
  }
}
