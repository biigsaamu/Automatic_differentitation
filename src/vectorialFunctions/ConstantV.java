package vectorialFunctions;

public class ConstantV implements Function{
  private double value;

  public ConstantV(double value) {
    this.value = value;
  }

  public DualNumber calculate(DualNumber dn){
    System.out.println("Constant = " + this.value);
    return new DualNumber(this.value, 1.0);
  }

  @Override
  public String toString() {

    return "" + value;
  }
}


