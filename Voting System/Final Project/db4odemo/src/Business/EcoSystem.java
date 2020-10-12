/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Organization.Organization1;
import Business.Role.Role1;
import Business.Role.AdminRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization1{
    private ArrayList<Network> networkList;
    private static EcoSystem business;
    private NetworkList networkList1;


   public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
     public Network addNetwork() {
        Network newNetwork = new Network();
        networkList.add(newNetwork);
        return newNetwork;
    }
     
     public void deleteUser(Network network){
        networkList.remove(network);
     }


    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
}

    
    @Override
    public ArrayList<Role1> getSupportedRole() {
        ArrayList<Role1> roleList=new ArrayList<Role1>();
        roleList.add(new AdminRole());
        return roleList;
    }
    public EcoSystem(){
        super(null);
       networkList =new ArrayList<Network>();
    }
    
    public NetworkList getNetworkList1() {
        return networkList1;
    }

    public void setUserdir(NetworkList networkList) {
        this.networkList1 = networkList;
    }

}
