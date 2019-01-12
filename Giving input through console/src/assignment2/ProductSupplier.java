/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author gadep
 */
public class ProductSupplier {
    
    private String name;
    private double price;
    private int availNum;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAvailNum() {
        return availNum;
    }

    public void setAvailNum(int availNum) {
        this.availNum = availNum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    private Supplier supplier;

  
   
    
  public ProductSupplier()
          
  {
    this.supplier = new Supplier();
  }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

  

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

   
}
