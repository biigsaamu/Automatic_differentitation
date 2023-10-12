package scalarFunctions;

abstract class BinaryOperator implements ArithmeticExpression{

  protected ArithmeticExpression op1;
  protected ArithmeticExpression op2;

  public BinaryOperator(ArithmeticExpression op1, ArithmeticExpression op2) {
    this.op1 = op1;
    this.op2 = op2;
  }
  public abstract double calculate();
}
