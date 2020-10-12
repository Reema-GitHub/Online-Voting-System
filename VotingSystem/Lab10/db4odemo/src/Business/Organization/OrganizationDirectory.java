/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization1.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization1> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization1> getOrganizationList() {
        return organizationList;
    }
    
    public Organization1 createOrganization(Type type){
        Organization1 organization = null;
        
        if (type.getValue().equals(Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Candidate.getValue())){
            organization = new CandidateOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}