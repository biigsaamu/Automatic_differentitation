package vectorialFunctions;

public class Power extends BinaryOperatorV{

  public Power(Function op1, Function op2){
    super(op1, op2);
  }
  @Override
  public DualNumber calculate(DualNumber dn){
    DualNumber dn1 = op1.calculate(dn);
    DualNumber dn2 = op2.calculate(dn);
    // f(x)
    double pow = Math.pow(dn1.u, dn2.u); // not sure about that maybe not binary op
    // f'(x)
    double derivativePow = dn2.u * Math.pow(dn1.u, (dn2.u-1)) * dn1.uprime;
    //System.out.println("Pow " + dn2.u + "*" + dn1.u + "^" + (dn2.u-1) + "* " + dn1.uprime);
    return new DualNumber(pow, derivativePow);
  }
  @Override
  public String getOperation() {
    return "Pow " + op1.getOperation() + "^" + op2.getOperation();
  }

  @Override
  public void print() {
    System.out.print(getOperation());
  }
  /*public String toString() {
    return "Pow " + op1 + "^" + op2;
  }*/

}
