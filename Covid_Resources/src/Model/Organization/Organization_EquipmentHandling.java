/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Role.Role;
import Model.Role.Role_MedicalEquipment;
import java.util.ArrayList;

/**
 *
 * @author srikanthchilaka
 */
public class Organization_EquipmentHandling extends Organization {

    public Organization_EquipmentHandling() {
        super(Organization.OrganizationType.MedicalEquipment.getValue());
    }
    
    
    @Override 
    public ArrayList<Role> getRole() {
        ArrayList<Role> list = new ArrayList<>();
        list.add(new Role_MedicalEquipment());
        return list;
    }
}
