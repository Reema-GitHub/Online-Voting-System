/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Candidate;

/**
 *
 * @author raunak
 */
public class Candidate {
    
   
    private int id;
    //private static int count = 1;
    private String Party;
    private String Name;
    private String Address;
    private String PhoneNumber;
    private String Emailid;
    private String DOB;
    private String ppnumber;
    private boolean approved;
    private String Password;
public Candidate(){
this.Party = Party;
}

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getParty() {
        return Party;
    }

    public void setParty(String Party) {
        this.Party = Party;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmailid() {
        return Emailid;
    }

    public void setEmailid(String Emailid) {
        this.Emailid = Emailid;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getPpnumber() {
        return ppnumber;
    }

    public void setPpnumber(String ppnumber) {
        this.ppnumber = ppnumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }



/*    @Override
    public String toString() {
        return Name;
    }
 */   

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
    
}
