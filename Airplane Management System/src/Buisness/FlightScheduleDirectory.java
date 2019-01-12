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
public class FlightScheduleDirectory {
    
    private ArrayList<FlightSchedule> airlinerDirectory;
    private FlightSchedule flightschedule;

    public FlightSchedule getFlightschedule() {
        return flightschedule;
    }

    public void setFlightschedule(FlightSchedule flightschedule) {
        this.flightschedule = flightschedule;
    }

    public AirlinerDirectory getAirDir() {
        return airDir;
    }

    public void setAirDir(AirlinerDirectory airDir) {
        this.airDir = airDir;
    }
    private AirlinerDirectory airDir;

    public ArrayList<FlightSchedule> getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(ArrayList<FlightSchedule> airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }
    
    public FlightScheduleDirectory(){
        this.airlinerDirectory = new ArrayList<FlightSchedule>();
    }
    
     
    
 public List<FlightSchedule> getSDListS()
 {
     return airlinerDirectory;
 }
      public List<FlightSchedule> getSDList(String  Source , String  destination)
   {
        List<FlightSchedule> abnList = new ArrayList <>();
        for(FlightSchedule vs:airlinerDirectory)
        {
           if(vs.getFrom().equalsIgnoreCase(Source) && vs.getTo().equalsIgnoreCase(destination))
           {
               abnList.add(vs);
           }
           
        }
           
           return abnList;
            
        }
   
        public FlightSchedule addProduct(){
        FlightSchedule newProduct = new FlightSchedule();
        airlinerDirectory.add(newProduct);
        return newProduct;
    }
    
    public void deleteProduct(Airliner product){
        airlinerDirectory.remove(product);
    }
    
    /*public Airliner searchAccount(String name){
        for(FlightSchedule airliner : this.airlinerDirectory){
            if(airliner.getFrom().equalsIgnoreCase(name)){
                return airliner;
            }
        }
        return null;
    }*/
    
}
