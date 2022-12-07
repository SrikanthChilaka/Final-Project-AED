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
public class MedicalEquipEnterprise extends Enterprise {
    private WorkQueue equipmentworkqueue;
    public MedicalEquipEnterprise(String name){
        super(name, Enterprise.EnterpriseType.MedicalEquipmentWareHouse);
        equipmentworkqueue=new WorkQueue();
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole(){
        return null;
    }
    public WorkQueue getEquipmentworkqueue(){
        return equipmentworkqueue;
    }
    public void setEquipmentworkqueue(WorkQueue equipmentworkqueue) {
        this.equipmentworkqueue = equipmentworkqueue;
    }
}
