/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author harshinichandrika
 */
public class DoctorList {
    ArrayList<Doctor> doctr=new ArrayList<Doctor>();
    public ArrayList<Doctor> getDoctr() {
        return doctr;
    }

    public void setDoctr(ArrayList<Doctor> doctr) {
        this.doctr = doctr;
    }
    
    public Doctor addNewDoc(){
        Doctor newdoc = new Doctor();
        doctr.add(newdoc);
        return newdoc;
    }

    public void deleteDoc(Doctor selectedDoctor){
        doctr.remove(selectedDoctor);
    }
    
}
