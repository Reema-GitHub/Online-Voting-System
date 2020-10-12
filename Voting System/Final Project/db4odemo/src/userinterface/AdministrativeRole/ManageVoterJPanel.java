/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.EcoSystem;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.*;
import Business.Voter.Voter;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization1;
import java.util.*; 
import javax.mail.*; 
import javax.mail.internet.*; 
import javax.activation.*; 
import javax.mail.Session; 
import javax.mail.Transport;
import com.sun.mail.smtp.SMTPTransport;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import javax.swing.JOptionPane;
import userinterface.Voterrole.ViewVoterDetailsJPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author Aesha
 */
public class ManageVoterJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem system;
    Organization1 organization;
    int count = 0;
    int count_table = 0;
    /**
     * Creates new form ManageVoterJPanel
     */
    
    ManageVoterJPanel(JPanel userProcessContainer, EcoSystem system) {
      initComponents();
          this.userProcessContainer = userProcessContainer;
          this.system = DB4OUtil.getInstance().retrieveSystem();
          //this.system = system;
          this.organization=organization;
         populatevoter();
         populateexist(); 
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void populatevoter(){
        
        DefaultTableModel dtm = (DefaultTableModel)NewvoterJTable.getModel();
       dtm.setRowCount(0);
       for (Voter voter : system.getVoterDirectory().getVoterList()){
          if(!voter.isApproved()){
           Object[] row = new Object[dtm.getColumnCount()];
           //row[0]=voter;
                    row[0]=voter.getName();
                    row[1]=voter.getParty();
                    row[2]=voter.getEmailid();
                    row[3]=voter.getPpnumber();
          
           dtm.addRow(row);
          }
       }
    }
    public void populateexist(){
       DefaultTableModel dtm = (DefaultTableModel)ExistvoterJTable.getModel();
       dtm.setRowCount(0);
       for(Voter voter : system.getVoterDirectory().getVoterList()){
           if(voter.isApproved()){
                Object[] row = new Object[dtm.getColumnCount()];
                    row[0]=voter.getName();
                    row[1]=voter.getParty();
                    row[2]=voter.getEmailid();
                    row[3]=voter.getPpnumber();

                    dtm.addRow(row);}
       }
    }
   public class SendMail 
{

    public void send(String to, String sub,String msg, final String user, final String pass) 
    {
        Properties props = new Properties();

        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");	
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        
        Session session = Session.getDefaultInstance(props,new Authenticator() 
        {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() 
            {
                return new PasswordAuthentication(user, pass);
            }
        });

        try 
        {
            Message message = new MimeMessage(session);
            
            message.setFrom(new InternetAddress(user));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(sub);
            message.setText(msg);

            Transport.send(message);
            
            JOptionPane.showMessageDialog(null,"Email sended!");
            
        } catch (MessagingException e) 
        {
            JOptionPane.showMessageDialog(null,"Something happened!");
            
            throw new RuntimeException(e);
        }
        
    }
}

       public class PasswordGenerator {

        SecureRandom random = new SecureRandom();

        /** different dictionaries used */
        private static final String ALPHA_CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        private static final String ALPHA = "abcdefghijklmnopqrstuvwxyz";
        private static final String NUMERIC = "0123456789";
        private static final String SPECIAL_CHARS = "!@#$%^&*_=+-/";

        /**
         * Method will generate random string based on the parameters
         * 
         * @param len
         *            the length of the random string
         * @param dic
         *            the dictionary used to generate the password
         * @return the random password
         */
        String dic = ALPHA_CAPS + ALPHA + NUMERIC + SPECIAL_CHARS;
        String generatePassword() {
        String result = "";
        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(dic.length());
            result += dic.charAt(index);
        }
        return result;
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ExistvoterJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        ApproveJbtn = new javax.swing.JButton();
        ViewJbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        NewvoterJTable = new javax.swing.JTable();

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setText("Existing Voters");

        ExistvoterJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Party", "Email Id", "State Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ExistvoterJTable);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setText("New Voter Request");

        ApproveJbtn.setText("Approve");
        ApproveJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApproveJbtnActionPerformed(evt);
            }
        });

        ViewJbtn.setText("View details");
        ViewJbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewJbtnActionPerformed(evt);
            }
        });

        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        backbtn.setText("<<Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        NewvoterJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Party", "Email", "State Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(NewvoterJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backbtn)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ApproveJbtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ViewJbtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deletebtn))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewJbtn)
                    .addComponent(deletebtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ApproveJbtn)
                .addGap(18, 18, 18)
                .addComponent(backbtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ApproveJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApproveJbtnActionPerformed

        int selectedRow = NewvoterJTable.getSelectedRow();
        if(selectedRow >= 0)
        {

            //Voter voter = system.getVoterDirectory().getVoterList();
            //int id12 = (Integer)NewvoterJTable.getValueAt(selectedRow, 0);
            String state_id = (String)NewvoterJTable.getValueAt(selectedRow,3);
            Voter voter = system.getVoterDirectory().getVoter(state_id);
            voter.setApproved(true);
            PasswordGenerator password = new PasswordGenerator();
            String voter_pass = password.generatePassword();
            voter.setPassword(voter_pass);
            String email_id = (String)NewvoterJTable.getValueAt(selectedRow,2);
            String name = (String)NewvoterJTable.getValueAt(selectedRow,0);
            String party = (String)NewvoterJTable.getValueAt(selectedRow,1);

            SendMail email = new SendMail();
            //Sending test email
            String to = email_id;
            String subject = "Registration Successful";
            String message =  "Username: "+voter.getPpnumber()+"\nPassword: "+voter.getPassword();

            String user = "karan4637@gmail.com";
            String pass = "4may1995";
            //email.send(to,subject, message, user, pass);
            DefaultTableModel dtm = (DefaultTableModel)ExistvoterJTable.getModel();
            dtm.setRowCount(dtm.getRowCount());

            Object[] row = new Object[dtm.getColumnCount()];
            row[0]= name;
            row[1]= party;
            row[2]= email_id;
            row[3]= state_id;

            dtm.addRow(row);
            count++;
            DefaultTableModel dtm_del = (DefaultTableModel)NewvoterJTable.getModel();
            dtm_del.removeRow(selectedRow);
            //system.getVoterDirectory().delVoter(selectedRow);
            //system.getVoterDirectory().createVoter(voter);

            //system.getVoterDirectory();
            DB4OUtil.getInstance().storeSystem(system);
        }
    }//GEN-LAST:event_ApproveJbtnActionPerformed

    private void ViewJbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewJbtnActionPerformed
        // TODO add your handling code here:

        int selectedRow = ExistvoterJTable.getSelectedRow();
        if(selectedRow >= 0){
            String state_id = (String)ExistvoterJTable.getValueAt(selectedRow,3);
            Voter voter = system.getVoterDirectory().getVoter(state_id);
            //System.out.print(voter.getName());
            ViewVoterDetailsJPanel viewvoterdetails = new ViewVoterDetailsJPanel(userProcessContainer, system, state_id);
            userProcessContainer.add("ViewVoterdetails",viewvoterdetails);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }
    }//GEN-LAST:event_ViewJbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = ExistvoterJTable.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                String del = (String) ExistvoterJTable.getValueAt(selectedRow,3);
                Voter voter = system.getVoterDirectory().getVoter(del);
                system.getVoterDirectory().deleteVoter(voter);
                populateexist();
                DB4OUtil.getInstance().storeSystem(system);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AdminWorkAreaJPanel sysAdminwjp = (AdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ApproveJbtn;
    private javax.swing.JTable ExistvoterJTable;
    private javax.swing.JTable NewvoterJTable;
    private javax.swing.JButton ViewJbtn;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
