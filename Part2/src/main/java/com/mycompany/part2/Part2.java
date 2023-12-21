package com.mycompany.part2;

import com.mycompany.part2.models.Person;
import com.mycompany.part2.persistence.ControllerPersistence;


public class Part2 {

  public static void main(String[] args) {
      
      ControllerPersistence controller = new ControllerPersistence();
      
      Person pers = new Person(
              0, 
              "Andrea", 
              "andreagarciagonzalez22@gmail.com", 
              23);
 
    controller.createPerson(pers);
    controller.bringPeople();
    controller.deletePerson(1);
  }
}
