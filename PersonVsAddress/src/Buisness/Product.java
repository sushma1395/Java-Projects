/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness;

/**
 *
 * @author gadep
 */
public class Product {
    
   private Address localaddress;
   private Address workaddress;
   private Address sweethomeaddress;

    public Address getWorkaddress() {
        return workaddress;
    }

    public void setWorkaddress(Address workaddress) {
        this.workaddress = workaddress;
    }

    public Address getSweethomeaddress() {
        return sweethomeaddress;
    }

    public void setSweethomeaddress(Address sweethomeaddress) {
        this.sweethomeaddress = sweethomeaddress;
    }
   
   private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
  
   public Product()
   
   {
       this.localaddress = new Address();
       
       this.person = new Person();
       
       this.sweethomeaddress = new Address();
       
       this.workaddress = new Address();
   }

    public Address getLocaladdress() {
        return localaddress;
    }

    public void setLocaladdress(Address localaddress) {
        this.localaddress = localaddress;
    }

    
   
    
}
