/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization1;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author Dimple
 */
public class SystemAdminRole extends Role1{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization1 organization, Enterprise enterprise, EcoSystem system) {
       return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
