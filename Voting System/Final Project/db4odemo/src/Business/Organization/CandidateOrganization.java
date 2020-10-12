/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.CandidateRole;
import Business.Role.Role1;
import java.util.ArrayList;

/**
 *
 * @author Aesha
 */
public class CandidateOrganization extends Organization1 {
    
    
    public CandidateOrganization() {
        super(Organization1.Type.Candidate.getValue());
    }
    
    @Override
    public ArrayList<Role1> getSupportedRole() {
        ArrayList<Role1> roles = new ArrayList();
        roles.add(new CandidateRole());
        return roles;
    }
}
