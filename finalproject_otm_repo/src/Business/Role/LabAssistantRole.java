/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Account.Account;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import userInterface.LabAssistantRole.LabWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Game of Threads
 */
public class LabAssistantRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel rightPanel, Account account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new LabWorkAreaJPanel(rightPanel, account, enterprise, business);
    }
}
