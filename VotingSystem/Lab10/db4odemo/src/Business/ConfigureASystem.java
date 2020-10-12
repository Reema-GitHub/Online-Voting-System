package Business;

import Business.Candidate.Candidate;
import Business.Organization.Organization1;
import Business.Role.AdminRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        Organization1 organization;
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        //Candidate candidate = system.getCandidateDirectory().createCandidate("RRH");
        //Candidate candidate = system.getCandidateDirectory().createCandidate(null);
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("1", "1", new SystemAdminRole());
        UserAccount aa = system.getUserAccountDirectory().createUserAccount("2", "2", new AdminRole());
        return system;
    }
    
}
