/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.Role1;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class AdminOrganization extends Organization1{

    public AdminOrganization() {
        super(Organization1.Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role1> getSupportedRole() {
        ArrayList<Role1> roles = new ArrayList();
        roles.add(new AdminRole());
        return roles;
    }
    
}


