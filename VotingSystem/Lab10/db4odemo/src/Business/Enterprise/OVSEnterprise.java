/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role1;
import java.util.ArrayList;

/**
 *
 * @author Aesha
 */
public class OVSEnterprise extends Enterprise{
     public OVSEnterprise(String name){
        super(name,Enterprise.EnterpriseType.OnlineVotingSystem);
    }
    @Override
    public ArrayList<Role1> getSupportedRole() {
        return null;
    }
    
}
