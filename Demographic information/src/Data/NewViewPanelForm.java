/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import Report.Information;
import Report.SavingAccountInformation;
import Report.MedicalRecord;
import Report.CheckingAccountInformation;
import Report.AddressInformation;
import Report.DempgraphicInformation;
import Report.DriversLicenseInformation;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

import javax.swing.JOptionPane;

/**
 *
 * @author gadep
 */
public class NewViewPanelForm extends javax.swing.JPanel {

    /**
     * Creates new form NewViewPanelForm
     */
    private Information information;
    private SavingAccountInformation savingaccountinformation;
    private MedicalRecord medicalrecordr;
    private CheckingAccountInformation checkingaccountinformation;
    private AddressInformation addressinformation;
    private DempgraphicInformation demographicinformation;
    private DriversLicenseInformation driverslicenseinformation;
    
    public NewViewPanelForm(Information information) //SavingAccountInformation  savingaccountinformation,MedicalRecord medicalrecordr,CheckingAccountInformation checkingaccountinformation,AddressInformation addressinformation,DempgraphicInformation demographicinformation,DriversLicenseInformation driverslicenseinformation ) 
     {
        initComponents();
        this.information= information;
        savingaccountinformation = information.getSavingaccountinformation();
        medicalrecordr = information.getMedicalrecord();
        checkingaccountinformation = information.getCheckingaccountinformation();
        addressinformation = information.getAddress();
        demographicinformation = information.getDemographicinformation();
        driverslicenseinformation = information.getDriverslicenseinformation();
       
        displayInformation();
    }
    private void displayInformation()
            {
        String informationFirstName = demographicinformation.getFirstName();
        txtFirstName.setText(informationFirstName);
        txtFirstName.setEnabled(false);
       
        
        String informationLastName = demographicinformation.getLastName();
        txtLastname.setText(informationLastName);
        txtLastname.setEnabled(false);
        
        String informationPhonenumber = demographicinformation.getPhoneNumber();
        txtPhonenumber.setText(informationPhonenumber);
        txtPhonenumber.setEnabled(false);
        
        String informationDOB = demographicinformation.getDob();
        txtDOB.setText(informationDOB);
        txtDOB.setEnabled(false);
        
        String informationAge = demographicinformation.getAge();
        txtAge.setText(informationAge);
        txtAge.setEnabled(false);
        
        String informationHeight = demographicinformation.getHeight();
        txtHeight.setText(informationHeight);
        txtHeight.setEnabled(false);
        
        String informationWeight = demographicinformation.getWeight();
        txtWeight.setText(informationWeight);
        txtWeight.setEnabled(false);
        
        String informationSSN = demographicinformation.getSSN();
        txtSSN.setText(informationSSN);
        txtSSN.setEnabled(false);
        
        String informationStreetAddress = addressinformation.getStreetAddress();
        txtstreetaddress.setText(informationStreetAddress);
        txtstreetaddress.setEnabled(false);
        
        String informationCity = addressinformation.getCity();
        txtCity.setText(informationCity);
        txtCity.setEnabled(false);
        
        String informationState = addressinformation.getState();
        txtState.setText(informationState);
        txtState.setEnabled(false);
        
        String informationZipCode= addressinformation.getZipCode();
        txtZipCode.setText(informationZipCode);
        txtZipCode.setEnabled(false);
        
        String informationBankName = savingaccountinformation.getBankName();
        jTextField1.setText(informationBankName);
        jTextField1.setEnabled(false);
        
        String informationBankAccountNumber = savingaccountinformation.getBankAccountnumber();
        txtBankAccountNumber.setText(informationBankAccountNumber);
        txtBankAccountNumber.setEnabled(false);
        
        String informationBankroutingnumber = savingaccountinformation.getBankRoutingnumber();
        txtBankRoutingNumber.setText(informationBankroutingnumber);
        txtBankRoutingNumber.setEnabled(false);
        
        String informationAccountBalance = savingaccountinformation.getAccountBalance();
        txtAccountBalance.setText(informationAccountBalance);
        txtAccountBalance.setEnabled(false);
        
        String informationLicensenumber = driverslicenseinformation.getLicenseNumber();
        txtLicensenumber.setText(informationLicensenumber);
        txtLicensenumber.setEnabled(false);
        
        String informationDatessued = driverslicenseinformation.getDateIssued();
        txtDateitwasissued.setText(informationDatessued);
        txtDateitwasissued.setEnabled(false);
        
        String informationDateexpired = driverslicenseinformation.getDateExpired();
        txtDateofexpiration.setText(informationDateexpired);
        txtDateofexpiration.setEnabled(false);
        
        
        String informationbloodtype = driverslicenseinformation.getBloodType();
        txtBloodtype.setText(informationbloodtype);
        txtBloodtype.setEnabled(false);
        
        
        ImageIcon img=new ImageIcon (new ImageIcon(information.getDriverslicenseinformation().getPicture()).getImage().getScaledInstance(200, 157, Image.SCALE_DEFAULT));
        txtPicture.setIcon(img);
        
    
        String informationBankname1 = checkingaccountinformation.getBankname1();
        jTextField2.setText(informationBankname1);
        jTextField2.setEnabled(false);
        
        String informationBankroutingnimber1 = checkingaccountinformation.getBankRoutingnumber1();
        txtBankRoutingNumber1.setText(informationBankroutingnimber1);
        txtBankRoutingNumber1.setEnabled(false);
        
        String informationBankAccountnumber1 = checkingaccountinformation.getBankAccountnumber1();
        txtBankAccountNumber1.setText(informationBankAccountnumber1);
        txtBankAccountNumber1.setEnabled(false);
        
        String informationaccountbalance1 = checkingaccountinformation.getAccountBalance1();
        txtAccountBalance1.setText(informationaccountbalance1);
        txtAccountBalance1.setEnabled(false);
        
        String informationMedicalrecordnumber = medicalrecordr.getMedicalRecordnumber();
        txtMedicalRecordNumber.setText(informationMedicalrecordnumber);
        txtMedicalRecordNumber.setEnabled(false);
        
        String informationsetAllergy1 = medicalrecordr.getAllergy1();
        txtAllergy1.setText(informationsetAllergy1);
        txtAllergy1.setEnabled(false);
        
        String informationsetAllergy2 = medicalrecordr.getAllergy2();
        txtAllergy2.setText(informationsetAllergy2);
        txtAllergy2.setEnabled(false);
        
        String informationsetAllergy3 = medicalrecordr.getAllergy3();
        txtAllergy3.setText(informationsetAllergy3);
        txtAllergy3.setEnabled(false);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddressPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtstreetaddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        DemographicinformationPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPhonenumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        AccountInformationPanel = new javax.swing.JPanel();
        txtBankName = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        BankRoutingNumber = new javax.swing.JLabel();
        BankAccountNumber = new javax.swing.JLabel();
        AccountBalance = new javax.swing.JLabel();
        txtBankRoutingNumber = new javax.swing.JTextField();
        txtBankAccountNumber = new javax.swing.JTextField();
        txtAccountBalance = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txtBankName1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        BankRoutingNumber1 = new javax.swing.JLabel();
        txtBankRoutingNumber1 = new javax.swing.JTextField();
        BankAccountNumber1 = new javax.swing.JLabel();
        txtBankAccountNumber1 = new javax.swing.JTextField();
        AccountBalance1 = new javax.swing.JLabel();
        txtAccountBalance1 = new javax.swing.JTextField();
        Driverslicenseinformation = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtLicensenumber = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtDateitwasissued = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtDateofexpiration = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtBloodtype = new javax.swing.JTextField();
        Picture = new javax.swing.JLabel();
        txtPicture = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtMedicalRecordNumber = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtAllergy1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtAllergy2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtAllergy3 = new javax.swing.JTextField();

        AddressPanel.setBackground(new java.awt.Color(255, 255, 255));
        AddressPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16), new java.awt.Color(255, 51, 51))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setText("Street Address");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setText("City");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel11.setText("State");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel12.setText("Zip Code");

        txtZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipCodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddressPanelLayout = new javax.swing.GroupLayout(AddressPanel);
        AddressPanel.setLayout(AddressPanelLayout);
        AddressPanelLayout.setHorizontalGroup(
            AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddressPanelLayout.createSequentialGroup()
                .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(103, 103, 103)
                .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCity)
                    .addComponent(txtstreetaddress)
                    .addComponent(txtState)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                .addGap(0, 99, Short.MAX_VALUE))
        );
        AddressPanelLayout.setVerticalGroup(
            AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddressPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtstreetaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddressPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11))
                    .addGroup(AddressPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddressPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel12))
                    .addGroup(AddressPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DemographicinformationPanel.setBackground(new java.awt.Color(255, 255, 255));
        DemographicinformationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Demographic Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16), new java.awt.Color(255, 51, 51))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setText("First Name");

        txtFirstName.setMaximumSize(new java.awt.Dimension(6, 26));
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setText("Last Name");

        txtLastname.setMaximumSize(new java.awt.Dimension(6, 26));
        txtLastname.setRequestFocusEnabled(false);
        txtLastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastnameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setText("Phone Number");

        txtPhonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhonenumberActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setText("Date of Birth");

        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setText("Age");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setText("Height");

        txtHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeightActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setText("Weight");

        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setText("SocialSecurityNumber");

        javax.swing.GroupLayout DemographicinformationPanelLayout = new javax.swing.GroupLayout(DemographicinformationPanel);
        DemographicinformationPanel.setLayout(DemographicinformationPanelLayout);
        DemographicinformationPanelLayout.setHorizontalGroup(
            DemographicinformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DemographicinformationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DemographicinformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DemographicinformationPanelLayout.createSequentialGroup()
                        .addGroup(DemographicinformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(DemographicinformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                            .addComponent(txtLastname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(DemographicinformationPanelLayout.createSequentialGroup()
                        .addGroup(DemographicinformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(DemographicinformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAge, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtHeight)
                            .addComponent(txtDOB, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPhonenumber, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(DemographicinformationPanelLayout.createSequentialGroup()
                        .addGroup(DemographicinformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(DemographicinformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtWeight, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                            .addComponent(txtSSN))))
                .addContainerGap())
        );
        DemographicinformationPanelLayout.setVerticalGroup(
            DemographicinformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DemographicinformationPanelLayout.createSequentialGroup()
                .addGroup(DemographicinformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DemographicinformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DemographicinformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPhonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DemographicinformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DemographicinformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DemographicinformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DemographicinformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DemographicinformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        AccountInformationPanel.setBackground(new java.awt.Color(255, 255, 255));
        AccountInformationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Saving account information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16), new java.awt.Color(255, 0, 0))); // NOI18N

        txtBankName.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txtBankName.setText("Bank Name");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        BankRoutingNumber.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        BankRoutingNumber.setText("Bank Routing Number");

        BankAccountNumber.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        BankAccountNumber.setText("Bank Account Number");

        AccountBalance.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        AccountBalance.setText("Account Balance");

        txtBankRoutingNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBankRoutingNumberActionPerformed(evt);
            }
        });

        txtAccountBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountBalanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AccountInformationPanelLayout = new javax.swing.GroupLayout(AccountInformationPanel);
        AccountInformationPanel.setLayout(AccountInformationPanelLayout);
        AccountInformationPanelLayout.setHorizontalGroup(
            AccountInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountInformationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AccountInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BankRoutingNumber)
                    .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BankAccountNumber)
                    .addComponent(AccountBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(AccountInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBankAccountNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                    .addComponent(txtAccountBalance)
                    .addComponent(txtBankRoutingNumber)
                    .addComponent(jTextField1))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        AccountInformationPanelLayout.setVerticalGroup(
            AccountInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountInformationPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(AccountInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBankName)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(AccountInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BankRoutingNumber)
                    .addComponent(txtBankRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AccountInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BankAccountNumber)
                    .addComponent(txtBankAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(AccountInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccountBalance)
                    .addComponent(txtAccountBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Checking account information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16), new java.awt.Color(255, 51, 51))); // NOI18N

        txtBankName1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txtBankName1.setText("Bank Name");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        BankRoutingNumber1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        BankRoutingNumber1.setText("Bank Routing Number");

        txtBankRoutingNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBankRoutingNumber1ActionPerformed(evt);
            }
        });

        BankAccountNumber1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        BankAccountNumber1.setText("Bank Account Number");

        AccountBalance1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        AccountBalance1.setText("Account Balance");

        txtAccountBalance1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountBalance1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BankRoutingNumber1)
                    .addComponent(BankAccountNumber1)
                    .addComponent(AccountBalance1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBankName1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(txtBankRoutingNumber1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(txtBankAccountNumber1)
                    .addComponent(txtAccountBalance1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBankName1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BankRoutingNumber1)
                    .addComponent(txtBankRoutingNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BankAccountNumber1)
                    .addComponent(txtBankAccountNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccountBalance1)
                    .addComponent(txtAccountBalance1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Driverslicenseinformation.setBackground(new java.awt.Color(255, 255, 255));
        Driverslicenseinformation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Driver’s license information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16), new java.awt.Color(255, 51, 51))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel13.setText("License number");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel14.setText("Date it was issued");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel15.setText("Date of expiration");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel16.setText("Blood type");

        Picture.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Picture.setText("Picture");

        javax.swing.GroupLayout DriverslicenseinformationLayout = new javax.swing.GroupLayout(Driverslicenseinformation);
        Driverslicenseinformation.setLayout(DriverslicenseinformationLayout);
        DriverslicenseinformationLayout.setHorizontalGroup(
            DriverslicenseinformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DriverslicenseinformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DriverslicenseinformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DriverslicenseinformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Picture))
                .addGap(54, 54, 54)
                .addGroup(DriverslicenseinformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLicensenumber, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(txtDateitwasissued)
                    .addComponent(txtDateofexpiration)
                    .addComponent(txtBloodtype)
                    .addComponent(txtPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        DriverslicenseinformationLayout.setVerticalGroup(
            DriverslicenseinformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DriverslicenseinformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DriverslicenseinformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtLicensenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DriverslicenseinformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(txtDateitwasissued, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DriverslicenseinformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtDateofexpiration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DriverslicenseinformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtBloodtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DriverslicenseinformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DriverslicenseinformationLayout.createSequentialGroup()
                        .addComponent(Picture)
                        .addContainerGap())
                    .addComponent(txtPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Medical Record", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16), new java.awt.Color(255, 51, 51))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel17.setText("Medical Record Number");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel19.setText("Allergy1");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel20.setText("Allergy2");

        txtAllergy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAllergy2ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel21.setText("Allergy3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(txtMedicalRecordNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAllergy1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAllergy2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAllergy3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtMedicalRecordNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtAllergy1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtAllergy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtAllergy3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AccountInformationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DemographicinformationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AddressPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Driverslicenseinformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DemographicinformationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddressPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Driverslicenseinformation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AccountInformationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtLastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastnameActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void txtBankRoutingNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBankRoutingNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBankRoutingNumberActionPerformed

    private void txtAccountBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountBalanceActionPerformed

    private void txtAllergy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAllergy2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAllergy2ActionPerformed

    private void txtPhonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhonenumberActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    private void txtHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeightActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void txtBankRoutingNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBankRoutingNumber1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBankRoutingNumber1ActionPerformed

    private void txtAccountBalance1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountBalance1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountBalance1ActionPerformed

    private void txtZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipCodeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountBalance;
    private javax.swing.JLabel AccountBalance1;
    private javax.swing.JPanel AccountInformationPanel;
    private javax.swing.JPanel AddressPanel;
    private javax.swing.JLabel BankAccountNumber;
    private javax.swing.JLabel BankAccountNumber1;
    private javax.swing.JLabel BankRoutingNumber;
    private javax.swing.JLabel BankRoutingNumber1;
    private javax.swing.JPanel DemographicinformationPanel;
    private javax.swing.JPanel Driverslicenseinformation;
    private javax.swing.JLabel Picture;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txtAccountBalance;
    private javax.swing.JTextField txtAccountBalance1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAllergy1;
    private javax.swing.JTextField txtAllergy2;
    private javax.swing.JTextField txtAllergy3;
    private javax.swing.JTextField txtBankAccountNumber;
    private javax.swing.JTextField txtBankAccountNumber1;
    private javax.swing.JLabel txtBankName;
    private javax.swing.JLabel txtBankName1;
    private javax.swing.JTextField txtBankRoutingNumber;
    private javax.swing.JTextField txtBankRoutingNumber1;
    private javax.swing.JTextField txtBloodtype;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtDateitwasissued;
    private javax.swing.JTextField txtDateofexpiration;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtLicensenumber;
    private javax.swing.JTextField txtMedicalRecordNumber;
    private javax.swing.JTextField txtPhonenumber;
    private javax.swing.JLabel txtPicture;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JTextField txtZipCode;
    private javax.swing.JTextField txtstreetaddress;
    // End of variables declaration//GEN-END:variables
}
