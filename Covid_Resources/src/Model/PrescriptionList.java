/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

import java.util.ArrayList;

/**
 *
 * @author harshinichandrika
 */
public class PrescriptionList {

    private ArrayList<DocPrescription> dpresList;

    public DocPrescription addDocPres() {
        DocPrescription dosage = new DocPrescription();
        dpresList.add(dosage);
        return dosage;

    }

    public ArrayList<DocPrescription> getDpresList() {
        return dpresList;
    }

    public void setDpresList(ArrayList<DocPrescription> dpresList) {
        this.dpresList = dpresList;
    }

}
