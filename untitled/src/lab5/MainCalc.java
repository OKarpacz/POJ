package lab5;

public class MainCalc {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        double resultOne = calculator.calculate(5);
        System.out.println("First result: " + resultOne);
        double resultTwo = calculator.calculate(4,3);
        System.out.println("Second result: " + resultTwo);
        double resultThree = calculator.calculate(1,2,3);
        System.out.println("Third result: " + resultThree);
    }
}
