package lab5;
public class Calculator {
    public double calculate(double base){
        return Math.pow(base,2.0);
    }
    public double calculate(double num1, double num2){
        return num1 * num2;
    }
    public double calculate(double numOne, double numTwo, double numThree){
        return numOne*numTwo*numThree;
    }
}
