package vectorialFunctions;

abstract class BinaryOperatorV implements Function {

  protected Function op1;
  protected Function op2;

  public BinaryOperatorV(Function op1, Function op2) {
    this.op1 = op1;
    this.op2 = op2;
  }
  public abstract double calculate();
}