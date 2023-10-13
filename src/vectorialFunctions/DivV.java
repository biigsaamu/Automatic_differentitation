package vectorialFunctions;

public class DivV extends BinaryOperatorV{
  public DivV(Function op1, Function op2) {
    super(op1,op2);
  }

  @Override
  public DualNumber calculate(DualNumber dn) {
    DualNumber dn1 = op1.calculate(dn);
    DualNumber dn2 = op2.calculate(dn);
    // f(x)
    double division =  dn1.u / dn2.u;
    //f'(x)
    double derivativeDivision = ((dn1.uprime * dn2.u) - (dn1.u * dn2.uprime)) / (dn2.u* dn2.u);
    //System.out.println("Div: " + op1 + " / " + op2 + " = " + result);
    return new DualNumber(division, derivativeDivision);
  }

  public String toString() {
    return "(" + op1 + " / " + op2 + ")";
  }
}
