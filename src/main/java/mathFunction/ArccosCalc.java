package mathFunction;

public class ArccosCalc {

    public double arccos(double x) throws ArithmeticException{
        int i= 0;
        double p = x;
        double s = x;
        double accurancy = 1e-4D;
        while (p > accurancy) {
            p *= ((x*x*(2*i + 1)*(2*i + 1))/(2*(i+1)*(2*i + 3)));
            s+=p;
            i++;
        }
        double value = Math.PI/ 2  - s;
        if (value < -1) return -1;
        if (value > 1) return 1;
        if (Double.isNaN(value) || Double.isInfinite(value)) {
            throw  new ArithmeticException("Big number");
        }
        return value;
    }
}
