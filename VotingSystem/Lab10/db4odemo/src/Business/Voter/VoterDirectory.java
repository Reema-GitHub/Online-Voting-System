/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Voter;

import Business.Candidate.Candidate;
import java.util.ArrayList;


/**
 *
 * @author Aesha
 */
public class VoterDirectory {
    
    private ArrayList<Voter> voterList;
    private static int count = 1;

    public VoterDirectory() {
        voterList = new ArrayList();
    }

    public ArrayList<Voter> getVoterList() {
        return voterList;
    }
    
    public Voter createVoter(){
        Voter voter = new Voter();
        voter.setId(count);
        //candidate.setName(name);
        voterList.add(voter);
       // candidateList1.add(candidate);
        count++;
        return voter;
    }
        public void approveVoter(Voter voter){
        
        voterList.get(voterList.indexOf(voter)).setApproved(true);
    }
    
    public Voter getVoter(String id){
        for(Voter v : voterList)
            if(v.getPpnumber() == id)
                return v;
        return null;
    }
    
    public void delVoter(int row){
        voterList.remove(row);
    }
    
      public void deleteVoter(Voter voter){
        voterList.remove(voter);
    }

}
