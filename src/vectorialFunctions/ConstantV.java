package vectorialFunctions;

public class ConstantV implements Function{
  private double value;

  public ConstantV(double value) {
    this.value = value;
  }

  public double calculate(){
    System.out.println("Constant = " + this.value);
    return this.value;
  }

  @Override
  public String toString() {

    return "" + value;
  }
}


