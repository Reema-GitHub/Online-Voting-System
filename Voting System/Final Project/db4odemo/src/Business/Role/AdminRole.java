/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization1;
import Business.UserAccount.UserAccount;
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class AdminRole extends Role1{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization1 organization, Enterprise enterprise, EcoSystem system) {
         return new AdminWorkAreaJPanel(userProcessContainer, enterprise , system);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
