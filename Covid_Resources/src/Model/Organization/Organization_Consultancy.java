/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Role.Role;
import Model.Role.Role_Doctor;
import Model.Role.Role_Staff;
import Model.Staff;
import java.util.ArrayList;

/**
 *
 * @author harshinichandrika
 */
public class Organization_Consultancy extends Organization {
     

private ArrayList<Staff> Sttaf_list ;

public Organization_Consultancy(){
super(Organization.OrganizationType.Staff.getValue());
   Sttaf_list =  new ArrayList();
}


 @Override
    public ArrayList<Role> getRole() {
        ArrayList<Role> list = new ArrayList<>();
        list.add(new Role_Staff());
        return list;
    }
    
}
