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
public class TravelAgency {
    private Airliner airliner;
    private AirlinerDirectory airDir;
    private FlightSchedule flightschedule;
    private FlightScheduleDirectory  FlightScheduleDirecrory;

    public FlightSchedule getFlightschedule() {
        return flightschedule;
    }

    public void setFlightschedule(FlightSchedule flightschedule) {
        this.flightschedule = flightschedule;
    }

    public FlightScheduleDirectory getFlightScheduleDirecrory() {
        return FlightScheduleDirecrory;
    }

    public void setFlightScheduleDirecrory(FlightScheduleDirectory FlightScheduleDirecrory) {
        this.FlightScheduleDirecrory = FlightScheduleDirecrory;
    }
    
    public TravelAgency()
    {
        this.airliner = airliner;
        this.airDir = airDir;
    }
     
    public Airliner getAirliner() {
        return airliner;
    }

    public void setAirliner(Airliner airliner) {
        this.airliner = airliner;
    }

    public AirlinerDirectory getAirDir() {
        return airDir;
    }

    public void setAirDir(AirlinerDirectory airDir) {
        this.airDir = airDir;
    }
   
    
}
