/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Candidate.CandidateDirectory;
import Business.Role.Role1;
import Business.UserAccount.UserAccountDirectory;
import Business.Voter.VoterDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization1 {

   private String name;
   private WorkQueue workQueue;
   private CandidateDirectory candidateDirectory;
   private VoterDirectory voterDirectory;
   private UserAccountDirectory userAccountDirectory;
   private int organizationID;
   private static int counter=0;

   public enum Type{
       Admin("Admin Organization"), Candidate("Candidate Organization");
       private String value;
       private Type(String value) {
           this.value = value;
       }
       public String getValue() {
           return value;
       }
     
   }

   public Organization1(String name) {
       this.name = name;
       workQueue = new WorkQueue();
       candidateDirectory = new CandidateDirectory();
       voterDirectory = new VoterDirectory();
       userAccountDirectory = new UserAccountDirectory();
       organizationID = counter;
       ++counter;
   }

   public abstract ArrayList<Role1> getSupportedRole();

   public UserAccountDirectory getUserAccountDirectory() {
       return userAccountDirectory;
   }

   public int getOrganizationID() {
       return organizationID;
   }

   public CandidateDirectory getCandidateDirectory() {
        return candidateDirectory;
    }

   public VoterDirectory getVoterDirectory() {
        return voterDirectory;
    }

   public String getName() {
       return name;
   }

   public WorkQueue getWorkQueue() {
       return workQueue;
   }

   public void setName(String name) {
       this.name = name;
   }

   public void setWorkQueue(WorkQueue workQueue) {
       this.workQueue = workQueue;
   }

   @Override
   public String toString() {
       return name;
   }


}