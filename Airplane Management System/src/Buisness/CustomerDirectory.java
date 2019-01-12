/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gadep
 */
 
    public class CustomerDirectory {
    
      private ArrayList<Customer> customerDirectory;
    
    public CustomerDirectory(){
        this.customerDirectory = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getProductDirectory() {
        return customerDirectory;
    }

    public void setProductDirectory(ArrayList<Customer> productDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
        public Customer addProduct(){
        Customer newProduct = new Customer();
        customerDirectory.add(newProduct);
        return newProduct;
    }
        
      /*  public List<Customer> getSDList(String  Source , String  destination)
   {
        List<Customer> abnList = new ArrayList <>();
        for(Customer vs:customerDirectory)
        {
           if(vs.getFrom().equalsIgnoreCase(Source) && vs.getTo().equalsIgnoreCase(destination))
           {
               abnList.add(vs);
           }
           
        }*/
           
         //  return abnList;
            
       // }
    
    public void deleteProduct(Airliner product){
        customerDirectory.remove(product);
    }
    
    public Customer searchAccount(String name){
        for(Customer Customer : this.customerDirectory){
            if(Customer.getFirstName().equalsIgnoreCase(name)){
                return Customer;
            }
        }
        return null;
    }
    }
    

