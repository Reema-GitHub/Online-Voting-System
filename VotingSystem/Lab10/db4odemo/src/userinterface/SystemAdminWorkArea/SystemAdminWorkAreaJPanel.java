

package userinterface.SystemAdminWorkArea;

import userinterface.AdministrativeRole.ManageOrganizationJPanel;
import userinterface.AdministrativeRole.*;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Business.EcoSystem;
import Business.Network.Network;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultTreeModel;
import Business.DB4OUtil.DB4OUtil;
import Business.Role.Role1;
/**
 *
 * @author  raunak
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem ecosystem;
    DB4OUtil db4;
    

    /** Creates new form AdminWorkAreaJPanel */
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem system) {
        initComponents();
        this.db4 = DB4OUtil.getInstance();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        //this.ecosystem = db4.retrieveSystem();
        this.ecosystem = system;
       //this.enterprise = new Enterprise("OVS", Enterprise.EnterpriseType.OnlineVotingSystem) {
        //populateTree();
        //valueLabel.setText(enterprise.getName());   
    }
    
    
    
    /*public void populateTree(){
       DefaultTreeModel model=(DefaultTreeModel)jTree.getModel();
       ArrayList<Network> networkList=ecosystem.getNetworkList();
       ArrayList<Enterprise> enterpriseList;
       ArrayList<Organization> organizationList;

       Network network;
       Enterprise enterprise;
       Organization organization;

       DefaultMutableTreeNode networks=new DefaultMutableTreeNode("Networks");
       DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
       root.removeAllChildren();
       root.insert(networks, 0);

       DefaultMutableTreeNode networkNode;
       DefaultMutableTreeNode enterpriseNode;
       DefaultMutableTreeNode organizationNode;

       for(int i=0;i<networkList.size();i++){
           network=networkList.get(i);
           networkNode=new DefaultMutableTreeNode(network.getName());
           networks.insert(networkNode, i);

           enterpriseList=network.getEnterpriseDirectory().getEnterpriseList();
           for(int j=0; j<enterpriseList.size();j++){
               enterprise=enterpriseList.get(j);
               enterpriseNode=new DefaultMutableTreeNode(enterprise.getName());
               networkNode.insert(enterpriseNode, j);

               organizationList=enterprise.getOrganizationDirectory().getOrganizationList();
               for(int k=0;k<organizationList.size();k++){
                   organization=organizationList.get(i);
                   organizationNode=new DefaultMutableTreeNode(organization.getName());
                   enterpriseNode.insert(organizationNode, k);
               }
           }
       }
       model.reload();
   }*/
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        networkbtn = new javax.swing.JButton();
        Enterprisebtn = new javax.swing.JButton();
        manageadminbtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Adminstrative Role");

        networkbtn.setText("Manage Networks");
        networkbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkbtnActionPerformed(evt);
            }
        });

        Enterprisebtn.setText("Manage Enterprise");
        Enterprisebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterprisebtnActionPerformed(evt);
            }
        });

        manageadminbtn.setText("Manage Admin");
        manageadminbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageadminbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Enterprisebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(networkbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageadminbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(71, 71, 71)
                .addComponent(networkbtn)
                .addGap(18, 18, 18)
                .addComponent(Enterprisebtn)
                .addGap(18, 18, 18)
                .addComponent(manageadminbtn)
                .addContainerGap(109, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void networkbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkbtnActionPerformed
        // TODO add your handling code here:
        ManageNetworkJPanel manageNetworkJPanel=new ManageNetworkJPanel(userProcessContainer, ecosystem);
       userProcessContainer.add("manageNetworkJPanel",manageNetworkJPanel);
       CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_networkbtnActionPerformed

    private void EnterprisebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterprisebtnActionPerformed
        // TODO add your handling code here:
       ManageEnterpriseJPanel manageenterpriseJPanel=new ManageEnterpriseJPanel(userProcessContainer, ecosystem);
       userProcessContainer.add("manageEnterpriseJPanel",manageenterpriseJPanel);
       CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);    
    }//GEN-LAST:event_EnterprisebtnActionPerformed

    private void manageadminbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageadminbtnActionPerformed
        // TODO add your handling code here:
         AdminWorkAreaJPanel adminworkAreaJPanel=new AdminWorkAreaJPanel(userProcessContainer, enterprise , ecosystem);
       userProcessContainer.add("manageEnterpriseJPanel",adminworkAreaJPanel);
       CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);  
        
    }//GEN-LAST:event_manageadminbtnActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enterprisebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageadminbtn;
    private javax.swing.JButton networkbtn;
    // End of variables declaration//GEN-END:variables
    
}