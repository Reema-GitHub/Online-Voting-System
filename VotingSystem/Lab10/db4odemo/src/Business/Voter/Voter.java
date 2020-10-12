/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Voter;

/**
 *
 * @author Aesha
 */
public class Voter {
    private int id;
    private String Party;
    private String Name;
    private String Address;
    private String PhoneNumber;
    private String Emailid;
    private String DOB;
    private String ppnumber;
    private boolean approved;
    private String Password;

    public String getParty() {
        return Party;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setParty(String Party) {
        this.Party = Party;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
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
    
    
}
