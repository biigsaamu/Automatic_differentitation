package vectorialFunctions;


public class MultV extends BinaryOperatorV{
  public MultV(Function op1, Function op2) {
    super(op1,op2);
  }

  @Override
  public DualNumber calculate(DualNumber dn) {
    DualNumber dn1 = op1.calculate(dn);
    DualNumber dn2 = op2.calculate(dn);
    // f(x)
    double multiplication = dn1.u * dn2.u;
    // f'(x)
    double derivativeMultiplication = (dn1.uprime * dn2.u) + (dn1.u * dn2.uprime);
    //System.out.println("Mult: " + op1 + " * " + op2 + " = " + result);
    return new DualNumber(multiplication, derivativeMultiplication);
  }

  @Override
  public String getOperation() {
    return op1.getOperation() + " * " + op2.getOperation();
  }

  @Override
  public void print() {
    System.out.print(getOperation());
  }

  /*public String toString() {
    return "(" + op1 + " * " + op2 + ")";
  }*/
}
