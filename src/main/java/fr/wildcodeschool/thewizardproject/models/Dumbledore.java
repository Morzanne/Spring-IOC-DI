package fr.wildcodeschool.thewizardproject.models;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("theDress")
public class Dumbledore implements WizardInterface {

  private dress dressed;

  @Autowired
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
