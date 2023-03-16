package pro.calculator.newCalculator;

import org.springframework.stereotype.Service;

@Service
    public class CalculatorService {
    public String plus(int nunOne, int numTwo) {
        return nunOne + "+" + numTwo + " = " + (nunOne + numTwo);
    }

    public String minus(int numOne, int numTwo) {
        return numOne + " - " + numTwo + " = " + (numOne - numTwo);
    }

    public String multiply(int numOne, int numTwo) {
        return numOne + " * " + numTwo + " = " + (numOne * numTwo);
    }

    public String divide(int numOne, int numTwo) {
        return numOne + " / " + numTwo + " = " + (numOne / numTwo);
    }

}
