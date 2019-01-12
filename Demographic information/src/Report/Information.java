/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Report;

/**
 *
 * @author gadep
 */
public class Information {
    
    private AddressInformation address;
    private CheckingAccountInformation checkingaccountinformation;
    private DempgraphicInformation demographicinformation;
    private DriversLicenseInformation driverslicenseinformation;
    private MedicalRecord medicalrecord;
    private SavingAccountInformation savingaccountinformation;
    
    
    
    
   public Information()
    {
        this.demographicinformation = new DempgraphicInformation();
        this.checkingaccountinformation = new CheckingAccountInformation();
        this.driverslicenseinformation = new DriversLicenseInformation();
        this.medicalrecord = new MedicalRecord();
        this.checkingaccountinformation = new CheckingAccountInformation();
        this.savingaccountinformation = new SavingAccountInformation();
        this.address = new AddressInformation();
    }

    public AddressInformation getAddress() {
        return address;
    }

    public void setAddress(AddressInformation address) {
        this.address = address;
    }

    public CheckingAccountInformation getCheckingaccountinformation() {
        return checkingaccountinformation;
    }

    public void setCheckingaccountinformation(CheckingAccountInformation checkingaccountinformation) {
        this.checkingaccountinformation = checkingaccountinformation;
    }

    public DempgraphicInformation getDemographicinformation() {
        return demographicinformation;
    }

    public void setDemographicinformation(DempgraphicInformation demographicinformation) {
        this.demographicinformation = demographicinformation;
    }

    public DriversLicenseInformation getDriverslicenseinformation() {
        return driverslicenseinformation;
    }

    public void setDriverslicenseinformation(DriversLicenseInformation driverslicenseinformation) {
        this.driverslicenseinformation = driverslicenseinformation;
    }

    public MedicalRecord getMedicalrecord() {
        return medicalrecord;
    }

    public void setMedicalrecord(MedicalRecord medicalrecord) {
        this.medicalrecord = medicalrecord;
    }

    public SavingAccountInformation getSavingaccountinformation() {
        return savingaccountinformation;
    }

    public void setSavingaccountinformation(SavingAccountInformation savingaccountinformation) {
        this.savingaccountinformation = savingaccountinformation;
    }
    
   
}