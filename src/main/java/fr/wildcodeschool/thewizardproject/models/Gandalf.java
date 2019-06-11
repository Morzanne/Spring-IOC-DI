package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("theDressed")
public class Gandalf implements WizardInterface {

  private dress dressed;

  public Gandalf(dress theDressed){
    dressed = theDressed;
  }

  @Override
  public String giveAdvice(){
    return "Run you fools";
  }

  @Override
  public String changeDress(){
    return this.dressed.changeDresse();
  }
}
