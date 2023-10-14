package vectorialFunctions;

public class Main {
  public static void main(String[] args) {

    Function piHalf = new ConstantV(3.141592/2.0);
    Function xx = new XV();
    Function cons = new ConstantV(2);
    Function pow2 = new Power(xx,cons);
    Function sum1 = new SumaV(piHalf, pow2);
    Function exp2 = new SinV(sum1);
    exp2.print();
    System.out.println(" x = " + xx.calculate(new DualNumber(4,1)));
    DualNumber result2 = exp2.calculate(new DualNumber(4,1));
    System.out.println("f(x) " + result2.u);
    System.out.println("f'(x) " + result2.uprime);
  }
}
