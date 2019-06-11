package fr.wildcodeschool.thewizardproject.controllers;

import fr.wildcodeschool.thewizardproject.models.Dumbledore;
import fr.wildcodeschool.thewizardproject.models.WizardInterface;
import fr.wildcodeschool.thewizardproject.models.dress;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

  public void start(){
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
    WizardInterface myDumb = context.getBean("theDress", WizardInterface.class);
    System.out.println("");
    System.out.println("******************");
    System.out.println(myDumb.changeDress());
    System.out.println(myDumb.giveAdvice());
    System.out.println("******************");

  }
}
