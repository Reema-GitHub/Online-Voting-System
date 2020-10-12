/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Candidaterole;

import Business.Candidate.Candidate;
import Business.Candidate.CandidateDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CandidateOrganization;
import Business.Organization.Organization1;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.Locale;
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import userinterface.AdministrativeRole.ManageCandidateJPanel;
import userinterface.AdministrativeRole.ManageVoterJPanel;

/**
 *
 * @author Reema Mehta
 */
public class CreateCandidateJPanel extends javax.swing.JPanel {
private Candidate candidate;
private JPanel userProcessContainer;
private EcoSystem system;
private Pattern pattern;
private Matcher matcher;
private CandidateDirectory directory;
private Enterprise enterprise;
    /**
     * Creates new form CreateCandidateJPanel
     */

    public CreateCandidateJPanel(JPanel userProcessContainer,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
         this.system = system;
         this.directory = directory;
         this.enterprise = enterprise;
         //this.candidate= candidate;
            //populateComboBox();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
                    
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        SignupJbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 188, 183, 74));

        jLabel7.setText("EmailID:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 329, 105, 31));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 139, 183, -1));
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 333, 183, -1));
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 284, 183, -1));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 431, 183, -1));

        SignupJbtn.setText("Sign Up");
        SignupJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupJbtnActionPerformed(evt);
            }
        });
        add(SignupJbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 465, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("New Candidate Registration");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 13, 460, 45));

        jLabel2.setText("Party:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 86, 105, 31));

        jLabel3.setText("Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 135, 105, 31));

        jLabel4.setText("Address:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 184, 105, 31));

        jLabel8.setText("State ID:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 427, 105, 31));

        jLabel5.setText("Date of Birth");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 378, 105, 31));

        jLabel6.setText("Phone Number:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 105, 31));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Republic", "Democratic" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 95, 183, -1));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 190, -1));

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void SignupJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupJbtnActionPerformed
        // TODO add your handling code here:
     if ( jTextField2.getText().isEmpty() ||  jTextField3.getText().isEmpty() ||  jTextField4.getText().isEmpty()
      ||  jTextField5.getText().isEmpty() ||  jTextField7.getText().isEmpty())
       {
          JOptionPane.showMessageDialog(null,"Please Enter all the values","Warning",JOptionPane.WARNING_MESSAGE);
          return;
       }
   //regex for phone number and email id
   String PHNUMBER_PATTERN = "\\d{10}";
   String EmailID_PATTERN = "^[A-Za-z0-9]+(\\.[_A-Za-z0-9]+)*@" + "[_A-Za-z0-9]+(\\.[_A-Za-z0-9]+)*(\\.[_A-Za-z]{2,})$";
   String StateID_PATTERN = "^[A-Z][0-9]{8}";

   pattern = Pattern.compile(PHNUMBER_PATTERN);
   matcher = pattern.matcher(jTextField4.getText());
   if(!matcher.matches())
       {
            jTextField4.setBackground(Color.red);
           JOptionPane.showMessageDialog(null,"Please enter valid Phone number","Warning",JOptionPane.WARNING_MESSAGE);
          return;
       }

   pattern = Pattern.compile(EmailID_PATTERN);
   matcher = pattern.matcher(jTextField5.getText());
        if(!matcher.matches())
       {
            jTextField5.setBackground(Color.red);
           JOptionPane.showMessageDialog(null,"Please enter valid Email ID","Warning",JOptionPane.WARNING_MESSAGE);
          return;
       }

   pattern = Pattern.compile(StateID_PATTERN);
   matcher = pattern.matcher(jTextField7.getText());
   if(!matcher.matches())
       {
            jTextField7.setBackground(Color.red);
           JOptionPane.showMessageDialog(null,"Please enter valid State ID","Warning",JOptionPane.WARNING_MESSAGE);
          return;
       }
  
   
       Candidate candidate = system.getCandidateDirectory().createCandidate();
       SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.getDefault());
       jDateChooser1.setDateFormatString("MM/dd/yyyy");
       candidate.setParty(jComboBox1.getSelectedItem().toString());
        candidate.setName(jTextField2.getText());
        candidate.setAddress(jTextField3.getText());
        candidate.setPhoneNumber(jTextField4.getText());
        candidate.setEmailid(jTextField5.getText());
        candidate.setDOB(sdf.format(jDateChooser1.getDate()));
        candidate.setPpnumber(jTextField7.getText());
        candidate.setApproved(false);
        
        JOptionPane.showMessageDialog(this,"Candidate Details updated successfully","Information" ,JOptionPane.INFORMATION_MESSAGE );
  
    }//GEN-LAST:event_SignupJbtnActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        /*Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length];
        BlankJPanel lwjp = (BlankJPanel) component;
        //lwjp.populateTable();*/
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignupJbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
