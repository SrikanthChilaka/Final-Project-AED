/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author harshinichandrika
 */
public class EnterpriseRepo {
    
private ArrayList<EnterPrise> enterpRepo;


public EnterpriseRepo(){

enterpRepo = new ArrayList<>();

}

    public ArrayList<EnterPrise> getEnterpRepo() {
        return enterpRepo;
    }


  public EnterPrise AddEnterPrise(String name, EnterPrise.EntType type){
  EnterPrise enterprise = null;
 if (type == EnterPrise.EntType.Hospital){
    enterprise = new HospitalEnterPrise(name);
    enterpRepo.add(enterprise);
     }

else if (type == EnterPrise.EntType.Supplier){
 enterprise = new EnterpriseWholesale(name);
    enterpRepo.add(enterprise);

}
else if (type == EnterPrise.EntType.Logistics){
 enterprise = new EnterpriseWholesale(name);
    enterpRepo.add(enterprise);
}
else if (type == EnterPrise.EntType.MedicalEquiPantry){
 enterprise = new MedicalEquipStoreEnterPrise(name);
    enterpRepo.add(enterprise);
}
else if (type == EnterPrise.EntType.Pharmacy){
 enterprise = new Drug_Ent(name);
    enterpRepo.add(enterprise);
}

return enterprise;
}

}
