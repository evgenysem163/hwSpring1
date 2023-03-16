package pro.calculator.newCalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
//    @RequestMapping(path = "/calculator")

    @GetMapping(path ="/calculator")
    public String hello() {
        return " Добро пожаловать в калькулятор ";
    }

    @GetMapping(path ="/calculator/plus")
    public String plus(@RequestParam ("num1") String numOne, @RequestParam ("num2") String numTwo) {
        return calculatorService.plus(Integer.parseInt(numOne), Integer.parseInt(numTwo));
    }
//    public String plus(@RequestParam (required = false)String numOne, @RequestParam (required = false)String numTwo) {
//        if(numOne == null|| numTwo==null||numOne.isEmpty()||numTwo.isEmpty()){
//            return "Введите два параметра";
//        }
//        return calculatorService.plus(Integer.parseInt(numOne), Integer.parseInt(numTwo));
//    }
    @GetMapping(path ="/calculator/minus")
    public String minus (@RequestParam ("num1") String numOne, @RequestParam ("num2") String numTwo){
        return calculatorService.minus(Integer.parseInt(numOne), Integer.parseInt(numTwo));
    }
    @GetMapping( path = "/calculator/multiply")
    public String multiply (@RequestParam ("num1") String nunOne, @RequestParam ("num2") String numTwo){
        return calculatorService.multiply(Integer.parseInt(nunOne), Integer.parseInt(numTwo));
    }
    @GetMapping(path =  "/calculator/divide")
    public String divide( @RequestParam ("num1") String numOne, @RequestParam ("num2") String numTwo){
        return calculatorService.divide(Integer.parseInt(numOne), Integer.parseInt(numTwo));
    }


}
