package assignment2;

 
import java.io.*;
import java.util.*;
import assignment2.Assignment2;
import assignment2.ProductSupplier;
import assignment2.Supplier;
 
public class Assignment2 
{
        @SuppressWarnings("empty-statement")
        public static void main(String[] args)
   {
        Supplier supplier = new Supplier() ;
        ProductSupplier productsupplier = new ProductSupplier();
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();
        productsupplier.setName(name);
      
        String answer;
        boolean yn;
        System.out.print("Enter the price: ");
        double price = 0.0;// = scanner.nextDouble();
        do{
        try {
            
              price = scanner.nextDouble();
             productsupplier.setPrice(price);
            
        } catch (InputMismatchException exception) {
           //exception.printStackTrace();
             
             System.out.println("Enter valid Price");
             //Scanner input = new Scanner(System.in);
             //price = input.nextInt();
        }
        }while(!(scanner.nextLine()).isEmpty());
             //scanner.nextLine();
             
             
      
        System.out.print("Enter the description: ");
        String description = scanner.nextLine();
        productsupplier.setDescription(description);
     
        System.out.print("Enter the details of supplierwarehouse1: ");
        String supplierWarehouse1 = scanner.nextLine();
        supplier.setSupplierWarehouse1(supplierWarehouse1);
      
        System.out.print("Enter the availability number: ");
        
        //Update
        int availnum = 0 ;
        do{
            try {
            
              availnum = scanner.nextInt();
             productsupplier.setAvailNum(availnum);
            
        } catch (InputMismatchException exception) {
           //exception.printStackTrace();
             
             System.out.println("Enter valid Availability number: ");
             //Scanner input = new Scanner(System.in);
             //availnum = input.nextInt();
            
        }}while(!(scanner.nextLine()).isEmpty());
      
        //scanner.nextLine();
        
        System.out.print("Enter the details of Supplier Warehouse 2: ");
        String supplierWarehouse2 = scanner.nextLine();
        supplier.setSupplierWarehouse2(supplierWarehouse2);
       
       
        System.out.print("Enter the details of Supplier Warehouse City: ");
        String supplierWarehouseCity = scanner.nextLine();
        supplier.setSupplierWarehouseCity(supplierWarehouseCity);
       
        System.out.print("Enter the details of Supplier Head Quarters:"
                + " ");
        String supplierheadquarters = scanner.nextLine();
        supplier.setSupplierWarehouseHeadQuarters(supplierheadquarters);
        
        
        System.out.println("Complete product details are");
        System.out.println("The name is: " + name);
        System.out.println("The price is: " + price);   
        System.out.println("the description is: " + description);
        System.out.println("The details of supplierwarehouse1 are: " + supplierWarehouse1);
        System.out.println("The availability number is: " + availnum);
        System.out.println("The details of supplierwarehouse2 are: " + supplierWarehouse2);
        System.out.println("The details of supplier warehouse city are: " + supplierWarehouseCity);
        System.out.println("The details of Supplier Head Quarters are: " + supplierheadquarters);
        
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Do you want the product to be updated?(y/n)");
        String response = scanner.next();
         if (!"y".equalsIgnoreCase(response) && "n".equalsIgnoreCase(response)) {
            System.out.println("\n You do not want to update the product,Here are your Details : "  +  ".");
            System.out.println("The name is: " + name);
            System.out.println("The price is: " + price);   
            System.out.println("the description is: " + description);
            System.out.println("The details of supplierwarehouse1 are: " + supplierWarehouse1);
            System.out.println("The availability number is: " + availnum);
            System.out.println("The details of supplierwarehouse2 are: " + supplierWarehouse2);
            System.out.println("The details of supplier warehouse city are: " + supplierWarehouseCity);
            System.out.println("The details of Supplier Head Quarters are: " + supplierheadquarters);
            //response = scanner.nextLine();
            System.out.println("-----------------------------------------------------------------------------------");
            System.exit(0);
           
        } 
         
        else if ("y".equalsIgnoreCase(response)) {
            
            System.out.println(" \n  Great! Let's get started with updating your product ");
            
        }
         
         //scanner.nextLine();
        int choice;
       
        do{
                System.out.println(" ***********Update your Product************* ");

                  System.out.println(" ***Please Choose Your Options*** \n 5. Update Product Name \n 6. Update Product Price \n 7. Description \n 8. Supplier warehouse1"
                          + "\n 9. Availability number\n 10. Supplier warehouse 2"
                          + "\n 11. Supplier warehouse 3 "
                          + "\n 12. Supplier head quarters " + "\n 13. Exit" );

                  choice = scanner.nextInt();
                  scanner.nextLine();
                  switch(choice){
                    case 5:
                        System.out.println(" Update Product Name: ");
                        name = scanner.nextLine();
                        productsupplier.setName(name);
                    break;
              
                  case 6:
                   System.out.print("Enter the updated price: ");
                   do{
                   try {
                   price = scanner.nextDouble();
                   productsupplier.setPrice(price);
                   } catch (InputMismatchException exception) {
           
                   System.out.println("Enter valid Price: ");
             
                   }}while(!(scanner.nextLine()).isEmpty());
                   break; 
                    case 7:
                     System.out.println("Enter the updated details of description: ");
                     description = scanner.nextLine();
                     productsupplier.setDescription(description);
                    break;
                    
                    case 8:
                    System.out.println("Enter the updated details of supplierwarehouse1: ");
                    supplierWarehouse1 = scanner.nextLine();
                    supplier.setSupplierWarehouse1(supplierWarehouse1);
                    break; 
        
        case 9:
        System.out.println("Enter the updated availability number: ");       
         do{
             try {
            
              availnum = scanner.nextInt();
             productsupplier.setAvailNum(availnum);
            
        } catch (InputMismatchException exception) {
           //exception.printStackTrace();
             
             System.out.println("Enter valid availability number: ");
            
        } }while(!(scanner.nextLine()).isEmpty());
       break;
        case 10:
        
        System.out.println("Enter the updated details of supplierwarehouse2: ");
        supplierWarehouse2 = scanner.next();
        supplier.setSupplierWarehouse2(supplierWarehouse2);
        scanner.nextLine();
        break;
        case 11:
        System.out.println("Enter the updated details of supplierwarehouse3: ");
        supplierWarehouseCity = scanner.nextLine();
        supplier.setSupplierWarehouseCity(supplierWarehouseCity);
        break;
        
        case 12:
        
            System.out.println("Enter the updated details of supplier head quarters: ");
        supplierheadquarters = scanner.nextLine();
        supplier.setSupplierWarehouseHeadQuarters(supplierheadquarters); 
        break;
            
        case 13:
        // System.out.println("no update ");
        System.out.println("The updated name is: " + name);
        System.out.println("The updated product price is: " + price);
        System.out.println("The updated description is: " + description);
        System.out.println("The updated details of supplierwarehouse1 is: " + supplierWarehouse1);
        System.out.println("The updated availability nymber is: " + availnum);
        System.out.println("The updated details of supplierwarehouse2 is: " + supplierWarehouse2);
        System.out.println("The updated details of supplierwarehouse3 is: " + supplierWarehouseCity);
        System.out.println("The updated details of supplier head quarters is: " + supplierheadquarters);
        System.out.println("-----------------------------------------------------------------------------------");
         
        break;
        
         default: System.out.println("Wrong Choice");
        }}while(choice!= 13);
      
}
}
     

        


