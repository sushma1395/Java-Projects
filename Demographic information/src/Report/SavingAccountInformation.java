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
public class SavingAccountInformation {
    
    private String bankName;
    private String bankRoutingnumber;
    private String bankAccountnumber;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankRoutingnumber() {
        return bankRoutingnumber;
    }

    public void setBankRoutingnumber(String bankRoutingnumber) {
        this.bankRoutingnumber = bankRoutingnumber;
    }

    public String getBankAccountnumber() {
        return bankAccountnumber;
    }

    public void setBankAccountnumber(String bankAccountnumber) {
        this.bankAccountnumber = bankAccountnumber;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    private String accountBalance;
    private String accountType;
    
}
