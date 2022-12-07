/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.PharmaInventory;

import java.util.ArrayList;

/**
 *
 * @author srikanthchilaka
 */
public class PharmaInventoryList {
    public ArrayList<PharmaInventory> getListOfMedicines() {
        return ListOfMedicines;
    }

    public void setListOfMedicines(ArrayList<PharmaInventory> ListOfMedicines) {
        this.ListOfMedicines = ListOfMedicines;
    }
    private ArrayList<PharmaInventory> ListOfMedicines;
    
    public PharmaInventoryList(){
        ListOfMedicines = new ArrayList<>();
    }
    public PharmaInventory addMedicine(){
        PharmaInventory phInv = new PharmaInventory();
        ListOfMedicines.add(phInv);
        return phInv;
    }
    public void removeMedicine(PharmaInventory phInv){
        ListOfMedicines.remove(phInv);
    }
}
