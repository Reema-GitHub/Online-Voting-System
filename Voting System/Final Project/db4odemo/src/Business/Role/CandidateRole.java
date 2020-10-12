/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CandidateOrganization;
import Business.Organization.Organization1;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Candidaterole.CandidateWorkAreaJPanel;

/**
 *
 * @author Aesha
 */
public class CandidateRole extends Role1{
    
        @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization1 organization, Enterprise enterprise, EcoSystem business) {
        return new CandidateWorkAreaJPanel(userProcessContainer, account, (CandidateOrganization)organization, enterprise);
    
}
}
