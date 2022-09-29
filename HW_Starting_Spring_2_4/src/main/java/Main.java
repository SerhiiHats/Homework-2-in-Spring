import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Домашнее задание 2
 * Задание 4
 * Создайте в XML-конфигурации бин Map, по аналогии с List из урока.
 **/

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        CarrencyCalculator calculator = ctx.getBean("calculator", CarrencyCalculator.class);

        for (Map.Entry<String, Double> stringDoubleEntry : calculator.getCurrencyRate().entrySet()) {
            System.out.println(stringDoubleEntry.getKey() + " 1 = " + stringDoubleEntry.getValue() + " " + calculator.getCodeNationalCurrency());
        }
        System.out.println("\n27 EURO = " + (27 * calculator.getCurrencyRate().get("EURO")) + " " + calculator.getCodeNationalCurrency());

    }
}
