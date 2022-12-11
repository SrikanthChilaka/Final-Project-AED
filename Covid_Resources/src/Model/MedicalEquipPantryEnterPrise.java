/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Role.Role;
import Model.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author harshinichandrika
 */
public class MedicalEquipPantryEnterPrise extends EnterPrise {

    private WorkQueue equipmentQueueTask;

    public MedicalEquipPantryEnterPrise(String name) {

        super(name, EnterPrise.EntType.MedicalEquiPantry);
        equipmentQueueTask = new WorkQueue();

    }

//override
    @Override
    public ArrayList<Role> getRole() {
        return null;
    }

    public WorkQueue getEquipmentQueueTask() {
        return equipmentQueueTask;
    }

    public void setEquipmentQueueTask(WorkQueue equipmentQueueTask) {
        this.equipmentQueueTask = equipmentQueueTask;
    }

}
