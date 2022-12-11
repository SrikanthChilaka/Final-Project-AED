/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Role.Role;
import Model.Role.Role_MedicalEquipment;
import Model.Role.Role_MedicalWaste;
import java.util.ArrayList;

/**
 *
 * @author venkat
 */
public class Organization_MedicalWaste extends Organization {
    
    public Organization_MedicalWaste() {
        super(Organization.OrganizationType.MedicalWaste.getValue());
    }
    
    
    @Override 
    public ArrayList<Role> getRole() {
        ArrayList<Role> list = new ArrayList<>();
        list.add(new Role_MedicalWaste());
        return list;
    }
}
