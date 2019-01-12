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
public class AirlinerDirectory {
    
      private ArrayList<Airliner> airlinerDirectory;
      private FlightScheduleDirectory flightDir;
      private FlightSchedule FlightSchedule;

    public ArrayList<Airliner> getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(ArrayList<Airliner> airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }

    public FlightScheduleDirectory getFlightDir() {
        return flightDir;
    }

    public void setFlightDir(FlightScheduleDirectory flightDir) {
        this.flightDir = flightDir;
    }

    public FlightSchedule getFlightSchedule() {
        return FlightSchedule;
    }

    public void setFlightSchedule(FlightSchedule FlightSchedule) {
        this.FlightSchedule = FlightSchedule;
    }
      
    
    public AirlinerDirectory(){
        this.airlinerDirectory = new ArrayList<Airliner>();
    }

    public ArrayList<Airliner> getProductDirectory() {
        return airlinerDirectory;
    }

    public void setProductDirectory(ArrayList<Airliner> productDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }
    
        public Airliner addProduct(){
        Airliner newProduct = new Airliner();
        airlinerDirectory.add(newProduct);
        return newProduct;
    }
        
      
    
    public void deleteProduct(Airliner product){
        airlinerDirectory.remove(product);
    }
    
    public Airliner searchAccount(String name){
        for(Airliner airliner : this.airlinerDirectory){
            if(airliner.getAirlineName().equalsIgnoreCase(name)){
                return airliner;
            }
        }
        return null;
    }
}
    


