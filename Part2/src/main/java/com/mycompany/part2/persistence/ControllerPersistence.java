package com.mycompany.part2.persistence;

import com.mycompany.part2.models.Person;
import com.mycompany.part2.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControllerPersistence {
  
  PersonJpaController persoJPA = new PersonJpaController();
  
  public void createPerson(Person pers) {
      persoJPA.create(pers);
  }
  
  public void deletePerson(int id) {
      try {
          persoJPA.destroy(id);
      } catch (NonexistentEntityException ex) {
          Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  
  public List<Person> bringPeople () {
      return persoJPA.findPeopleEntities();
  }
  
  public void modifyPerson (Person pers) {
  
      try {
          persoJPA.edit(pers);
      } catch (Exception ex) {
          Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }