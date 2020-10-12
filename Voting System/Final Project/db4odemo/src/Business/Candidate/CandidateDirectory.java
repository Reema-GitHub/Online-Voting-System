/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Candidate;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class CandidateDirectory {
    
    private ArrayList<Candidate> candidateList;
    private ArrayList<Candidate> candidateList1;
    private static int count = 1;

    public CandidateDirectory() {
        candidateList = new ArrayList();
        candidateList1 = new ArrayList();
    }

    public ArrayList<Candidate> getCandidateList() {
        return candidateList;
    }
    public ArrayList<Candidate> getCandidateList1() {
        return candidateList1;
    }
    
    public Candidate createCandidate(){
        Candidate candidate = new Candidate();
        candidate.setId(count);
        //candidate.setName(name);
        candidateList.add(candidate);
       // candidateList1.add(candidate);
        count++;
        return candidate;
    }
    
    public Candidate createCandidate(Candidate candidate){
        //candidate.setName(name);
        candidateList.add(candidate);
       // candidateList1.add(candidate);
        //count++;
        return candidate;
    }
    
    public void approveCandidate(Candidate candidate){
        
        candidateList.get(candidateList.indexOf(candidate)).setApproved(true);
    }
    
    public Candidate getCandidate(String id){
        for(Candidate c : candidateList)
            if(c.getPpnumber() == id)
                return c;
        return null;
    }
    
    public void delCandidate(int row){
        candidateList.remove(row);
    }
    
      public void deleteCandidate(Candidate candidate){
        candidateList1.remove(candidate);
    }
}