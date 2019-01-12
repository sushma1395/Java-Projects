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
public class VitalSignHistory {
    
    public VitalSignHistory()
    {
        VitalSignHistory = new ArrayList<VitalSigns>();
    }
    
    private ArrayList<VitalSigns>VitalSignHistory;

    public ArrayList<VitalSigns> getVitalSignHistory() {
        return VitalSignHistory;
    }
    
    /**
     *
     * @param maxbp
     * @param minbp
     * @return
     */
    public List<VitalSigns> getAbnormalList(double maxbp , double minbp)
   {
        List<VitalSigns> abnList = new ArrayList <>();
        for(VitalSigns vs:VitalSignHistory)
        {
           if(vs.getBloodPressure()> maxbp || vs.getBloodPressure()< minbp)
           {
               abnList.add(vs);
           }
           
        }
           
           return abnList;
            
        }
   
    
    public void setVitalSignHistory(ArrayList<VitalSigns> VitalSignHistory) {
        this.VitalSignHistory = VitalSignHistory;
    }
    
    public VitalSigns addVitals()
    {
        VitalSigns vs = new VitalSigns();   
        VitalSignHistory.add(vs);
        return vs;
    }
    
    public void deleteVitals(VitalSigns v)
    {
      VitalSignHistory.remove(v);
    }
}
    



        
        
    
