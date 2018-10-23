/*Assume the availability of an existing class, ICalculator,
that models an integer arithmetic calculator and contains:

an instance variable currentValue that stores the current int value of the
calculator and can be accessed and modified by any subclass.
methods add, sub, mul, and div
Each method in ICalculator receives an int argument and applies its operation
to currentValue and returns the new value of currentValue.
So, if currentValue has the value 8 and sub(6) is invoked then currentValue
ends up with the value 2, and 2 is returned.

So, you are to write the definition of a subclass, ICalculator2,
based on ICalculator. The class ICalculator2 has one additional method,
negate, that receives no arguments.
The effect of negate is to reverse the sign of currentValue.
For example, if currentValue is zero, there is no change,
if it is -22 then it becomes 22, if it is 100 it becomes -100.
Furthermore negate returns the new value of currentValue.*/
public class ICalculator2 extends ICalculator{
  public int negate(){
    return (getCurrentValue() * -1);
  }
}
