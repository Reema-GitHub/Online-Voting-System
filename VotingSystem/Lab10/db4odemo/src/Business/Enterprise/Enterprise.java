/*

* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Business.Enterprise;

import Business.Candidate.Candidate;
import Business.Candidate.CandidateDirectory;
import Business.Organization.Organization1;
import Business.Organization.OrganizationDirectory;

/**
*
* @author MyPC1
*/
public abstract class Enterprise extends Organization1{

   private EnterpriseType enterpriseType;
   private OrganizationDirectory organizationDirectory;

   public OrganizationDirectory getOrganizationDirectory() {
       return organizationDirectory;
   }

   public enum EnterpriseType{
       OnlineVotingSystem("OnlineVotingSystem");

       private String value;

       private EnterpriseType(String value){
           this.value=value;
       }
       public String getValue() {
           return value;
       }
       @Override
       public String toString(){
       return value;
   }
   }
   public EnterpriseType getEnterpriseType() {
       return enterpriseType;
   }

   public void setEnterpriseType(EnterpriseType enterpriseType) {
       this.enterpriseType = enterpriseType;
   }

   public Enterprise(String name,EnterpriseType type){
       super(name);
       this.enterpriseType=type;
       organizationDirectory=new OrganizationDirectory();
   }
}