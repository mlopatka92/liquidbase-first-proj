package pl.mlopatka.liquibase.animal;

import javax.persistence.*;

@Entity
@Table(name = "animals")
public class Animal {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   private String name;

   public void setName(String name) {
      this.name = name;
   }
}
