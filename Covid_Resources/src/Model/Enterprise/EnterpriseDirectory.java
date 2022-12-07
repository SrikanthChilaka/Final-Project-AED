/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author srikanthchilaka
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory(){
        enterpriseList = new ArrayList<>();
        
    }
    public ArrayList<Enterprise> getEnterpriseList(){
        return enterpriseList;
        
    }
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital){
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
            
        }
        else if (type == Enterprise.EnterpriseType.Supplier){
            enterprise = new SupplierEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if (type == Enterprise.EnterpriseType.Logistics){
            enterprise = new SupplierEnterprise(name);
            enterpriseList.add(enterprise);
    }
        else if (type == Enterprise.EnterpriseType.MedicalEquipmentWareHouse){
            enterprise = new MedicalEquipEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if (type==Enterprise.EnterpriseType.Pharmacy){
            enterprise=new PharmacyEnterprise(name);
            enterpriseList.add(enterprise);  
        }
        return enterprise;
    }
}