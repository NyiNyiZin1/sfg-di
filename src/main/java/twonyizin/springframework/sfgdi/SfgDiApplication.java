package twonyizin.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import twonyizin.springframework.sfgdi.controllers.*;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.err.println(i18nController.sayHello());

		System.err.println("------Primary Bean");
		MyController myController= (MyController) ctx.getBean("myController");
		System.err.println(myController.sayHello());

		System.err.println("-------Property");
		PropertyInjectedController propertyInjectedController=(PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.err.println(propertyInjectedController.getGreeting());

		System.err.println("-------Setter");
		SetterInjectedController setterInjectedController=(SetterInjectedController)ctx.getBean("setterInjectedController");
		System.err.println(setterInjectedController.getGreeting());

		System.err.println("-------Constructor");
		ConstructoriInjectedController constructoriInjectedController=(ConstructoriInjectedController)ctx.getBean("constructoriInjectedController");
		System.err.println(constructoriInjectedController.getGreeting());
	}

}
