package fr.wildcodeschool.thewizardproject.models;


public class Dumbledore implements WizardInterface {

  private dress dressed;

  public Dumbledore(dress theDressed){

    dressed = theDressed;

  }

  @Override
  public String giveAdvice(){
    return "You do not need to ride Hagrid, Harry !";
  }

  @Override
  public String changeDress(){
    return this.dressed.changeDresse();
  }



}
