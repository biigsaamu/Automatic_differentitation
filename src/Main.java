//import scalarFunctions.*;
public class Main {
  public static void main(String[] args) {
    //3*(2+x)
    /*ArithmeticExpression constant3 = new Constant(5);
    ArithmeticExpression constant2 = new Constant(20);
    ArithmeticExpression x = new X(new Constant(4));
    ArithmeticExpression sum = new Suma(constant2, x);
    ArithmeticExpression exp = new Mult(constant3, sum);
    double result = exp.calculate();
    System.out.println("Result = " + result);*/

    //sin(π/2 + x^2)
    /*ArithmeticExpression piHalf = new Constant(3.141592/2.0);
    ArithmeticExpression xx = new X(new Constant(4));
    ArithmeticExpression cons = new Constant(2);
    ArithmeticExpression pow2 = new Pow(xx,cons);
    ArithmeticExpression sum1 = new Suma(piHalf, pow2);
    ArithmeticExpression exp2 = new Sin(sum1);
    double result2 = exp2.calculate();
    System.out.println("Result = " + result2);*/


  }
}