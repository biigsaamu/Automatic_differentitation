package vectorialFunctions;

public class SumaV extends BinaryOperatorV{
  public SumaV(Function op1, Function op2) {
    super(op1,op2);
  }

  @Override
  public DualNumber calculate(DualNumber dn) {
    DualNumber dn1 = op1.calculate(dn);
    DualNumber dn2 = op2.calculate(dn);
    // f(x)
    double add = dn1.u + dn2.u;
    // f'(x)
    double derivativeAdd = dn1.uprime + dn2.uprime;
    //System.out.println("Suma: " + op1 + " + " + op2 + " = " + result);
    return new DualNumber(add, derivativeAdd);
  }
  public String toString() {
    return "(" + op1 + " + " + op2 + ")";
  }
}
