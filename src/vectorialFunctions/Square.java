package vectorialFunctions;

public class Square extends BinaryOperatorV{
  public Square(Function op1, Function op2){
    super(op1, op2);
  }
  @Override
  public double calculate(){
    double result = Math.pow(op1.calculate(), op2.calculate());
    System.out.println("Pow " + op1 + "^" + op2 + " = " + result);
    return result;
  }
  public String toString() {
    return "Pow " + op1 + "^" + op2;
  }

}
