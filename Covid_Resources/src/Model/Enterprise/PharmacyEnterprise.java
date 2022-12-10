/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise;
import Model.Role.Role;
import Model.WorkQueue.WorkQueue;
import Model.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author srikanthchilaka
 */
public class PharmacyEnterprise extends Enterprise {
    private WorkQueue equipmentworkqueue;
    public PharmacyEnterprise(String name){
        super(name, Enterprise.EnterpriseType.Pharmacy);
        equipmentworkqueue=new WorkQueue();
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        return null;
    }
}
