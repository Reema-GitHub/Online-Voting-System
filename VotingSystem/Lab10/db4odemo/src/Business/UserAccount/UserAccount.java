/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Candidate.Candidate;
import Business.Role.Role1;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author raunak
 */
public class UserAccount {

   private String username;
   private String password;
   private Candidate employee;
   private Role1 role;
   private WorkQueue workQueue;

   public UserAccount() {
       workQueue = new WorkQueue();
   }
   
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role1 getRole() {
        return role;
    }

    public void setEmployee(Candidate employee) {
        this.employee = employee;
    }

    public void setRole(Role1 role) {
        this.role = role;
    }

    public Candidate getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}