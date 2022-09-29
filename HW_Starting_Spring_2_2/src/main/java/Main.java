import models.Impl.CarHyundaiTucsonIml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**Домашнее задание 2
 * Задание 2
 * Создайте новый класс из любой предметной области с несколькими полями.
 * Некоторые поля должны быть заданы с помощью конструктора,
 * некоторые при помощи setter-метода,
 * а некоторые посредством init метода,
 * который вы должны указать при объявлении бина в конфигурации.
**/

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        CarHyundaiTucsonIml car = context.getBean("tucson", CarHyundaiTucsonIml.class);

        System.out.println("Заданы с помощью конструктора: марка двигателя-" + car.getEngine().getMarkEngine() + ", объем-" + car.getEngine().getVolumeEngine() + ", мощность-" + car.getEngine().getPowerEngine() + " л.с.");
        System.out.println("Заданы с помощью setter-метода: модель-" + car.getModel() + ", цена-" + car.getCena());
        System.out.println("Заданы с помощью init метода: марка-" + car.getMarka() + ", год выпуска-" + car.getYearOfBuild());

    }
}
