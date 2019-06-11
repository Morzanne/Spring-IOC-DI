package fr.wildcodeschool.thewizardproject.models;

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
